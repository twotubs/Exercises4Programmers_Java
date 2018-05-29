package com.example.android.ex18efp;

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
            String celsiusCap = "C";
            String celsius = "c";
            String output1 = "";
            Double currentTemp = 0.0;




//input

            //Get the type of temperature
            EditText typeField = (EditText) findViewById(R.id.type_field);
            Editable secondString = typeField.getText();
            String temperatureType = secondString.toString();

       //get the temperature
            EditText temperatureField = (EditText) findViewById(R.id.temperature_field);
            Editable firstString = temperatureField.getText();
            String temperature = firstString.toString();
            Double userTemperature = Double.parseDouble(temperature);


//processing  C = (F − 32) × 5 / 9  OR F = (C × 9 / 5) + 32

            if(temperatureType.equals(celsius) || temperatureType.equals(celsiusCap)) {
                currentTemp = (userTemperature * 9/5)+32;
                DecimalFormat formatter = new DecimalFormat("0.00");
                String currentTemp1 = formatter.format(currentTemp);
                output1 = "The temperature in fareneheit is " + currentTemp1;


            }else {
                currentTemp = (userTemperature-32)*5/9;
                DecimalFormat formatter = new DecimalFormat("0.00");
                String currentTemp2 = formatter.format(currentTemp);
                output1 = "The temperature in celsius is " + currentTemp2;
            }


//The output
            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText(output1);

        }
    };


}