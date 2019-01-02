package com.example.lokeshwartabjula.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtDisplay = (TextView)findViewById(R.id.txtDisplay);

        //GETTING THE INTENT OF THIS ACTIVITY
        Intent newintentobj = getIntent();

        //EXTRACTING THE BUNDLE FROM THE INTENT
        Bundle newbundle = newintentobj.getExtras();

        String name, number;

        //GETTING THE REQUIRED DATA FROM THE BUNDLE USING KEY
        name = newbundle.getString("username");
        number = newbundle.getString("usernumber");

        //PREPARING A STRING TO DISPLAY THE REQUIRED DATA
        String displayString = "Name is "+name+" number is "+number;

        //DISPLAYING THE TEXT IN TEXTVIEW
        txtDisplay.setText(displayString);



    }
}
