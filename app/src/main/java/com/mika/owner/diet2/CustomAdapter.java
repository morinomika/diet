package com.mika.owner.diet2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by owner on 16/06/20.
 */
public class CustomAdapter extends ArrayAdapter<ListContent> {

    static class ViewHolder {
        ImageView image1;
        TextView textView;
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
            viewHolder.textView = (TextView) convertView.findViewById(R.id.textView6);
            convertView.setTag(viewHolder);

        }

        final ListContent listContent = getItem(position);


        viewHolder.image1.setImageResource(listContent.getResId1());
        viewHolder.textView.setText(listContent.getText());


        return convertView;
    }

}
