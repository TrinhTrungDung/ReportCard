package com.example.brucewayne.reportcard;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GradeAdapter extends ArrayAdapter<Grade> {
    public GradeAdapter(Activity context, ArrayList<Grade> grades) {
        super(context, 0, grades);
    }

    @Override @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Grade currentGrade = getItem(position);
        TextView summaryTextView = listItemView.findViewById(R.id.summary);
        summaryTextView.setText(currentGrade.toString());
        /*
        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentGrade.getName());
        TextView mathTextView = listItemView.findViewById(R.id.math);
        nameTextView.setText(String.valueOf(currentGrade.getMath()));
        */
        return listItemView;
    }
}