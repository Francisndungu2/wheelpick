package com.example.wheelpick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button FindRestaurantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindRestaurantsButton = (Button)findViewById(R.id.findRestaurantsButton);
        FindRestaurantsButton.setOnClickListener(new View.OnClickListener() {

        });
    }
}