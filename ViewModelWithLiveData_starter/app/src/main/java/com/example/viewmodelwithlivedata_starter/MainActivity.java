package com.example.viewmodelwithlivedata_starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView count_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count_tv = findViewById(R.id.count_textView); // Connecting the count_textView with count_tv TextView Instance
    }

    /*The Following method, when invoked, increases the value on the
     * textview by 1.*/
    public void increment(View view)
    {
        count++;                                // reducing the current value by 1
        count_tv.setText(String.valueOf(count));// Setting the value of Count on the count textview on UI.
        // String.value() - converts the type of count value from Integer to String
    }

    /*The Following method, when invoked, decreases the value on the
     * textview by 1.*/
    public void decrement(View view)
    {
        count--;                                 // reducing the current value by 1
        count_tv.setText(String.valueOf(count)); // Setting the value of Count on the count textview on UI.
        // String.value() - converts the type of count value from Integer to String
    }
}