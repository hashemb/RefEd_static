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


public class Topic16Q1 extends AppCompatActivity
{

    String lang = "";
    private Button btnHint; // hint button
    private Button btnFinish; // check answer/continue button
    private RadioGroup radioGroup;
    ImageView pic1, pic2, pic3, pic4;
    Button checkbtn;
    EditText entry1;//answer options
    EditText entry2;//answer options
    EditText entry3;//answer options
    EditText entry4;//answer options
    EditText entry5;//answer options



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic16_q1);

        // This is the question's hint.
        btnHint = findViewById(R.id.buttonHint1);
        btnHint.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(),"" , Toast.LENGTH_LONG);
                hint.setGravity(Gravity.CENTER, 0, 0);
                LinearLayout toastContentView = (LinearLayout) hint.getView();
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setImageResource(R.drawable.hint45);
                toastContentView.addView(imageView, 0);
                hint.show();
            }

        });


        // Check the entries
        checkbtn = findViewById(R.id.button2);
        entry1 = findViewById(R.id.editText1);
        entry2 = findViewById(R.id.editText2);
        entry3 = findViewById(R.id.editText3);
        entry4 = findViewById(R.id.editText4);
        entry5 = findViewById(R.id.editText5);


        // This allows for correct translation of picture
        pic1 = findViewById(R.id.imageView3);
        pic2 = findViewById(R.id.imageView4);
        pic3 = findViewById(R.id.imageView5);
        pic4 = findViewById(R.id.imageView6);
        Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");
        if (lang.equals("Arabic"))
        {
            pic1.setImageResource(R.drawable.topic16q1a_pic_ar);
            pic2.setImageResource(R.drawable.topic16q1b_pic_ar);
            pic3.setImageResource(R.drawable.topic16q1c_pic_ar);
            pic4.setImageResource(R.drawable.topic16q1e_pic_ar);
        }
        else
        {
            pic1.setImageResource(R.drawable.topic16q1a_pic);
            pic2.setImageResource(R.drawable.topic16q1b_pic);
            pic3.setImageResource(R.drawable.topic16q1c_pic);
            pic4.setImageResource(R.drawable.topic16q1e_pic);
        }

        checkbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if (entry1.getText().toString().equals("6"))
                {
                    if (entry2.getText().toString().equals("6"))
                    {
                        if (entry3.getText().toString().equals("2"))
                        {
                            if (entry4.getText().toString().equals("2")) {

                                if (entry5.getText().toString().equals("3")) {
                                    // Correct Answer!!!

                                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.correct), Toast.LENGTH_SHORT);
                                    toast.setGravity(Gravity.CENTER, 0, 0);
                                    LinearLayout toastContentView = (LinearLayout) toast.getView();
                                    ImageView imageView = new ImageView(getApplicationContext());
                                    imageView.setImageResource(R.drawable.check_true);
                                    toastContentView.addView(imageView, 0);
                                    toast.show();
                                }
                            }
                        }
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

}
