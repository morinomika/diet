package com.mika.owner.diet2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListContent3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewfornavigation);

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
}
