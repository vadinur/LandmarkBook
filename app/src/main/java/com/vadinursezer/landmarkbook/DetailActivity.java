package com.vadinursezer.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView LandmarkNameText = findViewById(R.id.LandmarkNameText);
        TextView CountryNameText = findViewById(R.id.CountryNameText);

        Intent intent = getIntent();
        String landmarkName =  intent.getStringExtra("name");
        String countryName = intent.getStringExtra("country");

        LandmarkNameText.setText(landmarkName);
        CountryNameText.setText(countryName);
        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());
    }
}
