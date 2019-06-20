package com.example.vaibh.refed;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ImageView;


public class Topic24Q1 extends AppCompatActivity
{

    String lang = "";
    private Button btnHint, button1, button2, button3, button4, button5, button6, button7; // hint button
    private Button button8, button9, button10, button11, button12;
    private Button btnFinish; // check answer/continue button
    private RadioGroup radioGroup; //answer options
    private ImageView pic; //answer options



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic24_q1);

        // True or false
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
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

        });

        button2 = findViewById(R.id.checkbtn);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
            }

        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
            }

        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
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

        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
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

        });

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
            }

        });

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
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

        });

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
            }

        });

        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
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

        });

        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
            }

        });

        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
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

        });

        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
            }

        });


        // This is the question's hint.
        btnHint = findViewById(R.id.buttonHint1);
        btnHint.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),getString(R.string.hint62) , Toast.LENGTH_LONG).show();
            }

        });

    }

}
