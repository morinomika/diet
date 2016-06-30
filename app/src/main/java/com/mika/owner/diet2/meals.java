package com.mika.owner.diet2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class meals extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton9;
    ImageButton imageButton10;
    ImageButton imageButton11;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton14;
    ImageButton imageButton15;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton18;
    ImageButton imageButton19;
    ImageButton imageButton20;
    ImageButton imageButton21;

    ArrayList<ListContent> mPlanetTitles;
    ListView mDrawerList;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToggle;
    Toolbar mToolbar;
    CustomAdapter mCustomAdapter;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);





        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);



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
                    Intent intent = new Intent(getApplicationContext(), meals.class);
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



    imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
        imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
        imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
        imageButton14 = (ImageButton) findViewById(R.id.imageButton14);
        imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
        imageButton16 = (ImageButton) findViewById(R.id.imageButton16);
        imageButton17 = (ImageButton) findViewById(R.id.imageButton17);
        imageButton18 = (ImageButton) findViewById(R.id.imageButton18);
        imageButton19 = (ImageButton) findViewById(R.id.imageButton19);
        imageButton20 = (ImageButton) findViewById(R.id.imageButton20);
        imageButton21 = (ImageButton) findViewById(R.id.imageButton21);



    }


    public void sun11(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 3);

    }


    public void sun22(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 4);

    }

    public void sun33(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 5);

    }

    public void mon11(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 6);

    }

    public void mon22(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 7);

    }


    public void mon33(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 8);

    }

    public void tue11(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 9);

    }
    public void tue22(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 10);

    }
    public void tue33(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 11);

    }
    public void wed11(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 12);

    }
    public void wed22(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 13);

    }
    public void wed33(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 14);

    }
    public void thu11(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 15);

    }public void thu22(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 16);

    }public void thu33(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 17);

    }
    public void fri11(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 18);

    }

    public void fri22(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 19);

    }
    public void fri33(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 20);

    }

    public void sat11(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 21);

    }
    public void sat22(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 22);

    }
    public void sat33(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 23);

    }











    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);



        if (resultCode == RESULT_OK) {
            if (requestCode == 3) {

                Bitmap bpm1 = (Bitmap) intent.getExtras().get("data");
                imageButton.setImageBitmap(bpm1);

            } else if (requestCode == 4) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton2.setImageBitmap(bpm2);
            }else if (requestCode == 5) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton3.setImageBitmap(bpm2);
            }else if (requestCode == 6) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton4.setImageBitmap(bpm2);
            }else if (requestCode == 7) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton5.setImageBitmap(bpm2);
            }else if (requestCode == 8) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton6.setImageBitmap(bpm2);
            }else if (requestCode == 9) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton7.setImageBitmap(bpm2);
            }else if (requestCode == 10) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton8.setImageBitmap(bpm2);
            }else if (requestCode == 11) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton9.setImageBitmap(bpm2);
            }else if (requestCode == 12) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton10.setImageBitmap(bpm2);
            }else if (requestCode == 13) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton11.setImageBitmap(bpm2);
            }else if (requestCode == 14) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton12.setImageBitmap(bpm2);
            }else if (requestCode == 15) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton13.setImageBitmap(bpm2);
            }else if (requestCode == 16) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton14.setImageBitmap(bpm2);
            }else if (requestCode == 17) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton15.setImageBitmap(bpm2);
            }else if (requestCode == 18) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton16.setImageBitmap(bpm2);
            }else if (requestCode == 19) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton17.setImageBitmap(bpm2);
            }else if (requestCode == 20) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton18.setImageBitmap(bpm2);
            }else if (requestCode == 21) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton19.setImageBitmap(bpm2);
            }else if (requestCode == 22) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton20.setImageBitmap(bpm2);
            }else if (requestCode == 23) {

                Bitmap bpm2 = (Bitmap) intent.getExtras().get("data");
                imageButton21.setImageBitmap(bpm2);
            }


        } else if (resultCode == RESULT_CANCELED) {

            Toast.makeText(meals.this, "CANCEL", Toast.LENGTH_LONG).show();
        }
    }

    public void graph(View v){
        Intent intent = new Intent(this,GraphTest.class);
        startActivity(intent);

    }

    public void photo(View v){
        Intent intent = new Intent(this,meals.class);
        startActivity(intent);
    }

    public void calender(View v){
        Intent intent = new Intent(this,Calender.class);
        startActivity(intent);
    }


}