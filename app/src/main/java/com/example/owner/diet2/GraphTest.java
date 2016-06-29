package com.example.owner.diet2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.echo.holographlibrary.Line;
import com.echo.holographlibrary.LineGraph;
import com.echo.holographlibrary.LinePoint;

public class GraphTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_test);

        Line l = new Line();
        LinePoint p = new LinePoint();

        for(int i = 0; i < 31; i ++) {

           //int value = Integer.parseInt(getTag().toString());

            p.setX(i);
            //p.setY(value);
            l.addPoint(p);

            l.setColor(Color.parseColor("#9acd32"));

            LineGraph graph = (LineGraph) findViewById(R.id.graph);
            graph.addLine(l);
            graph.setRangeY(0, 10);
            graph.setLineToFill(0);

        }


    }
}
