package com.example.lokeshwartabjula.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DECLARING AND INITIALISING COMPONENTS
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etNumber = (EditText)findViewById(R.id.etNumber);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);

        //SETTING AN ONCLICK LISTENER TO THE SUBMIT BUTTON
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name,number;

                //GETTING INPUT FROM THE USER THROUGH EDITTEXT AND STORING IT AS STRING
                name = etName.getText().toString();
                number = etNumber.getText().toString();

                //CREATING AN INTENT TO PASS DATA TO NEXT ACTIVITY
                Intent intentobj = new Intent(MainActivity.this,Second.class);
                //CREATING A BUNDLE TO PUT MULTIPLE DATA INTO AN INTENT
                Bundle bundleobj = new Bundle();
                bundleobj.putString("username",name);
                bundleobj.putString("usernumber",number);
                //PUTTING THE BUNDLE INTO THE INTENT
                intentobj.putExtras(bundleobj);

                startActivity(intentobj);



            }
        });

    }
}
