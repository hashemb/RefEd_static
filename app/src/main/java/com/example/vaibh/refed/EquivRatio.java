package com.example.vaibh.refed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.VideoView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

public class EquivRatio extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        // Retrieve the name of the module selected in Activity_Math
        final Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        Bundle b = this.getIntent().getExtras();
        final String[] array =b.getStringArray("Array");

        // Load the math lessons for the given module.
        String achievmentAdapters[]; // Will store the math lesson names.

        final String questions[] = {"Question 1", "Question 2", "Question 3"};
        achievmentAdapters = questions;
        CustomAdapterAchievements achievementAdapter1 = new CustomAdapterAchievements(this, questions);
        CustomAdapterAchievements achievmentAdapter = new CustomAdapterAchievements(this, achievmentAdapters);

        ListView listModules = (ListView) findViewById(R.id.lvParts);
        VideoView vvIntro = findViewById(R.id.vvIntro);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.ratiosandpropotions);
        vvIntro.setVideoPath(uri.toString());
        vvIntro.requestFocus();
        vvIntro.start();

        listModules.setAdapter(achievmentAdapter);

        listModules.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String module = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(getApplicationContext(),module,Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),EquivRatio.class);
                i.putExtra("Name",array[position]);
                startActivity(i);
            }
        });
    }



    @Override protected void onResume()
    {
        super.onResume();
        VideoView vvIntro = findViewById(R.id.vvIntro);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.math1ratios_intro);
        vvIntro.setVideoPath(uri.toString());
        vvIntro.requestFocus();
        vvIntro.start();

    }
}

