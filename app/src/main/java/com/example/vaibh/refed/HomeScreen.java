package com.example.vaibh.refed;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    Button mathButton;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
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
                startActivity(openMath);
            }
        });

    }

    public void playVideo(View v)
    {
        VideoView vvIntro = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.introvideo);
        vvIntro.setVideoPath(uri.toString());
        vvIntro.requestFocus();
        vvIntro.start();
        Log.d("HomeScreen", "Play movie");

    }
}
