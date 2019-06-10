package com.example.vaibh.refed;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import java.util.Locale;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.widget.Toast;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LangSelect extends AppCompatActivity
{

    private Button btnContinue;
    private RadioGroup radioGroup;
    String appLang = "English";

    private FirebaseAuth mAuth;

    //Activity gets created.
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang_select);

        radioGroup = findViewById(R.id.radGroup);

        btnContinue = findViewById(R.id.btnContinue);



        btnContinue.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),HomeScreen.class);
                i.putExtra("Lang", appLang);
                startActivity(i);
            }

        });
    }

    private void setAppLocale(String localeCode)
    {
        Resources res = getResources();

        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration config = res.getConfiguration();
        config.setLocale(new Locale(localeCode.toLowerCase()));
        res.updateConfiguration(config, dm);
    }

    public void radioButtonClickedEng (View view)
    {
        setAppLocale("en");
    }

    public void radioButtonClickedAr (View view)
    {
        setAppLocale("ar");
        appLang = "Arabic";
    }

}
