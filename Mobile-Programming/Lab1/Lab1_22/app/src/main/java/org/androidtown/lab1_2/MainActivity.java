package org.androidtown.lab1_2;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText name;
    public Button print;
    public Button clear;
    public TextView memo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        // make a listener to button 'print'
        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memo.setText(name.getText()); // bring a string from 'name' and set it to 'memo'.
                name.setText(""); // clear the 'name'
            }
        });

        // make a listener to button 'clear'
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                memo.setText(""); // clear the 'memo'
                name.setText(""); // clear the 'name'
            }
        });
    }

    // make object of name, print, clear, memo
    public void init(){
        name = (EditText) findViewById(R.id.name);
        print = (Button) findViewById(R.id.print);
        clear = (Button) findViewById(R.id.clear);
        memo = (TextView) findViewById(R.id.memo);
    }
}