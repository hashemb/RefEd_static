package com.example.vaibh.refed;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ImageView;


public class Topic8Q2 extends AppCompatActivity
{

    String lang = "";
    private Button btnHint; // hint button
    private Button btnFinish; // check answer/continue button
    private RadioGroup radioGroup;
    private ImageView pic;
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
        setContentView(R.layout.topic8_q2);

        // This is the question's hint.
        btnHint = findViewById(R.id.buttonHint1);
        btnHint.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),getString(R.string.hint22) , Toast.LENGTH_LONG).show();
            }

        });


        // Check the entries
        checkbtn = findViewById(R.id.checkbtn);
        entry1 = findViewById(R.id.editText1);
        entry2 = findViewById(R.id.editText2);
        entry3 = findViewById(R.id.editText3);
        entry4 = findViewById(R.id.editText4);
        entry5 = findViewById(R.id.editText5);


        // This allows for correct translation of picture
        pic = findViewById(R.id.imgImage);
        Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");
        if (lang.equals("Arabic"))
        {
            pic.setImageResource(R.drawable.topic8q2_pic_ar);
        }
        else
        {
            pic.setImageResource(R.drawable.topic8q2_pic);
        }

        checkbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if (entry1.getText().toString().equals(".6") || entry1.getText().toString().equals(".60")|| entry2.getText().toString().equals("0.60") || entry2.getText().toString().equals("0.6"))
                {
                    if (entry2.getText().toString().equals(".75") || entry2.getText().toString().equals("0.75"))
                    {
                        if (entry3.getText().toString().equals("135%"))
                        {
                           if (entry4.getText().toString().equals(".54") || entry2.getText().toString().equals("0.54"))
                           {
                               if (entry5.getText().toString().equals("86%"))
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
                           }
                        }
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_LONG).show();
                }
            }

        });

    }

}
