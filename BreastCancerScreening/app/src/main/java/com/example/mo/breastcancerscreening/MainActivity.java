package com.example.mo.breastcancerscreening;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements Serializable{

    Survey survey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView introText1View = (TextView) findViewById(R.id.introText1);
        StringBuilder introText2 = new StringBuilder();

        introText2.append("\u2022 Should you start in your 40's or wait until you are 50?");
        introText2.append("\n");
        introText2.append("\u2022 Should you have a mammogram every year or every other year?");

        introText1View.setText(introText2);

    }

    public void quesView(View view){
        HashMap<String,String> options= new HashMap<>();
        QuestionChoice ques1 = new QuestionChoice("q1","How old are you?", options);
        QuestionChoice ques2 = new QuestionChoice("q2","What is your race/ethnicity? Please select one:", options);
        QuestionChoice ques3 = new QuestionChoice("q3","How old were you at your first menstrual period?", options);
        QuestionChoice ques4 = new QuestionChoice("q4","Have you had any children?", options);
        QuestionChoice ques5 = new QuestionChoice("q5","Have you ever had a breast biopsy?", options);

        ArrayList<QuestionChoice> questions= new ArrayList<>();
        questions.add(ques1);
        questions.add(ques2);
        questions.add(ques3);
        questions.add(ques4);
        questions.add(ques5);

        survey = new Survey(questions);
        Intent intent = new Intent(this,quesfragments.class);
        startActivity(intent);
      //  intent.putExtra("survey", (Serializable) survey);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
