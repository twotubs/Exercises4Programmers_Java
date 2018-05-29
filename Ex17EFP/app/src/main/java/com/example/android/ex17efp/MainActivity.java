package com.example.android.ex17efp;

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


//input
            //Get the user's weight
            EditText weightField = (EditText) findViewById(R.id.weight_field);
            Editable firstString = weightField.getText();
            String weight = firstString.toString();
            Double userWeight = Double.parseDouble(weight);

            //Get the user's gender
            EditText genderField = (EditText) findViewById(R.id.gender_field);
            Editable secondString = genderField.getText();
            String userGender = secondString.toString();

            //Get the user's number of drinks
            EditText drinksField = (EditText) findViewById(R.id.drinks_field);
            Editable thirdString = drinksField.getText();
            String drinks = thirdString.toString();
            Double userDrinks = Double.parseDouble(drinks);

            //Get the time since last drink
            EditText timeField = (EditText) findViewById(R.id.time_field);
            Editable fourthString = timeField.getText();
            String time = fourthString.toString();
            Double userTime = Double.parseDouble(time);




//processing  BAC = (A × 5.14 / W × r) − .015 × H • A is total alcohol consumed, in ounces (oz). • W is body weight in pounds.
//• r is the alcohol distribution ratio:
//– 0.73 for men
//– 0.66 for women
//• H is number of hours since the last drink.

            double ouncesConsumed = 11.2 * userDrinks;
            double womenWeightRatio = 0.66 * userWeight;
            double menWeightRatio = 0.73 * userWeight;
            String female="f";
            String male="m";
            double BAC;
            String output1 = " ";


            //The if statement
            if (userGender.equals(female)) {
                BAC = ((ouncesConsumed * 5.14) / womenWeightRatio) - (0.015 * userTime * ouncesConsumed);
            }else {
                BAC = ((ouncesConsumed*5.14 / menWeightRatio))- (0.015 * userTime * ouncesConsumed);
            }

            if(BAC < 0.8) {
                output1 = "Your BAC is " + BAC + "\n Drive away please.";
            }else{
                output1 = "Your BAC is " + BAC + "\n It is not legal for you to drive";
            }






//The output
            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText(output1);

        }
    };


}