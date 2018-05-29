package com.example.android.ex14efp;

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

            double taxRate = 0.00;
            String wisconsin= "WI";



//input
            //Get the principal
            EditText amountField = (EditText) findViewById(R.id.orderAmount_field);
            Editable firstString = amountField.getText();
            String amount = firstString.toString();
            Double amountReceived = Double.parseDouble(amount);

            //Get the interest rate
            EditText stateField = (EditText) findViewById(R.id.state_field);
            Editable secondString = stateField.getText();
            String stateGiven = secondString.toString();





//processing

            //The if statement
            if (stateGiven.equals(wisconsin)) {
                taxRate = 0.055;
            }

            //The math section

            double totalAmount = amountReceived * (1+taxRate);
            double taxAmount = taxRate * amountReceived;


            //Set up a decimal formatter
            DecimalFormat formatter = new DecimalFormat("0.00");
            String output1 = formatter.format(totalAmount);
            String output2 = formatter.format(taxAmount);

//The output
            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText(
                    "The subtotal is " + amountReceived +
                    "\nThe tax is " + output2 +
                    "\nThe total is " + output1);

        }
    };


}