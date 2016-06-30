package com.example.owner.diet2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Calender extends AppCompatActivity implements View.OnClickListener {

    TextView calorieText;
    SharedPreferences pref;

    ArrayList<ListContent> mPlanetTitles;
    ListView mDrawerList;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToggle;
    Toolbar mToolbar;
    CustomAdapter mCustomAdapter;

    TextView[] textView;
    int[] ids = {R.id.textView16, R.id.textView17, R.id.textView18, R.id.textView19, R.id.textView20, R.id.textView21, R.id.textView22,
                 R.id.textView23, R.id.textView24, R.id.textView25, R.id.textView26, R.id.textView27, R.id.textView28, R.id.textView29,
                R.id.textView30, R.id.textView31, R.id.textView32, R.id.textView33, R.id.textView34, R.id.textView35, R.id.textView36,
                R.id.textView37, R.id.textView38, R.id.textView39, R.id.textView40, R.id.textView41, R.id.textView42, R.id.textView43,
                R.id.textView44, R.id.textView45, R.id.textView46};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender);


        TextView dateText = (TextView) findViewById(R.id.date_id);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);// 0 - 11
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String date = year + "年" + (month + 1) + "月" + day + "日　";
        dateText.setText(date);
//
//        if (day % 7 == 1){
//
//        }
//
//        if (day % 7 ==2){
//            textView16 = null
//        }


        SharedPreferences pref = getSharedPreferences("weight", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        //editor.putInt("day", );
        //editor.commit();


        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);


        mToolbar.setTitle(R.string.app_name);
        mToolbar.setTitleTextColor(Color.WHITE);   //Toolbarをカスタマイズする場合は、自分でTextView作成することになるので意味がないかな。今回は参考として。
        setSupportActionBar(mToolbar);


        mPlanetTitles = new ArrayList<ListContent>();
        mPlanetTitles.add(new ListContent(R.drawable.calender, "CALENDER"));
        mPlanetTitles.add(new ListContent(R.drawable.photo,"PHOTO" ));
        mPlanetTitles.add(new ListContent(R.drawable.graph,"GRAPH" ));

        mCustomAdapter = new CustomAdapter(this, R.layout.listview_layout, mPlanetTitles);
        mDrawerList.setAdapter(mCustomAdapter);


        mDrawerToggle = new ActionBarDrawerToggle(
                this,
                mDrawerLayout,
                mToolbar,
                R.string.open,
                R.string.close
        ) {

            public void onDrawerClosed(View view) {
            }

            public void onDrawerOpened(View drawerView) {

            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }


    public void home(View v) {

        Toast.makeText(getApplicationContext(), "homeボタンが押されました", Toast.LENGTH_SHORT).show();

    }

    public void search(View v) {
        Toast.makeText(getApplicationContext(), "searchボタンが押されました", Toast.LENGTH_SHORT).show();

    }

    public void setting(View v) {
        Toast.makeText(getApplicationContext(), "settingボタンが押されました", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }


    //メニューを使ってToolbarにアイコンをつけたい場合。参考までに。
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }


    @Override
    public void onClick(View v) {

        Log.e("TAG", String.valueOf((int) ((TextView) v).getTag()));
    }

}






