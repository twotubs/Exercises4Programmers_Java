package com.example.android.ex5efp;

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

        //Get user's first number
        EditText firstNumberField = (EditText) findViewById(R.id.quote_field);
        Editable firstString = firstNumberField.getText();
        String numberOne = firstString.toString();

        //Change string to int
        int firstInt = Integer.parseInt(numberOne);

        //Get the second number
        EditText secondNumberField = (EditText) findViewById(R.id.name_field);
        Editable secondString = secondNumberField.getText();
        String numberTwo = secondString.toString();

        //Change string to int
        int secondInt = Integer.parseInt(numberTwo);

        int add = firstInt + secondInt;
        int subt = firstInt - secondInt;
        int mult = firstInt * secondInt;
        double div = firstInt / secondInt;


        TextView textViewToChange = (TextView) findViewById(R.id.quote_answer);
        textViewToChange.setText(numberOne + " + " + numberTwo + " is equal to " + String.valueOf(add) +"\n" +
                numberOne + " - " + numberTwo + " is equal to " + String.valueOf(subt) + "\n" +
                numberOne +" * " + numberTwo + " is equal to " + String.valueOf((mult) +"\n" +
                numberOne + " / " + numberTwo + " is equal to " + String.valueOf(div)
                ))
        ;

    }
}
