package com.example.administrator.mobliesafe2.chapter02.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.mobliesafe2.R;
import com.example.administrator.mobliesafe2.chapter02.entity.ContactInfo;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private List<ContactInfo> contactInfos;
    private Context context;

    public ContactAdapter(List<ContactInfo> contactInfos, Context context) {
        this.contactInfos = contactInfos;
        this.context = context;
    }

    @Override
    public int getCount() {
        //TODO Auto-generated method stub
        return contactInfos.size();
    }

    @Override
    public Object getItem(int position) {
        //TODO Auto-generated method stub
        return contactInfos.get(position);
    }

    @Override
    public long getItemId(int position) {
        //TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView==null){
            convertView = View.inflate(context, R.layout.item_list_contact_select, null);
            holder = new ViewHolder();
            holder.mNameTV = (TextView) convertView.findViewById(R.id.tv_name);
            holder.mPhoneTV = (TextView) convertView.findViewById(R.id.tv_phone);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mNameTV.setText(contactInfos.get(position).name);
        holder.mPhoneTV.setText(contactInfos.get(position).phone);
        return convertView;
    }
    class ViewHolder{
        TextView mNameTV;
        TextView mPhoneTV;
    }
}
