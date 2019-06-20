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


public class Topic9Q1 extends AppCompatActivity
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



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic9_q1);

        // This is the question's hint.
        btnHint = findViewById(R.id.buttonHint1);
        btnHint.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(),getString(R.string.hint26) , Toast.LENGTH_LONG);
                hint.setGravity(Gravity.CENTER, 0, 0);
                LinearLayout toastContentView = (LinearLayout) hint.getView();
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setImageResource(R.drawable.hint9q1);
                toastContentView.addView(imageView, 0);
                hint.show();

            }

        });


        // Check the entries
        checkbtn = findViewById(R.id.checkbtn);
        entry1 = findViewById(R.id.editText1);
        entry2 = findViewById(R.id.editText2);
        entry3 = findViewById(R.id.editText3);


        // This allows for correct translation of picture
        pic = findViewById(R.id.imgImage);
        Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");
        if (lang.equals("Arabic"))
        {
            pic.setImageResource(R.drawable.topic9q1_pic_ar);
        }
        else
        {
            pic.setImageResource(R.drawable.topic9q1_pic);
        }

        checkbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                        if (entry1.getText().toString().equals("34/100"))
                        {
                            if (entry2.getText().toString().equals("65%"))
                            {
                                if (entry3.getText().toString().equals("18/100"))
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
                        else
                        {
                            Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
                        }
            }

        });

    }

}
