package com.example.raafe.gossip;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataItemAdapter extends ArrayAdapter<String> {

    ArrayList<String> items;
    LayoutInflater itemsInfalter;

    public DataItemAdapter(@NonNull Context context, @NonNull ArrayList<String> objects) {
        super(context, R.layout.list_item, objects);
        items = objects;
        itemsInfalter = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = itemsInfalter.inflate(R.layout.list_item, parent, false);
        }

        ImageView img = convertView.findViewById(R.id.imageView5);
        TextView txt = convertView.findViewById(R.id.textView5);

        txt.setText(items.get(position));
        img.setImageResource(R.drawable.male);

        return convertView;
    }

}
