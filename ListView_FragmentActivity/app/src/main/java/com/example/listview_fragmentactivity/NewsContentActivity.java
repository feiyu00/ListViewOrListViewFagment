package com.example.listview_fragmentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.example.listview_fragmentactivity.bean.News;

public class NewsContentActivity extends AppCompatActivity {
    public static void actionStart(Context context,News news){
        Intent intent = new Intent(context,NewsContentActivity.class);
        intent.putExtra("news",news);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.news_content);
        News news = (News) getIntent().getSerializableExtra("news");
        NewsContentFragment newsContentFragment = (NewsContentFragment) getSupportFragmentManager().findFragmentById(R.id.news_content_fragment);
        newsContentFragment.refresh(news);
    }
}
