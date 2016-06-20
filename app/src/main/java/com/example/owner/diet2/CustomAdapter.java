package com.example.owner.diet2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by owner on 16/06/20.
 */
public class CustomAdapter extends ArrayAdapter<ListContent> {

    static class ViewHolder {
        ImageView image1;
        ImageView image2;
        ImageView image3;
    }

    public CustomAdapter(Context context, int layoutId, ArrayList<ListContent> lists) {
        super(context, layoutId, lists);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;

        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_layout, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.image1 = (ImageView) convertView.findViewById(R.id.imageView1);
            viewHolder.image2 = (ImageView) convertView.findViewById(R.id.imageView2);
            viewHolder.image3 = (ImageView) convertView.findViewById(R.id.imageView3);
            convertView.setTag(viewHolder);

        }

        final ListContent listContent = getItem(position);


        viewHolder.image1.setImageResource(listContent.getResId1());
        viewHolder.image2.setImageResource(listContent.getResId2());
        viewHolder.image3.setImageResource(listContent.getResId3());


        return convertView;
    }

}
