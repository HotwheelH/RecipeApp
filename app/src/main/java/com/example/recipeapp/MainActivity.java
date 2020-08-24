package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


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

/*        ListView listView = (ListView) findViewById(R.id.listView1);

        String[] values = new String[] {
                "American Pancakes", "Beans On Toast", "Poached Eggs"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //first item in listview
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), AmericanPancakes.class);
                    startActivity(intent);
                }

                //second item in listview
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), BeansOnToast.class);
                    startActivity(intent);
                }

                //third item in listview
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), PoachedEggs.class);
                    startActivity(intent);
                }
            }
        });*/
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