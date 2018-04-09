package org.androidtown.lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    int imageindex=0; // flag for image change 0 - blue, 1- red.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.red); // make an object
        imageView2=(ImageView)findViewById(R.id.blue); // make an object

        Button button = (Button)findViewById(R.id.button); // make an object

        // make a listener to button 'button'
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                changeImage();
            }
        });
    }

    // change the image
    public void changeImage(){
        if(imageindex==0){ // when imageView2 is visible.
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageindex=1;
        } else{ // when imageView is visible.
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageindex=0;
        }
    }
}

