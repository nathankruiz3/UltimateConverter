package com.nathankruiz3.ultimateconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button
                metersToInchesButton,
                inchesToMetersButton,
                inchesToCentimetersButton,
                centimetersToInchesButton,
                cupsToTeaspoonsButton,
                teaspoonsToCupsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metersToInchesButton = (Button) findViewById(R.id.metersToInchesButton);
        inchesToMetersButton = (Button) findViewById(R.id.inchesToMetersButton);
        inchesToCentimetersButton = (Button) findViewById(R.id.inchesToCentimetersButton);
        centimetersToInchesButton = (Button) findViewById(R.id.centimetersToInchesButton);
        cupsToTeaspoonsButton = (Button) findViewById(R.id.cupsToTeaspoonsButton);
        teaspoonsToCupsButton = (Button) findViewById(R.id.teaspoonsToCupsButton);

        metersToInchesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MetersToInches.class);
                startActivity(intent);
            }
        });

        inchesToMetersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InchesToMeters.class);
                startActivity(intent);
            }
        });

        inchesToCentimetersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InchesToCentimeters.class);
                startActivity(intent);
            }
        });

        centimetersToInchesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CentimetersToInches.class);
                startActivity(intent);
            }
        });

        cupsToTeaspoonsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CupsToTeaspoons.class);
                startActivity(intent);
            }
        });

        teaspoonsToCupsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TeaspoonsToCups.class);
                startActivity(intent);
            }
        });
    }
}