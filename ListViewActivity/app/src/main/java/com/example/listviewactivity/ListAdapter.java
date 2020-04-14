package com.example.listviewactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewactivity.bean.ListBean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ListAdapter extends BaseAdapter {
    Context context;
    List<ListBean> mDatas;
    public ListAdapter (Context context, List<ListBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        //加载控件显示内容
        //获取集合指定位置的数据
        ListBean listBean = mDatas.get(position);

        holder.tv.setText(listBean.getTitle());
        holder.iv.setImageResource(listBean.getImg());
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        final String data = sdf.format(date);
        holder.tv_data.setText("xxx  |  "+data);
        return convertView;
    }
    class ViewHolder{
        TextView tv;
        ImageView iv;
        TextView tv_data;
        public ViewHolder(View view){
            tv = view.findViewById(R.id.title_tv);
            iv = view.findViewById(R.id.title_iv);
            tv_data = view.findViewById(R.id.title_data_tv);
        }
    }
}
