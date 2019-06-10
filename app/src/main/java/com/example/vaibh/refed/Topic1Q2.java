package com.example.vaibh.refed;


import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;


public class Topic1Q2 extends AppCompatActivity
{

    String lang = "";
    Button btnHint; // hint button
    RadioGroup radioGroup; //answer options



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic1_q2);

        // This is the question's hint.
        btnHint = findViewById(R.id.buttonHint1);
        btnHint.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),getString(R.string.hint2) , Toast.LENGTH_LONG).show();
            }

        });

        // Retrieve the name of the module selected in Activity_Math
        final Intent intent = getIntent();
        final String topic = intent.getStringExtra("Topic");

        // This allows for correct image to be shown english or arabic
        final Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");


        radioGroup = findViewById(R.id.rdgChoices);




    }

    public void onRadioButtonClicked1 (View view)
    {

        // Correct Answer!!!
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.correct), Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContentView = (LinearLayout) toast.getView();
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageResource(R.drawable.check_true);
        toastContentView.addView(imageView, 0);
        toast.show();

    }

    public void onRadioButtonClicked2 (View view)
    {

        Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_LONG).show();
    }

    public void onRadioButtonClicked3 (View view)
    {

        Toast.makeText(getApplicationContext(), getString(R.string.wrong) , Toast.LENGTH_LONG).show();

    }

    public void onRadioButtonClicked4 (View view)
    {

        Toast.makeText(getApplicationContext(), getString(R.string.wrong) , Toast.LENGTH_LONG).show();

    }

}
