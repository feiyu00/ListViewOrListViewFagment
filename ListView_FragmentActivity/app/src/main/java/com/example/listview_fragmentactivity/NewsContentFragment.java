package com.example.listview_fragmentactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview_fragmentactivity.bean.News;


public class NewsContentFragment extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag, container, false);
        return view;
    }
    public void refresh(News news){
        View visibilityLayout = view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleText =view.findViewById(R.id.news_title);
        TextView newsContentText = view.findViewById(R.id.news_content);
        ImageView newsImage= view.findViewById(R.id.content_image);
        newsImage.setImageResource(news.getContentImage());
        newsTitleText.setText(news.getContentTitle());
        newsContentText.setText(news.getContent());
        //文字实现滑动
//        newsContentText.setMovementMethod(ScrollingMovementMethod.getInstance());

    }
}
