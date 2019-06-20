package com.example.vaibh.refed;


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


public class Topic21Q3 extends AppCompatActivity
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
    EditText entry6;//answer options



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic21_q3);

        // This is the question's hint.
        btnHint = findViewById(R.id.buttonHint1);
        btnHint.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Toast hint = Toast.makeText(getApplicationContext(),getString(R.string.hint57) , Toast.LENGTH_LONG);
                hint.show();
            }

        });


        // Check the entries
        checkbtn = findViewById(R.id.checkbtn);
        entry1 = findViewById(R.id.editText1);
        entry2 = findViewById(R.id.editText2);
        entry3 = findViewById(R.id.editText3);
        entry4 = findViewById(R.id.editText4);
        entry5 = findViewById(R.id.editText5);
        entry6 = findViewById(R.id.editText6);




        checkbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if (entry1.getText().toString().equals("-1"))
                {
                    if (entry2.getText().toString().equals("5"))
                    {
                        if (entry3.getText().toString().equals("-5"))
                        {
                            if (entry4.getText().toString().equals("2"))
                            {
                                if (entry5.getText().toString().equals("2"))
                                {
                                    if (entry6.getText().toString().equals("-2"))
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
                }
                else
                {
                    Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

}
