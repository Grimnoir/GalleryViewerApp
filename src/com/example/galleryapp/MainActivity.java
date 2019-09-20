package com.example.galleryapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {
 GridView jgvgallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jgvgallery=(GridView)findViewById(R.id.gvgallery);
        MyHelper h=new MyHelper(getApplicationContext());
        jgvgallery.setAdapter(h);
        jgvgallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
     
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast.makeText(getApplicationContext(), "You Have selected"+arg2,Toast.LENGTH_LONG).show();
				Intent i=new Intent(MainActivity.this,ImageEn.class);
				i.putExtra("Index", arg2);
				startActivity(i);
			}
		});
    }


    
}
