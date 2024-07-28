package com.example.moxiesbar;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DesertActivity extends AppCompatActivity {

    ListView desertList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        desertList = findViewById(R.id.list_view_desert);

        DishTwo[] dishesArray = {
                new DishTwo("Chocolate Cake", "soft", 2),
                new DishTwo("Vanilla Ice Cream", "cold", 3)
        };

        ArrayAdapter desertAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dishesArray);
        desertList.setAdapter(desertAdapter);


    }
}