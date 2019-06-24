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

public class MathModule1_Part1 extends AppCompatActivity
{


        String lang = "";
        Uri uri;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            final Intent intent = getIntent();
            final String name = intent.getStringExtra("Name");
            super.onCreate(savedInstanceState);

            if (name.equals(getString(R.string.arabic)))
            {
                setContentView(R.layout.arabic_lesson);
            } else
            {
                setContentView(R.layout.activity_math_module1__part1);
            }


            // This allows for correct formatting of arabic text within the ListViews
            final Intent intent1 = getIntent();
            lang = intent1.getStringExtra("Lang");


            // Retrieve the name of the module selected in Activity_Math
            final String topics[];

            // Set the page heading text with the selected module's name
            TextView topicName = findViewById(R.id.textView3);
            topicName.setText(name);

            // Storing string resources in variables.
            String mod1 = getString(R.string.mod1);
            String mod2 = getString(R.string.mod2);
            String mod3 = getString(R.string.mod3);
            String mod4 = getString(R.string.mod4);
            String mod5 = getString(R.string.mod5);
            String mod6 = getString(R.string.arabic);

            String topic1 = getString(R.string.topic1);
            String topic2 = getString(R.string.topic2);
            String topic3 = getString(R.string.topic3);
            String topic4 = getString(R.string.topic4);
            String topic5 = getString(R.string.topic5);
            String topic6 = getString(R.string.topic6);
            String topic7 = getString(R.string.topic7);
            String topic8 = getString(R.string.topic8);
            String topic9 = getString(R.string.topic9);
            String topic10 = getString(R.string.topic10);
            String topic11 = getString(R.string.topic11);
            String topic12 = getString(R.string.topic12);
            String topic13 = getString(R.string.topic13);
            String topic14 = getString(R.string.topic14);
            String topic15 = getString(R.string.topic15);
            String topic16 = getString(R.string.topic16);
            String topic17 = getString(R.string.topic17);
            String topic18 = getString(R.string.topic18);
            String topic19 = getString(R.string.topic19);
            String topic20 = getString(R.string.topic20);
            String topic21 = getString(R.string.topic21);
            String topic22 = getString(R.string.topic22);
            String topic23 = getString(R.string.topic23);
            String topic24 = getString(R.string.topic24);
            String topic25 = getString(R.string.topic25);
            String topic26 = getString(R.string.topic26);
            String topic27 = getString(R.string.topic27);
            String topic28 = getString(R.string.topic28);
            String topic29 = getString(R.string.topic29);
            String topic30 = getString(R.string.topic30);
            String topic31 = getString(R.string.topic31);
            String topic32 = getString(R.string.topic32);
            String topic33 = getString(R.string.topic33);
            String topic34 = getString(R.string.topic34);
            String topic35 = getString(R.string.topic35);
            String topic36 = getString(R.string.topic36);
            String topic37 = getString(R.string.topic37);
            String topic38 = getString(R.string.topic38);
            String topic39 = getString(R.string.topic39);
            String topic40 = getString(R.string.topic40);
            String topic41 = getString(R.string.topic41);
            String topic42 = getString(R.string.topic42);
            String topic43 = getString(R.string.topic43);
            String topic44 = getString(R.string.topic44);
            String topic45 = getString(R.string.topic45);
            String topic46 = getString(R.string.topic46);
            String topic47 = getString(R.string.topic47);
            String topic48 = getString(R.string.topic48);
            String topic49 = getString(R.string.topic49);
            String topic50 = getString(R.string.topic50);
            String topic51 = getString(R.string.topic51);
            String topic52 = getString(R.string.topic52);
            String topic52b = getString(R.string.topic52b);
            String topic52c = getString(R.string.topic52c);
            String topic53 = getString(R.string.topic53);
            String topic53b = getString(R.string.topic53b);
            String topic54 = getString(R.string.topic54);
            String topic55 = getString(R.string.topic55);
            String topic56 = getString(R.string.topic56);
            String topic57 = getString(R.string.topic57);
            String topic58 = getString(R.string.topic58);
            String topic59 = getString(R.string.topic59);
            String topic60 = getString(R.string.topic60);
            String topic61 = getString(R.string.topic61);
            String topic62 = getString(R.string.topic62);
            String topic63 = getString(R.string.topic63);
            String topic64 = getString(R.string.topic64);
            String topic65 = getString(R.string.topic65);
            String topic66 = getString(R.string.topic66);
            String topic67 = getString(R.string.topic67);
            String topic68 = getString(R.string.topic68);
            String topic69 = getString(R.string.topic69);
            String topic70 = getString(R.string.topic70);
            String topic71 = getString(R.string.topic71);
            String topic72 = getString(R.string.topic72);
            String topic73 = getString(R.string.topic73);

            String achievmentAdapters[]; // Will store the math lesson names.

