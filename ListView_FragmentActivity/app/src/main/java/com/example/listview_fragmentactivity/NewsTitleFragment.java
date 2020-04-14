package com.example.listview_fragmentactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.listview_fragmentactivity.bean.News;
import com.example.listview_fragmentactivity.bean.XinWenUtils;
import com.inthecheesefactory.thecheeselibrary.fragment.support.v4.app.StatedFragment;

import java.util.ArrayList;
import java.util.List;

public class NewsTitleFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView newsTitleListView;
    private List<News> newsList;
    private NewsAdapter adapter;
    private boolean isTwoPane;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //传入数据
        newsList = getNews();
        //创建适配器
        adapter = new NewsAdapter(context,R.layout.news_item,newsList);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //判断是否为横竖屏
        if (getActivity().findViewById(R.id.news_content_layout)!=null){
            isTwoPane = true;
        }else {
            isTwoPane = false;
        }
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            //把布局转换为视图
            View view = inflater.inflate(R.layout.news_title_frag, container, false);
            //找到ListView布局
            newsTitleListView = view.findViewById(R.id.news_title_list_view);
            //为ListView设置适配器更换item
            newsTitleListView.setAdapter(adapter);
            //为每个item设置点击事件
            newsTitleListView.setOnItemClickListener(this);
            return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //获取List数据，你点击那个获取哪个的数据
        News news = newsList.get(position);
        //判断是否为单双页
        if (isTwoPane){
            NewsContentFragment newsContentFragment = (NewsContentFragment) getFragmentManager().findFragmentById(R.id.news_content_fragment);
            newsContentFragment.refresh(news);
            Log.d("yi","Two");
        }else{
            NewsContentActivity.actionStart(getActivity(),news);
        }
    }
    //把XinWenUtils.getAllFoodList()的数据赋值给newsList；
    private List<News> getNews() {
        return XinWenUtils.getAllFoodList();
    }
}
