package com.example.vaibh.refed;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ImageView;


public class Topic6Q1 extends AppCompatActivity
{

    String lang = "";
    private Button btnHint; // hint button
    private Button btnFinish; // check answer/continue button
    Button checkbtn;
    EditText entry1;//answer options
    EditText entry2;//answer options
    private ImageView pic; //answer options



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic6_q1);

        // This is the question's hint.
        btnHint = findViewById(R.id.buttonHint1);
        btnHint.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.hint16), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                LinearLayout toastContentView = (LinearLayout) toast.getView();
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setImageResource(R.drawable.hint6q1);
                toastContentView.addView(imageView, 0);
                toast.show();
            }

        });


        // Check the entries
        checkbtn = findViewById(R.id.checkbtn);
        entry1 = findViewById(R.id.editText);


        // This allows for correct translation of picture
        pic = findViewById(R.id.imgImage);
        Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");
        if (lang.equals("Arabic"))
        {
            pic.setImageResource(R.drawable.topic6q1_pic_ar);
        }
        else
        {
            pic.setImageResource(R.drawable.topic6q1_pic);
        }

        checkbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if (entry1.getText().toString().equals("30"))
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
                    Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_LONG).show();
                }
            }

        });

    }

}
