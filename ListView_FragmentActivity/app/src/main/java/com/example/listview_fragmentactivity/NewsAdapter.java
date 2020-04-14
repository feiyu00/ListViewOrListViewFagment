package com.example.listview_fragmentactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listview_fragmentactivity.bean.News;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    int resourceId;
    public NewsAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<News> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        News news = getItem(position);
        View view;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        }else {
            view = convertView;
        }
        TextView newsTitleText = view.findViewById(R.id.news_title);
        ImageView imageView = view.findViewById(R.id.news_image);
        imageView.setImageResource(news.getTitleImage());
        newsTitleText.setText(news.getTitle());
        return view;
    }
}
