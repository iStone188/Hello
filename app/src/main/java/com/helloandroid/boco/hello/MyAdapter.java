package com.helloandroid.boco.hello;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<Bean> mDatas;

    //MyAdapter需要一个Context， 通过Context获得Layout.inflater,然后通过inflater加载item的布局
    public MyAdapter(Context context, List<Bean> datas) {
        mInflater = LayoutInflater.from(context);
        mDatas = datas;
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

    //这个方法才是重点
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_adapter_layout, null);
            viewHolder = new ViewHolder();

            viewHolder.imageView = convertView.findViewById(R.id.imageViewId);
            viewHolder.nameTextView = convertView.findViewById(R.id.nameTextViewId);
            viewHolder.sayTextView = convertView.findViewById(R.id.sayTextViewId);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        Bean bean = mDatas.get(position);
        viewHolder.nameTextView.setText(bean.getName());
        viewHolder.sayTextView.setText(bean.getPhone());

        return convertView;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView sayTextView;
    }

}
