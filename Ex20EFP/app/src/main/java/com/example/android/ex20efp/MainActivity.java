package com.example.android.ex20efp;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
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

//initial declarations
            String celsiusCap = "C";
            String celsius = "c";
            String output1 = "";
            Double currentTemp = 0.0;

//input

            //Get the type of temperature
            EditText typeField = (EditText) findViewById(R.id.order_field);
            Editable secondString = typeField.getText();
            String temperatureType = secondString.toString();

            //get the temperature
            EditText temperatureField = (EditText) findViewById(R.id.state_field);
            Editable firstString = temperatureField.getText();
            String temperature = firstString.toString();
            Double userTemperature = Double.parseDouble(temperature);


//processing  bmi = (weight / (height × height)) * 703

            //Button myButton = new Button(this);
            Button myButton = new Button(this);
            myButton.setText("Push Me");

            LinearLayout ll = (LinearLayout)findViewById(R.id.submit_button);
            ActionBar.LayoutParams lp = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
            ll.addView(myButton, lp);
            }


//The output
            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText(output1);

        }
    };

    //Button myButton = new Button(this);
myButton.setText("Push Me");

    LinearLayout ll = (LinearLayout)findViewById(R.id.buttonlayout);
    LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
ll.addView(myButton, lp);


}