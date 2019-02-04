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

public class Login extends AppCompatActivity
{

    private Button btnLogin, signup;
    private EditText edtUsername, edtPassword;
    private TextView txtWelcome;
    ProgressBar progressBar;
    FirebaseAuth mAuth;

    // Activity gets created
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        signup = findViewById(R.id.btnSignup);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);

        progressBar = findViewById(R.id.pbarLogin);


        mAuth = FirebaseAuth.getInstance();
        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),SignUp.class);
                startActivity(i);
            }

        });
    }

    // Activity is visible
    @Override protected void onStart()
    {
        super.onStart();
        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Signin();
            }
        });
    }

   // Activity is paused
    @Override protected void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(),  "Login Successful!", Toast.LENGTH_SHORT).show();
        Log.d("Login", "onStop() is about to be called.");
    }

    // Activity is stopped and is no longer visible
    @Override protected void onStop()
    {
        super.onStop();
        Log.d("Login", "The welcome activity is about to start.");

    }

    private void Signin()
    {
        String checkUsername = edtUsername.getText().toString()+"@makeFakedomain.com";
        String checkPassword = edtPassword.getText().toString();

        progressBar.setVisibility(View.VISIBLE);
        mAuth.signInWithEmailAndPassword(checkUsername,checkPassword)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>()
                {
                    @Override public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        progressBar.setVisibility(View.INVISIBLE);
                        if(task.isSuccessful())
                        {
                            //TEMPORARILY CHANGED TO DASHBOARD FOR DEMO

                            Intent welcome = new Intent(getApplicationContext(),UserDashboard.class);
                            welcome.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            welcome.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(welcome);
                        }
                        else {
                            Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

    public void onBackPressed(){
        finish();
    }

}


