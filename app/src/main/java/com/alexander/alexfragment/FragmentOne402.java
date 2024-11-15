package com.alexander.alexfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentOne402 extends Fragment {

    public FragmentOne402() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one402, container, false);

        // Set up the TextView
        TextView textView = view.findViewById(R.id.alexander402_textView);
        textView.setText("Spring in my homeland mountains");

        return view;
    }
}
