package com.anh.realestate.data.models.entities;

import java.util.ArrayList;

public class TestEntity {
    private String mName;
    private boolean mOnline;

    public TestEntity(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<TestEntity> createContactsList(int numContacts) {
        ArrayList<TestEntity> contacts = new ArrayList<TestEntity>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new TestEntity("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contacts;
    }
}