                if (name.equals(mod1))
                {
                    final String ratios[] = {topic1, topic2, topic3, topic4, topic5, topic6, topic7,
                        topic8, topic9, topic10, topic11, topic12,};
                    topics = new String[ratios.length];
                    for (int i = 0; i < ratios.length; i++) {
                        topics[i] = ratios[i];
                    }
                    achievmentAdapters = topics;
                    if (lang.equals("Arabic"))
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ratiosandproportions_ar);
                    }
                    else
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ratiosandproportions);
                    }
                }
                else if (name.equals(mod2)) {
                    final String numbers[] = {topic13, topic14, topic15, topic16, topic17,
                            topic18, topic19, topic20, topic21, topic22, topic23, topic24,
                            topic25, topic26};
                    topics = new String[numbers.length];
                    for (int i = 0; i < numbers.length; i++) {
                        topics[i] = numbers[i];
                    }
                    achievmentAdapters = topics;
                    if (lang.equals("Arabic"))
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ar_intro_part2);
                    }
                    else
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro_part2);
                    }
                }
                else if (name.equals(mod3)) {
                    final String expressions[] = {topic27, topic28, topic29, topic30, topic31, topic32, topic33,
                            topic34, topic35, topic36, topic37, topic38, topic39, topic40, topic41, topic42};
                    topics = new String[expressions.length];
                    for (int i = 0; i < expressions.length; i++) {
                        topics[i] = expressions[i];
                    }
                    achievmentAdapters = topics;
                    if (lang.equals("Arabic"))
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ar_intro_part3);
                    }
                    else
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro_part3);
                    }
                } else if (name.equals(mod4)) {
                    final String geometry[] = { topic43, topic44, topic45, topic46, topic47, topic48, topic49,
                            topic50, topic51, topic52, topic52b, topic52c, topic53, topic53b,topic54,
                            topic55, topic56, topic57, topic58};
                    topics = new String[geometry.length];
                    for (int i = 0; i < geometry.length; i++) {
                        topics[i] = geometry[i];
                    }
                    achievmentAdapters = topics;
                    if (lang.equals("Arabic"))
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ar_intro_part4);
                    }
                    else
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro_part4);
                    }
                } else if (name.equals(mod5)) {
                    final String statistics[] = {topic59, topic60, topic61, topic62, topic63, topic64, topic65,
                            topic66, topic67, topic68, topic69, topic70, topic71, topic72, topic73};
                    topics = new String[statistics.length];
                    for (int i = 0; i < statistics.length; i++) {
                        topics[i] = statistics[i];
                    }
                    achievmentAdapters = topics;
                    if (lang.equals("Arabic"))
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ar_intro_part5);
                    }
                    else
                    {
                        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ar_intro_part5);
                    }
                } else {
                    final String arabic[] = {"Ba (بـ)", "Nun (ن)", "Ta (ت)", "Tha (ث)", "Ya (ـي)"};
                    topics = new String[arabic.length];
                    for (int i = 0; i < arabic.length; i++) {
                        topics[i] = arabic[i];
                    }
                    achievmentAdapters = topics;
                }


            if (!(name.equals(mod6))) {
                VideoView vvIntro = findViewById(R.id.vvIntro);
                vvIntro.setVideoPath(uri.toString());
                vvIntro.requestFocus();
                vvIntro.start();
            }


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
                    String module = String.valueOf(parent.getItemAtPosition(position));
                    if (topics[position].equals("Ba (بـ)"))
                    {
                        Intent i = new Intent(getApplicationContext(),ArabicLesson.class);
                        i.putExtra("Topic",topics[position]);
                        i.putExtra("Lang", lang);
                        startActivity(i);
                    }
                    else if (topics[position].equals("Nun (ن)"))
                    {
                        Intent i = new Intent(getApplicationContext(),ArabicLesson.class);
                        i.putExtra("Topic",topics[position]);
                        i.putExtra("Lang", lang);
                        startActivity(i);
                    }
                    else if (topics[position].equals("Ta (ت)"))
                    {
                        Intent i = new Intent(getApplicationContext(),ArabicLesson.class);
                        i.putExtra("Topic",topics[position]);
                        i.putExtra("Lang", lang);
                        startActivity(i);
                    }
                    else if (topics[position].equals("Tha (ث)"))
                    {
                        Intent i = new Intent(getApplicationContext(),ArabicLesson.class);
                        i.putExtra("Topic",topics[position]);
                        i.putExtra("Lang", lang);
                        startActivity(i);
                    }
                    else if (topics[position].equals("Ya (ـي)"))
                    {
                        Intent i = new Intent(getApplicationContext(),ArabicLesson.class);
                        i.putExtra("Topic",topics[position]);
                        i.putExtra("Lang", lang);
                        startActivity(i);
                    }
                    else {
                        Intent i = new Intent(getApplicationContext(), BRatio1.class);
                        i.putExtra("Topic", topics[position]);
                        i.putExtra("Lang", lang);
                        startActivity(i);
                    }
                }
            });
        }




}
