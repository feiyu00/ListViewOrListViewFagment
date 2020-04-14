package com.example.listviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewactivity.bean.ListBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContentActivity extends AppCompatActivity {
    TextView tv_title,tv_content,content_date,cententCenter;
    ImageView iv_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Intent intent = getIntent();
        ListBean listBean = (ListBean) intent.getSerializableExtra("listbean");
        tv_title = findViewById(R.id.title_tv);
        iv_content = findViewById(R.id.content_iv);
        tv_content = findViewById(R.id.content_tv);
        content_date = findViewById(R.id.content_data_tv);
        cententCenter = findViewById(R.id.content_tv2);

        tv_title.setText(listBean.getContentTitle());
        iv_content.setImageResource(listBean.getContentImg());
        tv_content.setText(listBean.getContent());
        cententCenter.setText(listBean.getContentCenter());
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        final String data = sdf.format(date);
        content_date.setText("xxx  |  "+data);

    }
}
