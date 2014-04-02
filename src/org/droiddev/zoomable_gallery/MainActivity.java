package org.droiddev.zoomable_gallery;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

	LinearLayout imageGallery;
	TextView imageNumTv;
	LinearLayout.LayoutParams imageParams;
	
	int imageArr[]={R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,
			R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,
			R.drawable.ic_launcher, R.drawable.ic_launcher};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imageGallery=(LinearLayout)findViewById(R.id.linearImage);
		imageNumTv=(TextView)findViewById(R.id.tv_image_num);
		imageNumTv.setText("Image Number: "+2+" enlarged");
		
		for(int i=0; i<imageArr.length; i++){
			ImageView singleImage=new ImageView(MainActivity.this);
			singleImage.setBackgroundResource(imageArr[i]);
			imageGallery.addView(singleImage);
		}
		
		for(int i=0; i<imageArr.length; i++){
			ImageView setSize=(ImageView)imageGallery.getChildAt(i);
			if(i==1){
				imageParams = new LinearLayout.LayoutParams(300,300);
			}
			else{
				imageParams = new LinearLayout.LayoutParams(250,250);
			}
			setSize.setLayoutParams(imageParams);
		}
	}

}
