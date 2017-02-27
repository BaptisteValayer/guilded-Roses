package com.example.redonr.myapplication;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by redonr on 09/02/17.
 */
public class MyArrayAdapter extends ArrayAdapter<Item> {


    public MyArrayAdapter(Context context, Item[] items) {
        super(context, 0,items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_view, parent, false);
        }

        ListShopViewHolder viewHolder = (ListShopViewHolder) convertView.getTag();
        if (viewHolder == null) {
            viewHolder = new ListShopViewHolder();
            viewHolder.nom = (TextView) convertView.findViewById(R.id.name);
            viewHolder.sellIn = (TextView) convertView.findViewById(R.id.sellin);
            viewHolder.quality = (TextView) convertView.findViewById(R.id.quality);
            convertView.setTag(viewHolder);
        }


        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Item item = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.nom.setText(item.getName());
        viewHolder.sellIn.setText(String.valueOf(item.getSellIn()));
        viewHolder.quality.setText(String.valueOf(item.getQuality()));

        return convertView;
    }

    public class ListShopViewHolder {
        public TextView nom;
        public TextView sellIn;
        public TextView quality;
    }
}