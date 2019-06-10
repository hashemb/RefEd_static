package com.example.vaibh.refed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
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


    String lang = "";
// String constants for switch statements

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        TextView topicName = findViewById(R.id.textView3);


        // Retrieve the name of the module selected in Activity_Math
        final Intent intent = getIntent();
        final String topic = intent.getStringExtra("Topic");

        // This allows for correct formatting of arabic text within the ListViews
        final Intent intent1 = getIntent();
        lang = intent1.getStringExtra("Lang");

        // Setup Each topic's questions page.
        final String questions[];

        // Load the math lessons for the given module.
        //This uses a long ass switch statement for every
        //math topic in the app toload to listview with the
        //text for necessary # of questions and or videos,
        //but doesn't load the actual questions or videos
        String achievmentAdapters[]; // Will store the math lesson names.


        if (topic.equals(getString(R.string.topic1))) {
            String question[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question.length];
            for (int i = 0; i < question.length; i++) {
                questions[i] = question[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic2))) {
            String question2[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question2.length];
            for (int i = 0; i < question2.length; i++) {
                questions[i] = question2[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic3))) {
            String question3[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question3.length];
            for (int i = 0; i < question3.length; i++) {
                questions[i] = question3[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic4))) {
            String question4[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question4.length];
            for (int i = 0; i < question4.length; i++) {
                questions[i] = question4[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic5))) {
            String question5[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question5.length];
            for (int i = 0; i < question5.length; i++) {
                questions[i] = question5[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic6))) {

            String question6[] = {getString(R.string.q1), getString(R.string.video), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question6.length];
            for (int i = 0; i < question6.length; i++) {
                questions[i] = question6[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic7))) {
            String question7[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question7.length];
            for (int i = 0; i < question7.length; i++) {
                questions[i] = question7[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic8))) {
            String question8[] = {getString(R.string.video), getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question8.length];
            for (int i = 0; i < question8.length; i++) {
                questions[i] = question8[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic9))) {
            String question9[] = {getString(R.string.video), getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question9.length];
            for (int i = 0; i < question9.length; i++) {
                questions[i] = question9[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic10))) {
            String question10[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question10.length];
            for (int i = 0; i < question10.length; i++) {
                questions[i] = question10[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic11))) {
            String question11[] = {getString(R.string.video), getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question11.length];
            for (int i = 0; i < question11.length; i++) {
                questions[i] = question11[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic12))) {
            String question12[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question12.length];
            for (int i = 0; i < question12.length; i++) {
                questions[i] = question12[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic13))) {
            String question13[] = {"Adding and Subtracting Decimals Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question13.length];
            for (int i = 0; i < question13.length; i++) {
                questions[i] = question13[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic14))) {
            String question14[] = {getString(R.string.video1), getString(R.string.video2),
                    getString(R.string.video3), getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question14.length];
            for (int i = 0; i < question14.length; i++) {
                questions[i] = question14[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic15))) {
            String question15[] = {getString(R.string.q1)};
            questions = new String[question15.length];
            for (int i = 0; i < question15.length; i++) {
                questions[i] = question15[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic16))) {
            String question16[] = {getString(R.string.q1)};
            questions = new String[question16.length];
            for (int i = 0; i < question16.length; i++) {
                questions[i] = question16[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic17))) {
            String question17[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question17.length];
            for (int i = 0; i < question17.length; i++) {
                questions[i] = question17[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic18))) {
            String question18[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question18.length];
            for (int i = 0; i < question18.length; i++) {
                questions[i] = question18[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic19))) {
            String question19[] = {getString(R.string.q1)};
            questions = new String[question19.length];
            for (int i = 0; i < question19.length; i++) {
                questions[i] = question19[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic20))) {
            String question20[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question20.length];
            for (int i = 0; i < question20.length; i++) {
                questions[i] = question20[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic21))) {
            String question21[] = {"How to Read a Cartesian Plane Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question21.length];
            for (int i = 0; i < question21.length; i++) {
                questions[i] = question21[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic22))) {
            String question22[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question22.length];
            for (int i = 0; i < question22.length; i++) {
                questions[i] = question22[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic23))) {
            String question23[] = {getString(R.string.q1)};
            questions = new String[question23.length];
            for (int i = 0; i < question23.length; i++) {
                questions[i] = question23[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic24))) {
            String question24[] = {getString(R.string.q1)};
            questions = new String[question24.length];
            for (int i = 0; i < question24.length; i++) {
                questions[i] = question24[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic25))) {
            String question25[] = {getString(R.string.q1)};
            questions = new String[question25.length];
            for (int i = 0; i < question25.length; i++) {
                questions[i] = question25[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic26))) {
            String question26[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question26.length];
            for (int i = 0; i < question26.length; i++) {
                questions[i] = question26[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic27))) {
            String question27[] = {"Coefficients, Variables and Terms Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question27.length];
            for (int i = 0; i < question27.length; i++) {
                questions[i] = question27[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic28))) {
            String question28[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4), getString(R.string.q5)};
            questions = new String[question28.length];
            for (int i = 0; i < question28.length; i++) {
                questions[i] = question28[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic29))) {
            String question29[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question29.length];
            for (int i = 0; i < question29.length; i++) {
                questions[i] = question29[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic30))) {
            String question30[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question30.length];
            for (int i = 0; i < question30.length; i++) {
                questions[i] = question30[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic31))) {
            String question31[] = {"Expression Word Problems Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question31.length];
            for (int i = 0; i < question31.length; i++) {
                questions[i] = question31[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic32))) {
            String question32[] = {getString(R.string.q1)};
            questions = new String[question32.length];
            for (int i = 0; i < question32.length; i++) {
                questions[i] = question32[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic33))) {
            String question33[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question33.length];
            for (int i = 0; i < question33.length; i++) {
                questions[i] = question33[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic34))) {
            String question34[] = {"Distributive Property Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question34.length];
            for (int i = 0; i < question34.length; i++) {
                questions[i] = question34[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic35))) {
            String question35[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question35.length];
            for (int i = 0; i < question35.length; i++) {
                questions[i] = question35[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic36))) {
            String question36[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question36.length];
            for (int i = 0; i < question36.length; i++) {
                questions[i] = question36[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic37))) {
            String question37[] = {"One-Step Equations Video", getString(R.string.q1)};
            questions = new String[question37.length];
            for (int i = 0; i < question37.length; i++) {
                questions[i] = question37[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic38))) {
            String question38[] = {getString(R.string.q1)};
            questions = new String[question38.length];
            for (int i = 0; i < question38.length; i++) {
                questions[i] = question38[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic39))) {
            String question39[] = {getString(R.string.q1)};
            questions = new String[question39.length];
            for (int i = 0; i < question39.length; i++) {
                questions[i] = question39[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic40))) {
            String question40[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4), getString(R.string.q5)};
            questions = new String[question40.length];
            for (int i = 0; i < question40.length; i++) {
                questions[i] = question40[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic41))) {
            String question41[] = {"How to Test Inequalities with Variables Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4), getString(R.string.q5)};
            questions = new String[question41.length];
            for (int i = 0; i < question41.length; i++) {
                questions[i] = question41[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic42))) {
            String question42[] = {"Graphing Inequalities Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question42.length];
            for (int i = 0; i < question42.length; i++) {
                questions[i] = question42[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic43))) {
            String question43[] = {"Parts and Area of a Triangle Video", getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question43.length];
            for (int i = 0; i < question43.length; i++) {
                questions[i] = question43[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic44))) {
            String question44[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question44.length];
            for (int i = 0; i < question44.length; i++) {
                questions[i] = question44[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic45))) {
            String question45[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question45.length];
            for (int i = 0; i < question45.length; i++) {
                questions[i] = question45[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic46))) {
            String question46[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question46.length];
            for (int i = 0; i < question46.length; i++) {
                questions[i] = question46[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic47))) {
            String question47[] = {"Parts and Area of a Parallelogram Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question47.length];
            for (int i = 0; i < question47.length; i++) {
                questions[i] = question47[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic48))) {
            String question48[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question48.length];
            for (int i = 0; i < question48.length; i++) {
                questions[i] = question48[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic49))) {
            String question49[] = {"Trapezoid Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question49.length];
            for (int i = 0; i < question49.length; i++) {
                questions[i] = question49[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic50))) {
            String question50[] = {getString(R.string.q1), getString(R.string.q2), "2-D Shapes: Life Application Examples Video"};
            questions = new String[question50.length];
            for (int i = 0; i < question50.length; i++) {
                questions[i] = question50[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic51))) {
            String question51[] = {"3-D Geometric Shapes: Types, Parts, Volume, Surface Area Video", getString(R.string.q1)};
            questions = new String[question51.length];
            for (int i = 0; i < question51.length; i++) {
                questions[i] = question51[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic52))) {
            String question52[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question52.length];
            for (int i = 0; i < question52.length; i++) {
                questions[i] = question52[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic52b))) {
            String question52b[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question52b.length]; //added after switch was made
            for (int i = 0; i < question52b.length; i++) {
                questions[i] = question52b[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic52c))) //Find volume by multiplying area of base by height
        {
            String question52[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question52.length];
            for (int i = 0; i < question52.length; i++) {
                questions[i] = question52[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic53))) {
            String question52c[] = {getString(R.string.q1)}; //added after switch was made
            questions = new String[question52c.length];
            for (int i = 0; i < question52c.length; i++) {
                questions[i] = question52c[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic53b))) {
            String question52c[] = {getString(R.string.q1), getString(R.string.q2)}; //added after switch was made
            questions = new String[question52c.length];
            for (int i = 0; i < question52c.length; i++) {
                questions[i] = question52c[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic54))) {
            String question53[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question53.length];
            for (int i = 0; i < question53.length; i++) {
                questions[i] = question53[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic55))) {
            String question54[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question54.length];
            for (int i = 0; i < question54.length; i++) {
                questions[i] = question54[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic56))) {
            String question53b[] = {"Shapes in the Coordinate Plane Video", getString(R.string.q1)}; // added after switch was created
            questions = new String[question53b.length];
            for (int i = 0; i < question53b.length; i++) {
                questions[i] = question53b[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic57))) {
            String question56[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question56.length];
            for (int i = 0; i < question56.length; i++) {
                questions[i] = question56[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic58))) {
            String question55[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question55.length];
            for (int i = 0; i < question55.length; i++) {
                questions[i] = question55[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic59))) {
            String question56[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question56.length];
            for (int i = 0; i < question56.length; i++) {
                questions[i] = question56[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic60))) {
            String question57[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4), getString(R.string.q5), getString(R.string.q6)};
            questions = new String[question57.length];
            for (int i = 0; i < question57.length; i++) {
                questions[i] = question57[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic61))) {
            String question57b[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)}; //added after creating statement.
            questions = new String[question57b.length];
            for (int i = 0; i < question57b.length; i++) {
                questions[i] = question57b[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic62))) {
            String question58[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question58.length];
            for (int i = 0; i < question58.length; i++) {
                questions[i] = question58[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic63))) {
            String question59[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question59.length];
            for (int i = 0; i < question59.length; i++) {
                questions[i] = question59[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic64))) {
            String question60[] = {"Calculating the Mean Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question60.length];
            for (int i = 0; i < question60.length; i++) {
                questions[i] = question60[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic65))) {
            String question61[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question61.length];
            for (int i = 0; i < question61.length; i++) {
                questions[i] = question61[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic66))) {
            String question62[] = {"Calculating the Median Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question62.length];
            for (int i = 0; i < question62.length; i++) {
                questions[i] = question62[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic67))) {
            String question63[] = {getString(R.string.q1), getString(R.string.q2)};
            questions = new String[question63.length];
            for (int i = 0; i < question63.length; i++) {
                questions[i] = question63[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic68))) {
            String question64[] = {"Quartiles and IQR Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question64.length];
            for (int i = 0; i < question64.length; i++) {
                questions[i] = question64[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic69))) {
            String question65[] = {"Building a Boxplot Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question65.length];
            for (int i = 0; i < question65.length; i++) {
                questions[i] = question65[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic70))) {
            String question66[] = {getString(R.string.q1)};
            questions = new String[question66.length];
            for (int i = 0; i < question66.length; i++) {
                questions[i] = question66[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic71))) {
            String question67[] = {"Understanding Which Data Display to Use Video", getString(R.string.q1), getString(R.string.q2), getString(R.string.q3)};
            questions = new String[question67.length];
            for (int i = 0; i < question67.length; i++) {
                questions[i] = question67[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic72))) {
            String question68[] = {getString(R.string.q1), getString(R.string.q2), getString(R.string.q3), getString(R.string.q4)};
            questions = new String[question68.length];
            for (int i = 0; i < question68.length; i++) {
                questions[i] = question68[i];
            }
            topicName.setText(topic);
        } else if (topic.equals(getString(R.string.topic73))) {
            String question69[] = {"Data Distribution and Peak, Clusters, Outliers and Gaps Video", getString(R.string.q1),
                    getString(R.string.q2), getString(R.string.q3), getString(R.string.q4), getString(R.string.q5)};
            questions = new String[question69.length];
            for (int i = 0; i < question69.length; i++) {
                questions[i] = question69[i];
            }
            topicName.setText(topic);
        } else {
            questions = new String[2];
        }




        achievmentAdapters = questions;
        ListView listModules = findViewById(R.id.lvParts);

        if (lang.equals("Arabic"))
        {
            CustomAdapterAchievementsAr achievementAdapter = new CustomAdapterAchievementsAr(this, achievmentAdapters);
            listModules.setAdapter(achievementAdapter);
        }
        else
        {
            CustomAdapterAchievements achievementAdapter = new CustomAdapterAchievements(this, achievmentAdapters);
            listModules.setAdapter(achievementAdapter);
        }

        VideoView vvIntro = findViewById(R.id.vvIntro);

        listModules.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // A long ass switch statement that launches a question/'video's
                //activity when it's corresponding item in listModules is clicked.
                String topicQ = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(getApplicationContext(), topicQ, Toast.LENGTH_LONG).show();
                Intent i;

                    if (topic.equals(getString(R.string.topic1)))
                    {
                            if (topicQ.equals(getString(R.string.q1)))
                            {
                                i = new Intent(BRatio1.this, Topic1Q1.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                            else if (topicQ.equals(getString(R.string.q2)))
                            {
                                i = new Intent(BRatio1.this, Topic1Q2.class);
                                //i.putExtra("Name", topic);
                                startActivity(i);
                            }
                            else
                            {
                                i = new Intent(BRatio1.this, Topic1Q3.class);
                                //i.putExtra("Name", topic);
                                startActivity(i);
                            }
                    }
                    else if (topic.equals(getString(R.string.topic2)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                                i = new Intent(BRatio1.this, Topic2Q1.class);
                                startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic2Q2.class);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic2Q3.class);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic3)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic3Q1.class);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic3Q2.class);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic3Q3.class);
                            startActivity(i);
                        }
                        }
                    else if (topic.equals(getString(R.string.topic4)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic4Q1.class);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic4Q2.class);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic4Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic5)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic5Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic5Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic5Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic6)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic6Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic6Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }

                        else if (topicQ.equals(getString(R.string.video)))
                        {
                            i = new Intent(BRatio1.this, Topic6Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic6Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic7)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic7Q1.class);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic7Q2.class);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic7Q3.class);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic8)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic8Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic8Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic8Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic8Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic8Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic9)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic9Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic9Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic9Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic9Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic10)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic10Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic10Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic10Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic11)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic11Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic11Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic11Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic11Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic12)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic12Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic12Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic13)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic13Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic13Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic13Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic13Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic13Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic14)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic14Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic14Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic14Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.video1)))
                        {
                            i = new Intent(BRatio1.this, Topic14Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.video2)))
                        {
                            i = new Intent(BRatio1.this, Topic14Vid2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic14Vid3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic15)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic15Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic16)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic16Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic17)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic17Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic17Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic17Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic18))) //"Negative decimals on the number line":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic18Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic18Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic18Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic19))) // "Number opposites":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic19Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic20))) // "Ordering negative numbers":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic20Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic20Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic21))) // "Points in the coordinate plane":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic21Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic21Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic21Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic21Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic22))) // "Distance between points on the coordinate plane":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic22Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic22Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic22Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic23))) // "Find absolute values":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic23Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic24))) // "Compare absolute values":
                        {
                            if (topicQ.equals(getString(R.string.q1)))
                            {
                                i = new Intent(BRatio1.this, Topic24Q1.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                        }
                    else if (topic.equals(getString(R.string.topic25))) // "Compare and order rational numbers":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic25Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic26))) // "Numerical inequalities (word problems)":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic26Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic26Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic26Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic27))) // "Parts of algebraic expressions":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic27Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic27Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic27Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic27Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic28))) // "Substitution with one and two variables":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic28Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic28Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic28Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic28Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic28Q5.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic29)))// "Expression value intuition":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic29Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic29Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic29Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic30))) // "Expressions value intuition - with fractions":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic30Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic30Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic30Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic31))) // "Expressions word problems":
                        {
                            if (topicQ.equals(getString(R.string.q1)))
                            {
                                i = new Intent(BRatio1.this, Topic31Q1.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                            else if (topicQ.equals(getString(R.string.q2)))
                            {
                                i = new Intent(BRatio1.this, Topic31Q2.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                            else if (topicQ.equals(getString(R.string.q3)))
                            {
                                i = new Intent(BRatio1.this, Topic31Q3.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                            else if (topicQ.equals(getString(R.string.q4)))
                            {
                                i = new Intent(BRatio1.this, Topic31Q4.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                            else
                            {
                                i = new Intent(BRatio1.this, Topic31Vid1.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                        }
                    else if (topic.equals(getString(R.string.topic32))) // "Writing algebraic expressions":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic32Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic33))) // "Writing algebraic expressions - word problems":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic33Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic33Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic33Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic33Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic34))) // "Distributive property with variables":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic34Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic34Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic34Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic34Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic34Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic35))) // "Combining like terms":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic35Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic35Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic35Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic35Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic36)))
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic36Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic36Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic37))) // "Combining like terms":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic37Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic37Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic38))) // "Equivalent expressions: distribution + combination":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic38Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic39))) // "One-step equations (addition and subtraction)":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic39Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic40))) // "One-step equations (multiplication and division)":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic40Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic40Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic40Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic40Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic40Q5.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic41))) // "Finding mistakes in one-step equations":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic41Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic41Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic41Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic41Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q5)))
                        {
                            i = new Intent(BRatio1.this, Topic41Q5.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic41Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic42))) // "One-step equations - word problems":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic42Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic42Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic42Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic42Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic43))) // "Inequalities with variables":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic43Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic43Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic43Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic44))) // "Graphing inequalities":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic44Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic44Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic44Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic45))) // "Parts of a triangle":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic45Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic45Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic45Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic46))) // "Area of right triangles":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic46Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic46Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic46Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic47))) // "Area of a non-right triangle":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic47Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic47Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic47Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic47Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic48))) // "Find a missing length":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic48Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic48Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic49))) // "Area of parallelograms":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic49Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic49Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic49Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic49Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic50))) // "area comp. figures":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic50Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic50Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic50Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic51))) // "identify geo shapes":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic51Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic51Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic52))) //
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic52Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic52Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic52b))) // "Identify geometric shapes":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic52bQ1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic52bQ2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic52bQ3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic52c))) //
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic52cQ1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic52cQ2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic53))) // find surface area by adding area of faces:
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic53Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic53b))) // "Volume word problems - with fractions and decimals"
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic53bQ1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic53bQ2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic54))) // Surface area - word problems
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic54Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic54Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic55))) // "Nets of polyhedra":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic55Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic55Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic56))) // "Introduction to the coordinate plane":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic56Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic56Vid1.class);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic57))) // "Area and perimeter on the coordinate plane"
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic57Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic57Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic58))) // "Drawing quadrilaterals with coordinates and calculate lengths":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic58Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic58Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic59))) // "Statistical questions (define if questions are statistic or not)":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic59Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic59Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }

                    }
                    else if (topic.equals(getString(R.string.topic60))) // "Data sets":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic60Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic60Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic60Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic60Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q5)))
                        {
                            i = new Intent(BRatio1.this, Topic60Q5.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic60Q6.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic61))) // "Frequency tables":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic61Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic61Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic61Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic61Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic62))) // "Reading dot plots":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic62Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic62Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic62Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic62Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic63))) // "Read histograms":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic63Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic63Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic63Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic64))) // "Calculate the mean":
                        {
                            if (topicQ.equals(getString(R.string.q1)))
                            {
                                i = new Intent(BRatio1.this, Topic64Q1.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                            else if (topicQ.equals(getString(R.string.q2)))
                            {
                                i = new Intent(BRatio1.this, Topic64Q2.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                            else if (topicQ.equals(getString(R.string.q3)))
                            {
                                i = new Intent(BRatio1.this, Topic64Q3.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                            else if (topicQ.equals(getString(R.string.q4)))
                            {
                                i = new Intent(BRatio1.this, Topic64Q4.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                            else
                            {
                                i = new Intent(BRatio1.this, Topic64Vid1.class);
                                i.putExtra("Lang", lang);
                                startActivity(i);
                            }
                        }
                    else if (topic.equals(getString(R.string.topic65))) // "Effects of shifting, adding and removing a data point (on the mean)":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic65Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic65Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic65Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic65Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }

                    }
                    else if (topic.equals(getString(R.string.topic66))) // "Calculating the median":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic66Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic66Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic66Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic66Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic66Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic67))) // "Interpreting quartiles":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic67Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic67Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic68))) // "Interquartile range (IQR)":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic68Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic68Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic68Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic68Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic69))) // "Reading box plots":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic69Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic69Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic69Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic69Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic70))) // "Creating box plots":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic70Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic71))) // "Comparing data displays":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic71Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic71Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic71Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else
                        {
                            i = new Intent(BRatio1.this, Topic71Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic72))) // "Comparing data displays":
                    {
                        if (topicQ.equals(getString(R.string.q1)))
                        {
                            i = new Intent(BRatio1.this, Topic72Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q2)))
                        {
                            i = new Intent(BRatio1.this, Topic72Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q3)))
                        {
                            i = new Intent(BRatio1.this, Topic72Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                        else if (topicQ.equals(getString(R.string.q4)))
                        {
                            i = new Intent(BRatio1.this, Topic72Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else if (topic.equals(getString(R.string.topic73))) //
                    {
                        if (topicQ.equals(getString(R.string.q1))) {
                            i = new Intent(BRatio1.this, Topic73Q1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        } else if (topicQ.equals(getString(R.string.q2))) {
                            i = new Intent(BRatio1.this, Topic73Q2.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        } else if (topicQ.equals(getString(R.string.q3))) {
                            i = new Intent(BRatio1.this, Topic73Q3.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        } else if (topicQ.equals(getString(R.string.q4))) {
                            i = new Intent(BRatio1.this, Topic73Q4.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        } else if (topicQ.equals(getString(R.string.q5))) {
                            i = new Intent(BRatio1.this, Topic73Q5.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        } else {
                            i = new Intent(BRatio1.this, Topic73Vid1.class);
                            i.putExtra("Lang", lang);
                            startActivity(i);
                        }
                    }
                    else
                    {
                        int o;
                    }

                }
            }
        );
    }
}