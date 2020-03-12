package com.anh.realestate.classes.viewholders;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.anh.realestate.R;

public class TestViewHolder extends RecyclerView.ViewHolder {
    public TextView nameTextView;
    public Button messageButton;

    public TestViewHolder(View itemView) {
        super(itemView);
        nameTextView = (TextView) itemView.findViewById(R.id.tvName);
        messageButton = (Button) itemView.findViewById(R.id.btClick);
    }
}
