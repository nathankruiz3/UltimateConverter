package com.nathankruiz3.ultimateconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CupsToTeaspoons extends AppCompatActivity {

    private EditText cupsEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cups_to_teaspoons);

        cupsEditText = (EditText) findViewById(R.id.cupsEditText);
        convertButton = (Button) findViewById(R.id.convertButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = 48;
                double result = 0.0;

                if (cupsEditText.getText().toString().equals("")) {
                    Toast.makeText(CupsToTeaspoons.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    double enteredCups = Double.parseDouble(cupsEditText.getText().toString());
                    result = multiplier*enteredCups;
                    resultTextView.setText(String.format("%.2f", result) + " teaspoons");
                }
            }
        });
    }
}