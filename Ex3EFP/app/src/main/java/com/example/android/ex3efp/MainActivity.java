package com.example.android.ex3efp;

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

        //Get user's quote
        EditText quoteField = (EditText) findViewById(R.id.quote_field);
        Editable quoteEditable = quoteField.getText();
        String quote = quoteEditable.toString();

        //Get the person that said the quote
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        TextView textViewToChange = (TextView) findViewById(R.id.quote_answer);
        textViewToChange.setText(name + " Says," + " \"" + quote + ".\"");

    }
}


