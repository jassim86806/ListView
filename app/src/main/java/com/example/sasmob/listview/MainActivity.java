package com.example.sasmob.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private String[] mobileOS={"Android os","IOS","Blackberry","RimOS","Sysmbian","Webos"};
    private  String [] fromArraysFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list=(ListView)findViewById(R.id.list_item);
        fromArraysFile=getResources().getStringArray(R.array.mobile_os);
        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mobileOS);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent a = new Intent(MainActivity.this,Main2Activity.class);
                a.putExtra("Key1",mobileOS[i]);
                startActivity(a);
               Toast.makeText(MainActivity.this,mobileOS[i],Toast.LENGTH_SHORT).show();
            }
        });

    }

}
