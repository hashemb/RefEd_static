package com.example.vaibh.refed;

import android.app.Fragment;
import android.content.Context;
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

public class Activity_Math extends AppCompatActivity {

    private Context c;
    private RadioButton rb1;
    private Bundle extra;
    private Fragment frag;
    public static String moduleName;


    VideoView mathModVid;
    String mathMods[] = {"Ratios and Proportional Relationships","The Number System",
            "Expressions and Equations","Geometry","Statistics and Probability"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__math);

        ListView listModules = findViewById(R.id.lvParts);
        CustomAdapterAchievements achievementAdapter = new CustomAdapterAchievements(this, mathMods);
        listModules.setAdapter(achievementAdapter);


        listModules.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String module = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(getApplicationContext(),module,Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),MathModule1_Part1.class);
                i.putExtra("Name",mathMods[position]);
                startActivity(i);
            }
        });

    }

    @Override protected void onStart()
    {
        super.onStart();
        mathModVid = findViewById(R.id.mathModVid);
        playVideo(mathModVid);
    }

    public void playVideo(View v)
    {
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.math_mod_intro);
        mathModVid.setVideoPath(uri.toString());
        mathModVid.requestFocus();
        mathModVid.start();
    }

    /*public String loadJSONFromAsset(String fileName) {
        String json = null;
        org.json.JSONObject obj;
        try {
            InputStream is = getAssets().open(fileName + ".json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
            obj = new org.json.JSONObject(json);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
        return json;
    }*/


}
