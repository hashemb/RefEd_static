package com.example.vaibh.refed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.VideoView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

public class BRatio1 extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        // Retrieve the name of the module selected in Activity_Math
        final Intent intent = getIntent();
        String topic = intent.getStringExtra("Topic");
        Bundle b = this.getIntent().getExtras();
        final String[] array =b.getStringArray("Array");

        // Setup Each topic's questions page.
        final boolean introVid;
        final int numQs;
        int to = 3;

        // Load the math lessons for the given module.
        String achievmentAdapters[]; // Will store the math lesson names.

        switch (topic)
        {
            case "Basic Ratios":
                introVid = false;
                numQs = 3;
                Toast.makeText(getApplicationContext(),"gotcha bitch",Toast.LENGTH_LONG).show();
                break;
            case "Equivalent Ratios":
                introVid = false;
                numQs = 3;
                break;
            case "Ratios with Double Number Lines":
                break;
            case "Ratios with Tape Diagrams":
                break;
            case "Comparing Rates":
                break;
            case "Rate Problems":
                break;
            case "Equivalent Ratio Word Problems":
                break;
            case "Converting decimals to percents and vice-versa":
                break;
            case "Converting percents and fractions":
                break;
            case "Findings percents - word problems":
                break;
            case "Percent word problems":
                break;
            case "Relate fractions, decimals and percents":
                break;
            case "Adding and subtracting decimals":
                break;
            case "Divide and multiply fractions in word problems":
                break;
            case "Greatest common factor":
                break;
            case "Least common multiple":
                break;
            case "GCF and LCM - word problems":
                break;
            case "Negative decimals on the number line":
                break;
            case "Number opposites":
                break;
            case "Ordering negative numbers":
                break;
            case "Points in the coordinate plane":
                break;
            case "Distance between points on the coordinate plane":
                break;
            case "Find absolute values":
                break;
            case "Compare absolute values":
                break;
            case "Compare and order rational numbers":
                break;
            case "Numerical inequalities (word problems)":
                break;
            case "Parts of algebraic expressions":
                break;
            case "Substitution with one and two variables":
                break;
            case "Expression value intuition":
                break;
            case "Expressions value intuition - with fractions":
                break;
            case "Expressions word problems":
                break;
            case "Writing algebraic expressions":
                break;
            case "Writing algebraic expressions - word problems":
                break;
            case "Distributive property with variables":
                break;
            case "Combining like terms":
                break;
            case "Equivalent expressions: distribution + combination":
                break;
            case "One-step equations (addition and subtraction)":
                break;
            case "One-step equations (multiplication and division)":
                break;
            case "Finding mistakes in one-step equations":
                break;
            case "One-step equations - word problems":
                break;
            case "Inequalities with variables":
                break;
            case "Graphing inequalities":
                break;
            case "Parts of a triangle":
                break;
            case "Area of right triangles":
                break;
            case "Area of a non-right triangle":
                break;
            case "Find a missing length":
                break;
            case "Area of parallelograms":
                break;
            case "Find a missing length when given the area of a parallelogram":
                break;
            case "Area of trapezoids":
                break;
            case "Area of composite figures (challenge questions)":
                break;
            case "Identify geometric shapes":
                break;
            case "Identifying common 3-D shapes":
                break;
            case "Volume word problems - with fractions and decimals":
                break;
            case "Surface area - word problems":
                break;
            case "Nets of polyhedra":
                break;
            case "Introduction to the coordinate plane":
                break;
            case "Area and perimeter on the coordinate plane":
                break;
            case "Statistical questions (define if questions are statistic or not)":
                break;
            case "Data sets":
                break;
            case "Frequency tables":
                break;
            case "Reading dot plots":
                break;
            case "Read histograms":
                break;
            case "Calculate the mean":
                break;
            case "Effects of shifting, adding and removing a data point (on the mean)":
                break;
            case "Calculating the median":
                break;
            case "Interpreting quartiles":
                break;
            case "Interquartile range (IQR)":
                break;
            case "Reading box plots":
                break;
            case "Creating box plots":
                break;
            case "Comparing data displays":
                break;
            case "Shape of distributions":
                break;
            case "Clusters, gaps, peaks and outliers":
                break;
            default:
                break;
        }

        final String questions[] = {"Question 1", "Question 2", "Question 3"};
        achievmentAdapters = questions;
        CustomAdapterAchievements achievementAdapter1 = new CustomAdapterAchievements(this, questions);
        CustomAdapterAchievements achievmentAdapter = new CustomAdapterAchievements(this, achievmentAdapters);

        ListView listModules = (ListView) findViewById(R.id.lvParts);
        VideoView vvIntro = findViewById(R.id.vvIntro);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.ratiosandpropotions);
        vvIntro.setVideoPath(uri.toString());
        vvIntro.requestFocus();
        vvIntro.start();

        listModules.setAdapter(achievmentAdapter);

        listModules.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String module = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(getApplicationContext(),module,Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),BRatio1.class);
                i.putExtra("Name",array[position]);
                startActivity(i);
            }
        });
    }



    @Override protected void onResume()
    {
        super.onResume();
        VideoView vvIntro = findViewById(R.id.vvIntro);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.math1ratios_intro);
        vvIntro.setVideoPath(uri.toString());
        vvIntro.requestFocus();
        vvIntro.start();

    }
}