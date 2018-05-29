package com.example.android.ex15efp;

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
            //Get the principal
            EditText userField = (EditText) findViewById(R.id.orderAmount_field);
            Editable firstString = userField.getText();
            String userName = firstString.toString();

            //Get the interest rate
            EditText passwordField = (EditText) findViewById(R.id.state_field);
            Editable secondString = passwordField.getText();
            String password = secondString.toString();

            String knownUser = "jcgore";
            String knownPassword = "12345";
            String output1 = " ";



//processing

            //The if statement

            if (userName.equals(knownUser)) {
            }
            if(password.equals(knownPassword)){
                output1 = "Welcome";}
            else {
                output1 = "I don't know you";
            }


//The output
            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText(output1);

        }
    };


}