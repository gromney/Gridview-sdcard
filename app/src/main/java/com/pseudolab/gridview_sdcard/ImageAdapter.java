package com.pseudolab.gridview_sdcard;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by Geronimo on 4/30/2015.
 */
public class ImageAdapter extends BaseAdapter {
    Context _context;
    public ImageAdapter(Context context) {
        _context = context;
    }

    @Override
    public int getCount() {
        return mThumbsIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null){
            imageView = new ImageView(_context);
            imageView.setPadding(8,8,8,8);
            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(_context,ImageItem.class);
                    intent.putExtra("IMAGE_ID",mThumbsIds[position]);
                    _context.startActivity(intent);
                }
            });
        }else{
            imageView = (ImageView)convertView;
        }

        imageView.setImageResource(mThumbsIds[position]);
        return imageView;
    }

    private Integer[] mThumbsIds ={
            R.drawable.sphynx_01,R.drawable.sphynx_02,R.drawable.sphynx_03,R.drawable.sphynx_04,
            R.drawable.sphynx_05,R.drawable.sphynx_06,R.drawable.sphynx_07,R.drawable.sphynx_08,
            R.drawable.sphynx_09,R.drawable.sphynx_10,R.drawable.sphynx_11,R.drawable.sphynx_12,
            R.drawable.sphynx_13,R.drawable.sphynx_14,R.drawable.sphynx_15,R.drawable.sphynx_16

    };
}
