package com.example.android.ex2efp;

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

        //Get user's input string
        EditText stringField = (EditText) findViewById(R.id.string_field);
        Editable stringEditable = stringField.getText();
        String userString = stringEditable.toString();

        //takes the string and calculates how many characters are in it.
        int length = userString.length();

        //displays user's input string and number of characters
        TextView textViewToChange = (TextView) findViewById(R.id.string_answer);
        textViewToChange.setText(userString + " has "+ length +" characters.");

    }
}


