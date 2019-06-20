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


public class Topic32Q1 extends AppCompatActivity
{

    String lang = "";
    private Button btnHint1; // hint button
    private Button btnHint2; // hint button
    private Button btnHint3; // hint button
    private Button btnHint4; // hint button
    private Button btnHint5; // hint button
    private Button btnHint6; // hint button
    private Button chckbtn1;



    private ImageView pic1, pic2, pic3, pic4, pic5, pic6;
    EditText entry1;//answer options
    EditText entry2;//answer options
    EditText entry3;//answer options
    EditText entry4;//answer options
    EditText entry5;//answer options
    EditText entry6;//answer options



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic32_q1);

        // This is the question's hint.
        btnHint1 = findViewById(R.id.button1);
        btnHint2 = findViewById(R.id.checkbtn);
        btnHint3 = findViewById(R.id.button3);
        btnHint4 = findViewById(R.id.button4);
        btnHint5 = findViewById(R.id.button5);
        btnHint6 = findViewById(R.id.button6);
        chckbtn1 = findViewById(R.id.checkbtn);

        btnHint1.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(), getString(R.string.hint851), Toast.LENGTH_LONG);
                hint.show();
            }

        });
        btnHint2.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(), getString(R.string.hint852), Toast.LENGTH_LONG);
                hint.show();
            }

        });
        btnHint3.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(), getString(R.string.hint853), Toast.LENGTH_LONG);
                hint.show();
            }

        });
        btnHint4.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(), getString(R.string.hint854), Toast.LENGTH_LONG);
                hint.show();
            }

        });
        btnHint5.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(), getString(R.string.hint855), Toast.LENGTH_LONG);
                hint.show();
            }

        });
        btnHint6.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(), getString(R.string.hint856), Toast.LENGTH_LONG);
                hint.show();
            }

        });


        // Check the entries
        entry1 = findViewById(R.id.editText1);
        entry2 = findViewById(R.id.editText2);
        entry3 = findViewById(R.id.editText3);
        entry4 = findViewById(R.id.editText4);
        entry5 = findViewById(R.id.editText5);
        entry6 = findViewById(R.id.editText6);

        chckbtn1.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if (entry1.getText().toString().equals("10x")) {

                    if ((entry2.getText().toString().equals("5y-3")))
                    {
                        if ((entry3.getText().toString().equals("z+7")) || (entry1.getText().toString().equals("ض+7")))
                        {
                            if ((entry4.getText().toString().equals("x/9")) ||  (entry4.getText().toString().equals("س/9 ")))
                            {

                                if ((entry5.getText().toString().equals("2y")))
                                {
                                    if ((entry6.getText().toString().equals("8/ص") ) || (entry6.getText().toString().equals("8/z")))
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
                                else
                                {
                                    Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
                                }
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
                }
            }

        });


        // This allows for correct translation of picture
        pic1 = findViewById(R.id.imageView1);
        pic2 = findViewById(R.id.imageView2);
        pic3 = findViewById(R.id.imageView3);
        pic4 = findViewById(R.id.imageView4);
        pic5 = findViewById(R.id.imageView5);
        pic6 = findViewById(R.id.imageView6);
        Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");
        if (lang.equals("Arabic"))
        {
            pic1.setImageResource(R.drawable.topic32_1_pic_ar);
            pic2.setImageResource(R.drawable.topic32_2_pic_ar);
            pic3.setImageResource(R.drawable.topic32_3_pic_ar);
            pic4.setImageResource(R.drawable.topic32_4_pic_ar);
            pic5.setImageResource(R.drawable.topic32_5_pic_ar);
            pic6.setImageResource(R.drawable.topic32_6_pic_ar);
        }

    }

}
