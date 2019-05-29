package com.example.contact_manager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.contact_manager.data.Contact;

import java.util.List;

public class MyFragment extends ListFragment {

    List<Contact> contacts;

    public MyFragment() {
    }
    // Whenever an instance of this fragment class is added to an activity, the onCreateView()
    // will be called, It will be display on the screen.
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.my_fragment, container, false);

        return rootView;
    }
}
