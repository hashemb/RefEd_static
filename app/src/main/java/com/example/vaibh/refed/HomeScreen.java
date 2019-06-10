package com.example.vaibh.refed;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Locale;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import android.widget.*;
import android.util.Log;
import android.net.Uri;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class HomeScreen extends AppCompatActivity
{
    VideoView introVideo;
    int video = R.raw.introvideo;
    Button mathButton;
    String lang= "";


    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        final Intent intent = getIntent();
        lang = intent.getStringExtra("Lang");

        if (lang.equals("Arabic"))
        {
            video = R.raw.introvideo_ar;
        }

    }

    @Override protected void onStart()
    {
        super.onStart();

       // Play the intro video.
        introVideo = findViewById(R.id.videoView);
        playVideo(introVideo);

        // Open the math module
        mathButton = findViewById(R.id.mathButton);
        mathButton.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Intent openMath = new Intent(getApplicationContext(), Activity_Math.class);
                openMath.putExtra("Lang", lang);
                startActivity(openMath);
            }
        });

    }

    public void playVideo(View v)
    {
        VideoView vvIntro = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+video);
        vvIntro.setVideoPath(uri.toString());
        vvIntro.requestFocus();
        vvIntro.start();
        Log.d("HomeScreen", "Play movie");

    }
}
