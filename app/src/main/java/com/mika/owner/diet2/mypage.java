package com.mika.owner.diet2;

import android.content.Intent;
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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;

public class mypage extends AppCompatActivity {


 static final int REQUEST_CODE_CAMERA = 3;


    ListView listView;
    ImageView imageView7;

    ArrayList<ListContent> mPlanetTitles;
    ListView mDrawerList;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToggle;
    Toolbar mToolbar;
    CustomAdapter mCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage);


        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);


        mToolbar.setTitle(R.string.app_name);
        mToolbar.setTitleTextColor(Color.WHITE);   //Toolbarをカスタマイズする場合は、自分でTextView作成することになるので意味がないかな。今回は参考として。
        setSupportActionBar(mToolbar);


        mPlanetTitles = new ArrayList<ListContent>();
        mPlanetTitles.add(new ListContent(R.drawable.calender, "CALENDER"));
        mPlanetTitles.add(new ListContent(R.drawable.photo, "PHOTO"));
        mPlanetTitles.add(new ListContent(R.drawable.graph, "GRAPH"));

        mCustomAdapter = new CustomAdapter(this, R.layout.listview_layout, mPlanetTitles);
        mDrawerList.setAdapter(mCustomAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("test", String.valueOf(position));
                if(position == 0){
                    Intent intent = new Intent(getApplicationContext(), Calender.class);
                    startActivity(intent);
                }else if(position == 1){
                    Intent intent = new Intent(getApplicationContext(), mypage.class);
                    startActivity(intent);
                }else if(position == 2){
                    Intent intent = new Intent(getApplicationContext(), GraphTest.class);
                    startActivity(intent);
                }

            }
        });

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


        listView = (ListView) findViewById(R.id.listView);
        ArrayList<ListContent2> arrayList = new ArrayList<ListContent2>();

        arrayList.add(new ListContent2(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        arrayList.add(new ListContent2(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        arrayList.add(new ListContent2(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        arrayList.add(new ListContent2(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        arrayList.add(new ListContent2(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        CustomAdapter2 customAdapter2 = new CustomAdapter2(this, R.layout.listview_layout , arrayList);
        listView.setAdapter(customAdapter2);

    }




    public void graph(View v){
        Intent intent = new Intent(this,GraphTest.class);
        startActivity(intent);

    }

    public void photo(View v){
        Intent intent = new Intent(this,mypage.class);
        startActivity(intent);
    }

    public void calender(View v){
        Intent intent = new Intent(this,Calender.class);
        startActivity(intent);
    }

    public void camera(View v){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CODE_CAMERA);
    }
//
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);

        if(requestCode == RESULT_OK){
            if(requestCode == REQUEST_CODE_CAMERA){
                Bitmap bpm = (Bitmap) intent.getExtras().get("data");
                imageView7.setImageBitmap(bpm);

            }

        }else if (resultCode == RESULT_CANCELED){
            Toast.makeText(mypage.this, "CANCEL", Toast.LENGTH_LONG).show();
        }
    }
}
