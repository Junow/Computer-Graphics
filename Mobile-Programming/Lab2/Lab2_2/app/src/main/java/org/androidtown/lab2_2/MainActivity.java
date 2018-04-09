package org.androidtown.lab2_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public String myURL;
    public EditText editUrl;
    public Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUrl=findViewById(R.id.editURL);             // generate editText object from activity_main by Id editURL
        btnNext=findViewById(R.id.btnNEXT);             // generate Button object from activity_main by Id btnNEXT

        // generate on click listener
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myURL=editUrl.getText().toString();                     // get a url from editUrl.
//                editUrl.setText("");
                Log.d("url", myURL);
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class); // generate intent for handing URL over
                intent.putExtra("URL", myURL);                                      // put a string into intent named myURL
                Log.d("url", intent.getStringExtra("URL"));
                startActivity(intent);                                                     // start a other activity with intent.
            }
        });

    }
}
