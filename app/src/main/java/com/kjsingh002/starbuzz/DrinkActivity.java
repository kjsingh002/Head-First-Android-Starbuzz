package com.kjsingh002.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {
    final static String RECIEVE_ID = "DRINK_ID";
    private int drinkId;
    private ImageView drinkImage;
    private TextView drinkName, drinkDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        drinkImage = findViewById(R.id.dring_image);
        drinkName = findViewById(R.id.drink_name);
        drinkDescription = findViewById(R.id.drink_description);
        final Intent intent = getIntent();
        drinkId = intent.getIntExtra(RECIEVE_ID, -1);
        final Drink drink = Drink.drinks[drinkId];
        drinkImage.setImageResource(drink.getImage());
        drinkName.setText(drink.getName());
        drinkDescription.setText(drink.getDescription());
    }
}
