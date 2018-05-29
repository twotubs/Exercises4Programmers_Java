package com.example.android.ex7efp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {

        //Get the age of the person's age
        EditText firstNumberField = (EditText) findViewById(R.id.length_field);
        Editable firstString = firstNumberField.getText();
        String numberOne = firstString.toString();

        //Change first integer as a string to int.  The first number is now called firstInt
        Integer firstInt = Integer.parseInt(numberOne);

        //Get the age of the person's retirement age .  note this comes in as a string and need to change to an int
        EditText secondNumberField = (EditText) findViewById(R.id.width_field);
        Editable secondString = secondNumberField.getText();
        String numberTwo = secondString.toString();

        Integer secondInt = Integer.parseInt(numberTwo);

        Integer areaOfRectangle = secondInt * firstInt;



        TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
        textViewToChange.setText("You entered dimensions of " + numberOne + " feet by " + numberTwo + " feet." +
                "\nThe area is" +
                        "\n" + areaOfRectangle + " square feet");
    }

    }
