package com.nathankruiz3.ultimateconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InchesToCentimeters extends AppCompatActivity {

    private EditText inchesEditText;
    private Button convertButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inches_to_centimeters);

        inchesEditText = (EditText) findViewById(R.id.inchesEditText);
        convertButton = (Button) findViewById(R.id.convertButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = 2.54;
                double result = 0.0;

                if (inchesEditText.getText().toString().equals("")) {
                    Toast.makeText(InchesToCentimeters.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    double enteredInches = Double.parseDouble(inchesEditText.getText().toString());
                    result = multiplier*enteredInches;
                    resultTextView.setText(String.format("%.2f", result) + " centimeters");
                }
            }
        });
    }
}