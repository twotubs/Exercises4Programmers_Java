package com.example.android.ex10efp;

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

            double taxRate = 0.055;


            //Get the first item price
            EditText firstPriceField = (EditText) findViewById(R.id.priceOne_field);
            Editable firstString = firstPriceField.getText();
            String priceOne = firstString.toString();
            Double firstPrice = Double.parseDouble(priceOne);

            //Get the first item quantity
            EditText firstQuantityField = (EditText) findViewById(R.id.quantityOne_field);
            Editable secondString = firstQuantityField.getText();
            String quantityOne = secondString.toString();
            Double firstQuantity = Double.parseDouble(quantityOne);

            //Get the SECOND item price
            EditText secondPriceField = (EditText) findViewById(R.id.priceTwo_field);
            Editable thirdString = secondPriceField.getText();
            String priceTwo = thirdString.toString();
            Double secondPrice = Double.parseDouble(priceTwo);

            //Get the second item quantity
            EditText secondQuantityField = (EditText) findViewById(R.id.quantityTwo_field);
            Editable fourthString = secondQuantityField.getText();
            String quantityTwo = fourthString.toString();
            Double secondQuantity = Double.parseDouble(quantityTwo);

            //Get the third item price
            EditText thirdPriceField = (EditText) findViewById(R.id.priceThree_field);
            Editable fifthString = thirdPriceField.getText();
            String priceThree = fifthString.toString();
            Double thirdPrice = Double.parseDouble(priceThree);

            //Get the third item quantity
            EditText thirdQuantityField = (EditText) findViewById(R.id.quantityThree_field);
            Editable sixthString = thirdQuantityField.getText();
            String quantityThree= sixthString.toString();
            Double thirdQuantity = Double.parseDouble(quantityThree);

            //The math section

            double totalPriceItemOne = firstPrice * firstQuantity;
            double totalPriceItemTwo = secondPrice * secondQuantity;
            double totalPriceItemThree = thirdPrice * thirdQuantity;
            double subTotal = totalPriceItemOne + totalPriceItemTwo + totalPriceItemThree;
            double totalTax = (subTotal) * taxRate;
            double totalBill = totalTax + subTotal;

            //Set up a decimal formater
            DecimalFormat formatter = new DecimalFormat("0.00");
            String output1 = formatter.format(totalBill);
            String output2 = formatter.format(subTotal);
            String output3 = formatter.format(totalTax);


            //The output


            TextView textViewToChange = (TextView) findViewById(R.id.answer_field);
            textViewToChange.setText("Subtotal: " + output2 +
                    "\nTax: " + output3 +
                    "\nTotal: " + output1);



        }
    };


    }