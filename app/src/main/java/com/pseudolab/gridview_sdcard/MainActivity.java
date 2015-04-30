package com.pseudolab.gridview_sdcard;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;


public class MainActivity extends ActionBarActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private Integer[] mThumbsIds ={
            R.drawable.sphynx_01,R.drawable.sphynx_02,R.drawable.sphynx_03,R.drawable.sphynx_04,
            R.drawable.sphynx_05,R.drawable.sphynx_06,R.drawable.sphynx_07,R.drawable.sphynx_08,
            R.drawable.sphynx_09,R.drawable.sphynx_10,R.drawable.sphynx_11,R.drawable.sphynx_12,
            R.drawable.sphynx_13,R.drawable.sphynx_14,R.drawable.sphynx_15,R.drawable.sphynx_16

    };
}
