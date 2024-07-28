package com.example.moxiesbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainCard;
    CardView desertCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersCard = findViewById(R.id.card_view_starters);
        mainCard = findViewById(R.id.card_view_main);
        desertCard = findViewById(R.id.card_view_desert);




        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startersActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this,MainCoursesActivity.class);
                startActivity(mainCoursesActivityIntent);
            }
        });

        desertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send somewhere

                Intent desertPage = new Intent(MainActivity.this, DesertActivity.class);
                startActivity(desertPage);
            }
        });



    }
}