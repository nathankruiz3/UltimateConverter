package com.nathankruiz3.ultimateconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CentimetersToInches extends AppCompatActivity {

    private EditText centimetersEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centimeters_to_inches);

        centimetersEditText = (EditText) findViewById(R.id.centimetersEditText);
        convertButton = (Button) findViewById(R.id.convertButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = .39;
                double result = 0.0;

                if (centimetersEditText.getText().toString().equals("")) {
                    Toast.makeText(CentimetersToInches.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    double enteredCentimeters = Double.parseDouble(centimetersEditText.getText().toString());
                    result = multiplier*enteredCentimeters;
                    resultTextView.setText(String.format("%.4f", result) + " inches");
                }
            }
        });
    }
}