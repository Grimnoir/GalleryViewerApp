package com.example.galleryapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MyHelper extends BaseAdapter {
Integer[] imgarr={R.drawable.chrysanthemum,R.drawable.desert,R.drawable.hydrangeas,R.drawable.jellyfish,R.drawable.koala,R.drawable.lighthouse};
	Context ctx;
@Override
	public int getCount() {
		
		return imgarr.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		ImageView iv;
		if(arg1==null)
		{
			iv=new ImageView(ctx);
			iv.setLayoutParams(new GridView.LayoutParams(90,90));
			iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
			iv.setImageResource(imgarr[arg0]);
		}
		else
			iv=(ImageView) arg1;
		return iv;
	}
public MyHelper(Context c)
{
	ctx=c;
}
}
