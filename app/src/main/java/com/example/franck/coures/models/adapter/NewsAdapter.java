package com.example.franck.coures.models.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.franck.coures.R;
import com.example.franck.coures.models.News;
import com.example.franck.coures.models.Payload;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Franck on 27.11.2017.
 */

public class NewsAdapter extends ArrayAdapter<Payload> {

    ArrayList<Payload> newsList;
    Context context;
    private LayoutInflater mInflater;

    public NewsAdapter (Context context, ArrayList<Payload> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        newsList = objects;
    }

    public Payload getItem(int position) {
        return newsList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.layout_row_view, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Payload item = getItem(position);
        Log.d("MYTAG", item.getText());
        vh.textViewNews.setText(item.getText());

        return vh.rootView;
    }

    private static class ViewHolder {
        public final RelativeLayout rootView;
        public final TextView textViewNews;

        public static ViewHolder create(RelativeLayout rootView) {
            TextView textViewNews = (TextView) rootView.findViewById(R.id.textViewNews);
            return new ViewHolder(rootView, textViewNews);
        }

        private ViewHolder(RelativeLayout rootView, TextView textViewNews) {
            this.rootView = rootView;
            this.textViewNews = textViewNews;
        }

    }



}
