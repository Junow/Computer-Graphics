package org.androidtown.lab2_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    public TextView ViewUrl;
    public Button btnGo;
    public Button btnBack;
    public String passedURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ViewUrl = findViewById(R.id.editURL);               // generate TextView object from activity_main2 by ID editURL
        btnGo = (Button) findViewById(R.id.btnGO);          // generate Button object from activity_main2 by ID btnGO
        btnBack = (Button) findViewById(R.id.btnBACK);      // generate Button object from activity_main2 by ID btnBACK

        final Intent passedintent = getIntent();            // get a intent from activity come over
        Log.d("url", "after passedintent" + passedintent.getStringExtra("URL"));
        passedURL=passedintent.getStringExtra("URL");      // set a string from intent named "URL"

        ViewUrl.setText(passedURL);                                 // set a url to ViewUrl
        // generate on click listener
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // if ViewUrl has no url.
                if(!ViewUrl.getText().toString().isEmpty()){
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m."+passedURL));     // set a new intent with url.
                    Log.d("url", "in btnGo " + passedURL);
                    startActivity(intent2);                                 // go to the URL

                } else{
                    Toast.makeText(getApplicationContext(), "주소를 다시 입력해주세요", Toast.LENGTH_LONG).show(); // invalid url.
                }
            }
        });

        // generate on click listener
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "뒤로가기 버튼을 눌렀습니다.", Toast.LENGTH_LONG).show();
                finish();
            }
        });


    }
}
