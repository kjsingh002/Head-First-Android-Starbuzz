package com.kjsingh002.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DrinkActivity extends AppCompatActivity {
    final static String RECIEVE_ID = "DRINK_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
    }
}
