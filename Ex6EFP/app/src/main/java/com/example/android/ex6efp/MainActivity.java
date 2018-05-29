package com.example.android.ex6efp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswer(View view) {

        //Get the age of the person's age
        EditText firstNumberField = (EditText) findViewById(R.id.current_age_field);
        Editable firstString = firstNumberField.getText();
        String numberOne = firstString.toString();

        //Change first integer as a string to int.  The first number is now called firstInt
        Integer firstInt = Integer.parseInt(numberOne);

        //Get the age of the person's retirement age .  note this comes in as a string and need to change to an int
        EditText secondNumberField = (EditText) findViewById(R.id.retirement_age_field);
        Editable secondString = secondNumberField.getText();
        String numberTwo = secondString.toString();

        //Change string to int
        Integer secondInt = Integer.parseInt(numberTwo);

        SimpleDateFormat todayDateSdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar today = Calendar.getInstance();
        today.setTime(new Date());
        String todayDate = todayDateSdf.format(today.getTime());


        int yearsToRetirement = (secondInt - firstInt);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, yearsToRetirement*365); // Adding 5 days
        String output = sdf.format(c.getTime());



        TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
        textViewToChange.setText("You have " + String.valueOf(yearsToRetirement) + " yearS until you can retire " +
                "It's currently " + todayDate + " You can retire in " + output);
    }
}
