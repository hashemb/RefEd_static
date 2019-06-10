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


public class Topic9Q3 extends AppCompatActivity
{

    String lang = "";
    private Button btnHint; // hint button
    private Button btnFinish; // check answer/continue button
    private RadioGroup radioGroup; //answer options
    private ImageView pic; //answer options



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic9_q3);

        // This is the question's hint.
        btnHint = findViewById(R.id.buttonHint1);
        btnHint.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),getString(R.string.hint28) , Toast.LENGTH_LONG).show();
            }

        });



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
        Toast.makeText(getApplicationContext(), getString(R.string.wrong) , Toast.LENGTH_SHORT).show();

    }

    public void onRadioButtonClicked3 (View view)
    {

        Toast.makeText(getApplicationContext(), getString(R.string.wrong) , Toast.LENGTH_SHORT).show();

    }

    public void onRadioButtonClicked4 (View view)
    {

        Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();

    }

}
