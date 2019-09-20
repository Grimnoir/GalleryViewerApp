package com.example.galleryapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageEn extends Activity {
ImageView jimageview;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.imageen);
    jimageview=(ImageView)findViewById(R.id.imageView1);
    Intent i=getIntent();
    Bundle b=i.getExtras();
    int j=b.getInt("Index");
    MyHelper h=new MyHelper(getApplicationContext());
    jimageview.setImageResource(h.imgarr[j]);
}
}
