package com.pseudolab.gridview_sdcard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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
        return 0;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    private Integer[] mThumbsIds ={
            R.drawable.sphynx_01,R.drawable.sphynx_02,R.drawable.sphynx_03,R.drawable.sphynx_04,
            R.drawable.sphynx_05,R.drawable.sphynx_06,R.drawable.sphynx_07,R.drawable.sphynx_08,
            R.drawable.sphynx_09,R.drawable.sphynx_10,R.drawable.sphynx_11,R.drawable.sphynx_12,
            R.drawable.sphynx_13,R.drawable.sphynx_14,R.drawable.sphynx_15,R.drawable.sphynx_16

    };
}
