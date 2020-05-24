package com.kjsingh002.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class DrinksCategoryActivity extends AppCompatActivity {
    private ListView drinksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_category);
        drinksList = findViewById(R.id.list_of_drinks);
    }
}
