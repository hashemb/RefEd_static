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

public class MathModule1_Part1 extends AppCompatActivity
{



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_math_module1__part1);
            // Retrieve the name of the module selected in Activity_Math
            final Intent intent = getIntent();
            String name = intent.getStringExtra("Name");
            Bundle b = this.getIntent().getExtras();
            final String[] array =b.getStringArray("Array");
            final String topics[];

            // Load the math lessons for the given module.
            String achievmentAdapters[] = {"Basic Ratios", "Equivalent Ratios", "Ratios with Double Number Lines",
                    "Ratios with Tape Diagrams"};; // Will store the math lesson names.
            switch (name)
            {
                case "Ratios and Proportional Relationships":
                    final String ratios[] = {"Basic Ratios", "Equivalent Ratios", "Ratios with Double Number Lines", "Ratios with Tape Diagrams", "Comparing Rates",
                            "Rate Problems", "Equivalent Ratio Word Problems", "Converting decimals to percents and vice-versa", "Converting percents and fractions",
                            "Findings percents - word problems", "Percent word problems", "Relate fractions, decimals and percents", };
                    topics = new String[ratios.length];
                    for (int i = 0; i < ratios.length; i++)
                    {
                        topics[i] = ratios[i];
                    }
                    achievmentAdapters = topics;
                    CustomAdapterAchievements achievementAdapter1 = new CustomAdapterAchievements(this, ratios);
                    break;
                case "The Number System":
                    final String numbers[] = {"Adding and subtracting decimals", "Divide and multiply fractions in word problems",
                            "Greatest common factor", "Least common multiple", "GCF and LCM - word problems",
                            "Negative decimals on the number line", "Number opposites", "Ordering negative numbers", "Points in the coordinate plane",
                            "Distance between points on the coordinate plane", "Find absolute values", "Compare absolute values",
                            "Compare and order rational numbers", "Numerical inequalities (word problems)"};
                    topics = new String[numbers.length];
                    for (int i = 0; i < numbers.length; i++)
                    {
                        topics[i] = numbers[i];
                    }
                    achievmentAdapters = topics;
                    CustomAdapterAchievements achievementAdapter2 = new CustomAdapterAchievements(this, numbers);
                    break;
                case "Expressions and Equations":
                    final String expressions[] = {"Parts of algebraic expressions", "Substitution with one and two variables", "Expression value intuition",
                        "Expressions value intuition - with fractions", "Expressions word problems", "Writing algebraic expressions",
                        "Writing algebraic expressions - word problems", "Distributive property with variables", "Combining like terms", "Equivalent expressions: distribution + combination",
                        "One-step equations (addition and subtraction)", "One-step equations (multiplication and division)", "Finding mistakes in one-step equations",
                        "Finding mistakes in one-step equations", "One-step equations - word problems", "Inequalities with variables", "Graphing inequalities"};
                    topics = new String[expressions.length];
                    for (int i = 0; i < expressions.length; i++)
                    {
                        topics[i] = expressions[i];
                    }
                    achievmentAdapters = topics;
                    CustomAdapterAchievements achievementAdapter3 = new CustomAdapterAchievements(this, expressions);
                    break;
                case "Geometry":
                    final String geometry[] = {"Parts of a triangle", "Area of right triangles", "Area of a non-right triangle", "Find a missing length",
                        "Area of parallelograms", "Find a missing length when given the area of a parallelogram",
                        "Area of trapezoids", "Area of composite figures (challenge questions)",
                        "Identify geometric shapes", "Identifying common 3-D shapes", "Volume word problems - with fractions and decimals",
                        "Surface area - word problems", "Nets of polyhedra", "Introduction to the coordinate plane", "Area and perimeter on the coordinate plane",
                        "Drawing quadrilaterals with coordinates and calculate lengths"};
                    topics = new String[geometry.length];
                    for (int i = 0; i < geometry.length; i++)
                    {
                        topics[i] = geometry[i];
                    }
                    achievmentAdapters = topics;
                    CustomAdapterAchievements achievementAdapter4 = new CustomAdapterAchievements(this, geometry);
                    break;
                case "Statistics and Probability":
                    final String statistics[] = {"Statistical questions (define if questions are statistic or not)", "Data sets", "Frequency tables", "Reading dot plots",
                        "Read histograms", "Calculate the mean", "Effects of shifting, adding and removing a data point (on the mean)", "Calculating the median",
                        "Interpreting quartiles", "Interquartile range (IQR)", "Reading box plots", "Creating box plots", "Comparing data displays",
                        "Shape of distributions", "Clusters, gaps, peaks and outliers"};
                    topics = new String[statistics.length];
                    for (int i = 0; i < statistics.length; i++)
                    {
                        topics[i] = statistics[i];
                    }
                    achievmentAdapters = topics;
                    CustomAdapterAchievements achievementAdapter5 = new CustomAdapterAchievements(this, statistics);
                    break;
                default:
                    topics = new String[0];
                    break;
            }

            CustomAdapterAchievements achievmentAdapter = new CustomAdapterAchievements(this, achievmentAdapters);

            ListView listModules = findViewById(R.id.lvParts);
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
                    Toast.makeText(getApplicationContext(),topics[position],Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(),BRatio1.class);
                    i.putExtra("Topic",topics[position]);
                    startActivity(i);
                }
            });
        }



    @Override protected void onResume()
    {
        super.onResume();
        VideoView vvIntro = findViewById(R.id.vvIntro);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.ratiosandpropotions);
        vvIntro.setVideoPath(uri.toString());
        vvIntro.requestFocus();
        vvIntro.start();

    }
}
