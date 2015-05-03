package com.pseudolab.gridview_sdcard;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by Geronimo on 4/30/2015.
 */
public class ImageItem extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_item);
        Bundle bundle = getIntent().getExtras();
//        int imageId = bundle.getInt("IMAGE_ID");
        String imageId = bundle.getString("IMAGE_ID");
        Uri url = Uri.parse(imageId);
        ImageView imageView = (ImageView) findViewById(R.id.image);
//        imageView.setImageResource(imageId);
        imageView.setImageURI(url);
    }
}
