package org.androidtown.lab2_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public String name;
    public String age;
    public EditText EditName;
    public EditText EditAge;
    public Button BtnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditName=(EditText) findViewById(R.id.editName);    // get EditName from activity_main
        EditAge=(EditText) findViewById(R.id.editAge);      // get EditAge from activity_main
        BtnAdd=(Button) findViewById(R.id.btnAdd);          // get BtnAdd from activity_main

        // generate onClickListener
        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = EditName.getText().toString();   // get a string from EditName
                age = EditAge.getText().toString();     // get a string from EditAge
                EditName.setText("");
                EditAge.setText("");
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class); // generate intent
                intent.putExtra("loginName", name);     // set a string name named "loginName"
                intent.putExtra("loginAge", age);       // set a string age named "loginAge"
                startActivity(intent);                          // start another Activity by sending intent

            }
        });


    }
}
