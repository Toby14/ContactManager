package com.example.contact_manager.data;

import android.os.Bundle;

public class Contact {
    public static final String PERSON_NAME = "pName";
    public static final String IMAGE_RESOURCE = "imageResource";
    public static final String PERSON_ADDR = "pAddress";
    public static final String PERSON_PHONE = "pPhone";

    // Private fields
    private String pName;
    private int imageResource;
    private String pAddress;
    private String pPhone;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone;
    }

    // Used when creating data object
    public Contact(String id, int imageResource, String pAddress, String pPhone) {
        this.pName = id;
        this.imageResource = imageResource;
        this.pAddress = pAddress;
        this.pPhone = pPhone;
    }

    // Create from a bundle
    public Contact(Bundle b) {
        if (b != null) {
            this.pName = b.getString(PERSON_NAME);
            this.imageResource = b.getInt(IMAGE_RESOURCE);
            this.pAddress = b.getString(PERSON_ADDR);
            this.pPhone = b.getString(PERSON_PHONE);
        }
    }

    // Package data for transfer between activities
    public Bundle toBundle() {
        Bundle b = new Bundle();
        b.putString(PERSON_NAME, this.pName);
        b.putInt(IMAGE_RESOURCE, this.imageResource);
        b.putString(PERSON_ADDR, this.pAddress);
        b.putString(PERSON_PHONE, this.pPhone);

        return b;
    }


    // Output contact data
    @Override
    public String toString() {
        return pName;
    }



}
