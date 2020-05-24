package com.kjsingh002.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DrinksCategoryActivity extends AppCompatActivity {
    private ListView drinksList;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_category);
        drinksList = findViewById(R.id.list_of_drinks);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,Drink.drinks);
        drinksList.setAdapter(arrayAdapter);
        drinksList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent = new Intent(DrinksCategoryActivity.this,DrinkActivity.class);
                intent.putExtra(DrinkActivity.RECIEVE_ID,(int) id);
                startActivity(intent);
            }
        });
    }
}
