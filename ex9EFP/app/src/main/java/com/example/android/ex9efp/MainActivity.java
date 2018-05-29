package com.example.android.ex9efp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


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

            //number of slices per pizza
            double gallonOfPaint = 350;


            //Get the age of the person's age
            EditText firstNumberField = (EditText) findViewById(R.id.square_feet_field);
            Editable firstString = firstNumberField.getText();
            String numberOne = firstString.toString();

            //Change first integer as a string to int.  The first number is now called firstInt
            Integer firstInt = Integer.parseInt(numberOne);

            /*Get the age of the person's retirement age .  note this comes in as a string and need to change to an int
            EditText secondNumberField = (EditText) findViewById(R.id.pizza_field);
            Editable secondString = secondNumberField.getText();
            String numberTwo = secondString.toString();

            Integer secondInt = Integer.parseInt(numberTwo);

            */

            //round up the number of gallons to a higher digit.
            double numberOfGallons = Math.ceil((firstInt) / gallonOfPaint);


            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText("You will need to purchase " + numberOfGallons + " gallons of paint to cover " +
                    "\n" + firstInt +" square feet");
        }
    };

}