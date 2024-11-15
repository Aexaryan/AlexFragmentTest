package com.alexander.alexfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button buttonFragmentOne, buttonFragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFragmentOne = findViewById(R.id.alexander402_buttonFragmentOne);
        buttonFragmentTwo = findViewById(R.id.alexander402_buttonFragmentTwo);

        // Load FragmentOne by default
        loadFragment(new FragmentOne402());

        // Button to load Fragment One
        buttonFragmentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentOne402());
            }
        });

        // Button to load Fragment Two
        buttonFragmentTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentTwo402());
            }
        });
    }

    // Method to load a fragment
    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.alexander402_fragmentContainer, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
