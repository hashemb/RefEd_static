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
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

public class ArabicLesson extends AppCompatActivity
{


    String lang = "";
    Uri uri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = getIntent();
        final String name = intent.getStringExtra("Topic");
        super.onCreate(savedInstanceState);


        setContentView(R.layout.arabic_lesson);


        // This allows for correct formatting of arabic text within the ListViews
        final Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");


        // Retrieve the name of the module selected in Activity_Math
        final String topics[];

        // Set the page heading text with the selected module's name
        TextView topicName = findViewById(R.id.textView3);
        topicName.setText(name);


        String achievmentAdapters[]; // Will store the math lesson names.

            final String arabic[] = {getString(R.string.video1), getString(R.string.video2), getString(R.string.video3)};
            topics = new String[arabic.length];
            for (int i = 0; i < arabic.length; i++) {
                topics[i] = arabic[i];
            }
            achievmentAdapters = topics;


        ListView listModules = findViewById(R.id.lvParts);
        CustomAdapterAchievements achievementAdapter = new CustomAdapterAchievements(this, achievmentAdapters);
        listModules.setAdapter(achievementAdapter);

        listModules.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),topics[position], Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),ArabicVid.class);
                i.putExtra("Topic", topics[position]);
                i.putExtra("Name", name);
                i.putExtra("Lang", lang);
                startActivity(i);
            }
        });
    }




}
