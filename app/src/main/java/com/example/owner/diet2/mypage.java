package com.example.owner.diet2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class mypage extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage);

       listView = (ListView) findViewById(R.id.listView);
        ArrayList<ListContent2> arrayList = new ArrayList<>();
        arrayList.add(new ListContent(R.drawable. , ));
        arrayList.add(new ListContent(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        arrayList.add(new ListContent(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        arrayList.add(new ListContent(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        arrayList.add(new ListContent(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        arrayList.add(new ListContent(R.drawable.food1 , R.drawable.food2 , R.drawable.food3));
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.listview_layout , arrayList);
        listView.setAdapter(customAdapter);

    }
}
