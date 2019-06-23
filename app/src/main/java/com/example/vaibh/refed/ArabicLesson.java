package com.example.vaibh.refed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.VideoView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

public class ArabicLesson extends AppCompatActivity
{


    String lang = "";
// String constants for switch statements

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        TextView topicName = findViewById(R.id.textView3);


        // Retrieve the name of the module selected in Activity_Math
        final Intent intent = getIntent();
        final String topic = intent.getStringExtra("Topic");

        // This allows for correct formatting of arabic text within the ListViews
        final Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");

        // Setup Each topic's questions page.
        final String questions[];

        // Load the math lessons for the given module.
        //This uses a long ass switch statement for every
        //math topic in the app toload to listview with the
        //text for necessary # of questions and or videos,
        //but doesn't load the actual questions or videos
        String achievmentAdapters[]; // Will store the math lesson names.



            String question[] = {getString(R.string.video1), getString(R.string.video2), getString(R.string.video3)};
            questions = new String[question.length];
            for (int i = 0; i < question.length; i++) {
                questions[i] = question[i];
            }
            topicName.setText(topic);

        achievmentAdapters = questions;
        ListView listModules = findViewById(R.id.lvParts);


        if (lang.equals("Arabic"))
        {
            CustomAdapterAchievementsAr achievementAdapter = new CustomAdapterAchievementsAr(this, achievmentAdapters);
            listModules.setAdapter(achievementAdapter);
        }
        else
        {
            CustomAdapterAchievements achievementAdapter = new CustomAdapterAchievements(this, achievmentAdapters);
            listModules.setAdapter(achievementAdapter);
        }

        listModules.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   // A long ass switch statement that launches a question/'video's
                   //activity when it's corresponding item in listModules is clicked.
                   String topicQ = String.valueOf(parent.getItemAtPosition(position));
                   Toast.makeText(getApplicationContext(), topicQ, Toast.LENGTH_LONG).show();
                   Intent i;

                   if (topic.equals("Ba (بـ)"))
                   {
                       if (topicQ.equals(getString(R.string.video1)))
                       {
                           i = new Intent(ArabicLesson.this, ArabicVid.class);
                           i.putExtra("Lang", lang);
                           startActivity(i);
                       }
                       else if (topicQ.equals(getString(R.string.q2)))
                       {
                           i = new Intent(ArabicLesson.this, Topic1Q2.class);
                           //i.putExtra("Name", topic);
                           startActivity(i);
                       }
                       else
                       {
                           i = new Intent(ArabicLesson.this, Topic1Q3.class);
                           //i.putExtra("Name", topic);
                           startActivity(i);
                       }
                   }
                   else if (topic.equals(getString(R.string.topic2)))
                   {
                       if (topicQ.equals(getString(R.string.q1)))
                       {
                           i = new Intent(ArabicLesson.this, Topic2Q1.class);
                           startActivity(i);
                       }
                       else if (topicQ.equals(getString(R.string.q2)))
                       {
                           i = new Intent(ArabicLesson.this, Topic2Q2.class);
                           startActivity(i);
                       }
                       else
                       {
                           i = new Intent(ArabicLesson.this, Topic2Q3.class);
                           startActivity(i);
                       }
                   }

                   else
                   {
                       int o;
                   }

               }
           }
        );
    }
}