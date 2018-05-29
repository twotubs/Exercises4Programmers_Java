package com.example.android.ex11efp;

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


            //Get the first item price
            EditText euroField = (EditText) findViewById(R.id.euro_field);
            Editable firstString = euroField.getText();
            String euroAmount = firstString.toString();
            Double euroReceived = Double.parseDouble(euroAmount);

            //Get the first item quantity
            EditText exchangeRate = (EditText) findViewById(R.id.exchangeRate_field);
            Editable secondString = exchangeRate.getText();
            String quantityOne = secondString.toString();
            Double exchangeRateGiven = Double.parseDouble(quantityOne);


            //The math section
            double usdAmount = euroReceived * exchangeRateGiven;



            //Set up a decimal formatter
            DecimalFormat formatter = new DecimalFormat("0.00");
            String output1 = formatter.format(usdAmount);



            //The output
            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText( euroReceived + " euros received at an exchange rate of " + exchangeRateGiven + " is " +
                    "\n " + output1);



        }
    };


}