package com.example.sasmob.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ImageView image = (ImageView) findViewById(R.id.image);
        TextView text = (TextView) findViewById(R.id.textView);

        Intent i = getIntent();
        String value = i.getStringExtra("Key1");
        switch (value) {
            case "Android os":
                image.setImageResource(R.drawable.os1);
                text.setText(R.string.Android);
                break;
            case "IOS":
                image.setImageResource(R.drawable.ios);
                text.setText(R.string.iOS);
                break;

            case "Blackberry":
                image.setImageResource(R.drawable.black);
                text.setText(R.string.BlackBerry);
                break;
            case "RimOS":
                image.setImageResource(R.drawable.rim);
                text.setText(R.string.Rimos);
                break;


            case "Sysmbian":
                image.setImageResource(R.drawable.sym);
                text.setText(R.string.Symbian);
                break;

            case "Webos":
                image.setImageResource(R.drawable.webos);
                text.setText(R.string.Webos);
                break;


        }
    }
}
