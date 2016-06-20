package com.example.owner.diet2;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView15;
    TextView textView7;
    TextView textView1;

    TextView[] textView;
    int[] ids = {R.id.textView16,R.id.textView17,R.id.textView18,R.id.textView19,R.id.textView20,R.id.textView21,R.id.textView22,
                 R.id.textView23,R.id.textView24,R.id.textView25,R.id.textView26,R.id.textView27,R.id.textView28,R.id.textView29,
                 R.id.textView30,R.id.textView31,R.id.textView32,R.id.textView33,R.id.textView34,R.id.textView35,R.id.textView36,
                 R.id.textView37,R.id.textView38,R.id.textView39,R.id.textView40,R.id.textView41,R.id.textView42,R.id.textView43,
                 R.id.textView44,R.id.textView45,R.id.textView46  };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender);

        textView = new TextView[31];


        for (int i = 0; i < 31; i++) {

            textView[i] = (TextView) findViewById(ids[i]);
            textView[i].setTag(i + 1);
            textView[i].setOnClickListener(this);

        }
    }




    @Override
    public void onClick(View v){

        Log.e("TAG", String.valueOf((int) ((TextView)v).getTag()));

    }



}

