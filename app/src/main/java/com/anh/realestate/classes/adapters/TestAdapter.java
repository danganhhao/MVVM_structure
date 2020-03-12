package com.anh.realestate.classes.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anh.realestate.R;
import com.anh.realestate.classes.viewholders.TestViewHolder;
import com.anh.realestate.data.models.entities.TestEntity;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestViewHolder> {

    private List<TestEntity> mContacts;

    public TestAdapter(List<TestEntity> contacts) {
        mContacts = contacts;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_recyclerview_test, parent, false);

        // Return a new holder instance
        TestViewHolder viewHolder = new TestViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder viewHolder, int position) {
        // Get the data model based on position
        TestEntity contact = mContacts.get(position);

        // Set item views based on your views and data model
        TextView textView = viewHolder.nameTextView;
        textView.setText(contact.getName());
        Button button = viewHolder.messageButton;
        button.setText(contact.isOnline() ? "Message" : "Offline");
        button.setEnabled(contact.isOnline());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
