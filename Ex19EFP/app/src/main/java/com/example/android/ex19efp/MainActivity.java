package com.example.android.ex19efp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Capture our button from layout
        Button button = (Button)findViewById(R.id.submit_button);
        // Register the onClick listener with the implementation above
        button.setOnClickListener(mButtonListener);

    }

    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener mButtonListener = new View.OnClickListener() {

        public void onClick(View v) {

//initial declarations
            double bMi;

//input

            //Get the type of temperature
            EditText heightField = (EditText) findViewById(R.id.height_field);
            Editable secondString = heightField.getText();
            String height = secondString.toString();
            Double userHeight = Double.parseDouble(height);

            //get the temperature
            EditText weightField = (EditText) findViewById(R.id.weight_field);
            Editable firstString = weightField.getText();
            String weight = firstString.toString();
            Double userWeight = Double.parseDouble(weight);


//processing  bmi = (weight / (height × height)) * 703

            bMi = (userWeight/(userHeight*userHeight)*703);
            String output1 = "";

            // Check BMI and create output.
            if(bMi <= 18.5) {
                DecimalFormat formatter = new DecimalFormat("0.00");
                String bMiFormatted = formatter.format(bMi);
                output1 = "Your BMI is" + bMiFormatted + " You are underweight.  You should see your doctor.";
            } else if(bMi >= 25) {
                DecimalFormat formatter = new DecimalFormat("0.00");
                String bmiFormatted = formatter.format(bMi);
                output1 = "Your BMI is " + bmiFormatted + " You are overweight.  You should see your doctor.";
            } else {
                DecimalFormat formatter = new DecimalFormat("0.00");
                String bMiFormatted = formatter.format(bMi);
                output1 = "Your BMI is " + bMiFormatted + " You are within the ideal weight range.";
            }


//The output
            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText(output1);

        }
    };


}