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

public class Topic14Vid2 extends AppCompatActivity {

    private Context c = Topic14Vid2.this;
    private Button cont;
    private Bundle extra;
    private Fragment frag;
    public static String moduleName;


    VideoView mathModVid;

    String lang = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic14_vid2);




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
        int video = R.raw.sv_part2_div_decimals;
        if (lang.equals("Arabic"))
        {
            video = R.raw.sv_part2_div_decimals_ar;
        }
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+ video);
        mathModVid.setVideoPath(uri.toString());
        mathModVid.requestFocus();
        mathModVid.start();
    }


}
