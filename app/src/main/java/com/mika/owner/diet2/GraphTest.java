package com.mika.owner.diet2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.echo.holographlibrary.Line;
import com.echo.holographlibrary.LineGraph;
import com.echo.holographlibrary.LinePoint;

import java.util.ArrayList;

public class GraphTest extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_test);


        Line l = new Line();

        for (int i = 0; i < 31; i++) {

            SharedPreferences pref = getSharedPreferences("weight", Context.MODE_PRIVATE);
            String value = pref.getString(String.valueOf(i + 1), "");
            Log.e(String.valueOf(i),value);

            if (!value.equals("")) {

                LinePoint p = new LinePoint();
                p.setX(i);
                p.setY(Integer.parseInt(value));
                l.addPoint(p);
            }
        }


        l.setColor(Color.parseColor("#9acd32"));

        LineGraph graph = (LineGraph) findViewById(R.id.graph);
        graph.addLine(l);
        graph.setRangeY(0, 100);
        graph.setLineToFill(0);

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
