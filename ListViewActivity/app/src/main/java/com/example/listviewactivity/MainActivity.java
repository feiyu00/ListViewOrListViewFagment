package com.example.listviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listviewactivity.bean.ListBean;
import com.example.listviewactivity.bean.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListBean> mDatas;
    List<ListBean> allList;
    ListView showLv;
    ListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showLv = findViewById(R.id.list);
        //获取数据的list
        mDatas = new ArrayList<>();
        allList = ListUtils.getAllList();
        mDatas.addAll(allList);
        //创建适配器
        adapter = new ListAdapter(this,mDatas);
        showLv.setAdapter(adapter);
        setListener();
    }

    private void setListener() {
        showLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //parent 表示指向的是哪一个适配器，view 视图 position是item的位置，id是总共有多少item
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListBean listBean = mDatas.get(position);
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                intent.putExtra("listbean",listBean);
                startActivity(intent);
            }
        });
    }

}
