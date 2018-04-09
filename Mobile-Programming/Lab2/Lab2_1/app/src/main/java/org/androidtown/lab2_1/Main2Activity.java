package org.androidtown.lab2_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    public Button close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        close=(Button) findViewById(R.id.btnClose);     // get close button from activity_main2

        Intent intent = getIntent(); // generate intent from MainActivity
        //if the intent has something
        if(intent!=null){
            String name = intent.getStringExtra("loginName"); // get a string named "loginName" from intent
            String age = intent.getStringExtra("loginAge"); // get a string named "loginAge" from intent
            Toast.makeText(getApplicationContext(), "Name : " + name + " Age : " + age,Toast.LENGTH_LONG).show(); // show name and age
        }

        //generate onClickListener
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // finish this activity
            }
        });
    }
}
