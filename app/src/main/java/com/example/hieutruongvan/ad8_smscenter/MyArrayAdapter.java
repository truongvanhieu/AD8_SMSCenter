package com.example.hieutruongvan.ad8_smscenter;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hieu.truongvan on 6/7/2017.
 */

public class MyArrayAdapter extends ArrayAdapter<Field> {

    public MyArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Field> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Field field = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_config, parent, false);
        }
        TextView tvField = (TextView) convertView.findViewById(R.id.et_field);
        TextView tvType = (TextView) convertView.findViewById(R.id.et_type);

        tvField.setText(field.getFeild());
        tvType.setText(field.getType());

        return convertView;
    }
}
