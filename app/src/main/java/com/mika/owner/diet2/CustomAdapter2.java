package com.mika.owner.diet2;

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
public class CustomAdapter2 extends ArrayAdapter<ListContent2> {

    static class ViewHolder {
        ImageView image2;
        ImageView image3;
        ImageView image4;

    }

    public CustomAdapter2(Context context, int layoutId, ArrayList<ListContent2> lists) {
        super(context, layoutId, lists);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;

        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_content2, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.image2 = (ImageView) convertView.findViewById(R.id.imageView7);
            viewHolder.image3 = (ImageView) convertView.findViewById(R.id.imageView8);
            viewHolder.image4 = (ImageView) convertView.findViewById(R.id.imageView9);

            convertView.setTag(viewHolder);

        }

        final ListContent2 listContent2 = getItem(position);


        viewHolder.image2.setImageResource(listContent2.getResId2());
        viewHolder.image3.setImageResource(listContent2.getResId3());
        viewHolder.image4.setImageResource(listContent2.getResId4());


        return convertView;
    }

}
