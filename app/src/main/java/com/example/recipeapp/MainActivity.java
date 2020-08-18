package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class  MainActivity extends AppCompatActivity {

    private Button breakfastButton;
    private Button lunchButton;
    private Button dinnerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        breakfastButton = findViewById(R.id.breakfastButton);
        breakfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityTwo();
            }
        });

        lunchButton = findViewById(R.id.lunchButton);
        lunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivityThree();
            }
        });

        dinnerButton = findViewById(R.id.dinnerButton);
        dinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivityFour();
            }
        });
    }

    private void moveToActivityTwo() {
        Intent intent = new Intent(MainActivity.this, BreakfastActivity.class);
        startActivity(intent);
    }

    private void moveToActivityThree() {
        Intent intent = new Intent(MainActivity.this, LunchActivity.class);
        startActivity(intent);
    }

    private void moveToActivityFour() {
        Intent intent = new Intent(MainActivity.this, DinnerActivity.class);
        startActivity(intent);
    }
}