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


public class Topic10Q2 extends AppCompatActivity
{

    String lang = "";
    private Button btnHint; // hint button
    private Button btnFinish; // check answer/continue button
    private RadioGroup radioGroup;
    private ImageView pic;
    Button checkbtn;
    EditText entry1;//answer options



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic10_q2);

        // This is the question's hint.
        btnHint = findViewById(R.id.buttonHint1);
        btnHint.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(),getString(R.string.hint30) , Toast.LENGTH_LONG);
                hint.setGravity(Gravity.CENTER, 0, 0);
                LinearLayout toastContentView = (LinearLayout) hint.getView();
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setImageResource(R.drawable.hint30);
                toastContentView.addView(imageView, 0);
                hint.show();
            }

        });


        // Check the entries
        checkbtn = findViewById(R.id.button2);
        entry1 = findViewById(R.id.editText1);


        // This allows for correct translation of picture
        pic = findViewById(R.id.imgImage);
        Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");
        if (lang.equals("Arabic"))
        {
            pic.setImageResource(R.drawable.topic10q2_pic_ar);
        }
        else
        {
            pic.setImageResource(R.drawable.topic10q2_pic);
        }

        checkbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if (entry1.getText().toString().equals("33.3") || entry1.getText().toString().equals("33"))
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
                else
                {
                    Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

}
