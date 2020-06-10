package com.nathankruiz3.ultimateconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MetersToInches extends AppCompatActivity {

    private EditText metersEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meters_to_inches);

        metersEditText = (EditText) findViewById(R.id.metersEditText);
        convertButton = (Button) findViewById(R.id.convertButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = 39.37;
                double result = 0.0;

                if (metersEditText.getText().toString().equals("")) {
                    Toast.makeText(MetersToInches.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    double enteredMeters = Double.parseDouble(metersEditText.getText().toString());
                    result = multiplier*enteredMeters;
                    resultTextView.setText(String.format("%.2f", result) + " inches");
                }
            }
        });
    }
}