package com.example.vaibh.refed;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LangSelect extends AppCompatActivity
{

    private Button btnContinue;
    private FirebaseAuth mAuth;

    //Activity gets created.
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang_select);

        btnContinue = findViewById(R.id.btnContinue);

        mAuth = FirebaseAuth.getInstance();
        if(mAuth.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }

        btnContinue.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),SignUp.class);
                startActivity(i);
            }

        });
    }

}
