package com.example.vaibh.refed;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapterAchievementsAr extends ArrayAdapter<String>{
    public CustomAdapterAchievementsAr(@NonNull Context context,String [] completedModules) {
        super(context,R.layout.customachievementsar, completedModules);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater achievementInflator = LayoutInflater.from(getContext());
        View customView = achievementInflator.inflate(R.layout.customachievementsar, parent, false);

        String modName = getItem(position);

        TextView moduleName = (TextView) customView.findViewById(R.id.txtModuleName2);
        ImageView imgBadge = (ImageView) customView.findViewById(R.id.imgBadge2);

        moduleName.setText(modName);
        imgBadge.setImageResource(R.drawable.book);

        return customView;
    }
}
