package com.example.vaibh.refed;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class ArabicVid extends AppCompatActivity {

    VideoView mathModVid;

    String lang = "";
    String name;
    String topic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arabic_vid);
        // Retrieve the name of the module selected in Activity_Math
        Intent intent = getIntent();
        topic = intent.getStringExtra("Topic");
        name = intent.getStringExtra("Name");

    }

    @Override protected void onStart()
    {
        super.onStart();
        mathModVid = findViewById(R.id.arabvid1);
        playVideo(mathModVid);
    }

    public void playVideo(View v)
    {
        int video;

        if (name.equals("Ba (بـ)"))
        {
            if (topic.equals(getString(R.string.video1)))
            {
                video = R.raw.part1ba1;
            } else if (topic.equals(getString(R.string.video2)))
            {
                video = R.raw.ba;
            } else
            {
                video = R.raw.part2ba;
            }
        }
        else if (name.equals("Nun (ن)"))
        {
            video = R.raw.ba;
        }
        else if (name.equals("Ta (ت)"))
        {
            if (topic.equals(getString(R.string.video1)))
            {
                video = R.raw.part1ta;
            } else if (topic.equals(getString(R.string.video2)))
            {
                video = R.raw.ta;
            } else
            {
                video = R.raw.part2ta;
            }
        }
        else if (name.equals("Tha (ث)"))
        {
            if (topic.equals(getString(R.string.video1)))
            {
                video = R.raw.part1tha;
            } else if (topic.equals(getString(R.string.video2)))
            {
                video = R.raw.tha;
            } else
            {
                video = R.raw.part2tha;
            }
        }
        else
        {
            video = R.raw.ba;
        }

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+ video);
        mathModVid.setVideoPath(uri.toString());
        mathModVid.requestFocus();
        mathModVid.start();
    }

}
