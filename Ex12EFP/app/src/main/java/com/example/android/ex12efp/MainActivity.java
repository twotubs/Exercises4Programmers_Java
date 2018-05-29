package com.example.android.ex12efp;

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


            //Get the principal
            EditText principalField = (EditText) findViewById(R.id.principal_field);
            Editable firstString = principalField.getText();
            String principalAmount = firstString.toString();
            Double principalReceived = Double.parseDouble(principalAmount);

            //Get the interest rate
            EditText interestField = (EditText) findViewById(R.id.interest_field);
            Editable secondString = interestField.getText();
            String quantityOne = secondString.toString();
            Double interestAmount = Double.parseDouble(quantityOne);


            //Get the number of years
            EditText yearField = (EditText) findViewById(R.id.year_field);
            Editable thirdString = yearField.getText();
            String quantityTwo = thirdString.toString();
            Double yearAmount = Double.parseDouble(quantityTwo);


            //The math section
            double investmentReturn = principalReceived * (1+((interestAmount/100)*yearAmount));


            //Set up a decimal formatter
            DecimalFormat formatter = new DecimalFormat("0.00");
            String output1 = formatter.format(investmentReturn);



            //The output


            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText( "After " + yearAmount + " at an interest rate of  " + interestAmount + " you will have " +
                    "\n " + output1);



        }
    };


}