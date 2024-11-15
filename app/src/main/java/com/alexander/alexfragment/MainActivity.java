package com.alexander.alexfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button buttonFragmentOne, buttonFragmentTwo, buttonFragmentThree, buttonFragmentFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the buttons
        buttonFragmentOne = findViewById(R.id.alexander402_buttonFragmentOne);
        buttonFragmentTwo = findViewById(R.id.alexander402_buttonFragmentTwo);
        buttonFragmentThree = findViewById(R.id.alexander402_buttonFragmentThree);
        buttonFragmentFour = findViewById(R.id.alexander402_buttonFragmentFour);

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

        // Button to load Fragment Three
        buttonFragmentThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentThree402());
            }
        });

        // Button to load Fragment Four
        buttonFragmentFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentFour402());
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
