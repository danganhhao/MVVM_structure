package com.anh.realestate.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anh.realestate.R;
import com.anh.realestate.classes.adapters.TestAdapter;
import com.anh.realestate.data.models.entities.TestEntity;
import com.anh.realestate.data.repositories.TestRepository;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TestRepository.getInstance().getList();
//        // Lookup the recyclerview in activity layout
//        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvTest);
//
//        // Initialize contacts
//        ArrayList<TestEntity> contacts = TestEntity.createContactsList(20);
//        // Create adapter passing in the sample user data
//        TestAdapter adapter = new TestAdapter(contacts);
//        // Attach the adapter to the recyclerview to populate items
//        rvContacts.setAdapter(adapter);
//        // Set layout manager to position the items
//        rvContacts.setLayoutManager(new LinearLayoutManager(this));
//        // That's all!

    }
}
