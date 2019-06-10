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

public class Topic21Vid1 extends AppCompatActivity {

    private Context c = Topic21Vid1.this;
    private Button cont;
    private Bundle extra;
    private Fragment frag;
    public static String moduleName;


    VideoView mathModVid;

    String lang = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic21_vid1);




        // This allows for correct formatting of arabic text within the ListViews
        final Intent intent = getIntent();
        lang = intent.getStringExtra("Lang");

    }

    @Override protected void onStart()
    {
        super.onStart();
        mathModVid = findViewById(R.id.mathModVid);
        playVideo(mathModVid);
    }

    public void playVideo(View v)
    {
        int video = R.raw.sv_part2_cartesianplane;
        if (lang.equals("Arabic"))
        {
            video = R.raw.sv_part2_cartesianplane_ar;
        }
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+ video);
        mathModVid.setVideoPath(uri.toString());
        mathModVid.requestFocus();
        mathModVid.start();
    }


}
