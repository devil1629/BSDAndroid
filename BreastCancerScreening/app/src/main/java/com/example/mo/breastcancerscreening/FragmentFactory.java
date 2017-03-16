package com.example.mo.breastcancerscreening;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFactory extends Fragment {

    String[] questions = {"How old are you?","What is your race/ethnicity? Please select one:","How old were you at your first menstrual period?","Have you had any children?","Have you ever had a breast biopsy?","Have you ever been diagnosed with atypical ductal hyperplasia of the breast","How many of your first-degree relatives (mother, sisters, daughters) have had breast cancer?"
    ,"Have any of your first degree relatives (mother, sisters, daughters) had ovarian cancer?","Have you ever been diagnosed with breast cancer?","Have you ever been diagnosed with ductal carcinoma in situ (DCIS) or lobular carcinoma in situ (LCIS)?"
    ,"Have you ever been told that you carry a genetic mutation for the BRCA1 or BRCA2 gene?","Have you ever had radiation therapy to the chest for another medical condition?"};

    String[] Questypes = {"yesOno","spinner","ethnicity","yesOnoOdont","number","age"};
    String[] extraQues = {"Please select one:","How old were you when your 1st child was born?","How many breast biopsies (positive or negative) have you had?","Were any of them under age 50 when they were diagnosed?"};
    int questionNum = 0;
    HashMap<Integer,String> quesInfoMap = new HashMap();
    HashMap<String,String> specialQuesMap = new HashMap();

    Spinner spin;
    RadioGroup rgb_age;
    RadioGroup rgb_eth;
    RadioGroup rgb_yn;
    RadioGroup rgb_ynm;
    TextView tvq;
    Button bt;

    public FragmentFactory() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View vw = inflater.inflate(R.layout.fragment_fragment_factory, container, false);
/*
        tvq = (TextView) vw.findViewById(R.id.textQues);
        bt = (Button) vw.findViewById(R.id.fragYes);
        rgb_yn = (RadioGroup) vw.findViewById(R.id.radioG_Q_YN);
        rgb_ynm = (RadioGroup) vw.findViewById(R.id.radioG_Q_YNM);
        rgb_eth = (RadioGroup) vw.findViewById(R.id.radioG_Ethnicity);
        rgb_age = (RadioGroup) vw.findViewById(R.id.radioG_Age);
        spin = (Spinner) vw.findViewById(R.id.spinner);


        rgb_yn.setVisibility(View.INVISIBLE);
        rgb_eth.setVisibility(View.INVISIBLE);
        rgb_ynm.setVisibility(View.INVISIBLE);
        rgb_age.setVisibility(View.INVISIBLE);
        quesMap();

        if(questionNum == 0) {
            tvq.setText(questions[questionNum]);
            questionNum++;

        }

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionNum <= 11) {
                    save();
                    Reset();
                    tvq.setText(questions[questionNum]);



                if(quesInfoMap.get(questionNum) == "yesOno") {
                     rgb_yn.setVisibility(View.VISIBLE);
                     spin.setVisibility(View.INVISIBLE);
                     rgb_eth.setVisibility(View.INVISIBLE);
                     rgb_ynm.setVisibility(View.INVISIBLE);
                     rgb_age.setVisibility(View.INVISIBLE);
                }

                 if(quesInfoMap.get(questionNum) == "ethnicity") {
                     rgb_eth.setVisibility(View.VISIBLE);
                     spin.setVisibility(View.INVISIBLE);
                     rgb_ynm.setVisibility(View.INVISIBLE);
                     rgb_age.setVisibility(View.INVISIBLE);
                     rgb_yn.setVisibility(View.INVISIBLE);
                    }
                 if(quesInfoMap.get(questionNum) == "age") {
                        rgb_age.setVisibility(View.VISIBLE);
                        rgb_yn.setVisibility(View.INVISIBLE);
                        rgb_ynm.setVisibility(View.INVISIBLE);
                        spin.setVisibility(View.INVISIBLE);
                        rgb_eth.setVisibility(View.INVISIBLE);
                    }
                 if(quesInfoMap.get(questionNum) == "yesOnoOdont") {
                        rgb_ynm.setVisibility(View.VISIBLE);
                        rgb_yn.setVisibility(View.INVISIBLE);
                        rgb_age.setVisibility(View.INVISIBLE);
                        spin.setVisibility(View.INVISIBLE);
                        rgb_eth.setVisibility(View.INVISIBLE);
                    }

                    questionNum++;
                }
                else{
                    save();

                    rgb_ynm.setVisibility(View.INVISIBLE);
                    rgb_yn.setVisibility(View.INVISIBLE);
                    rgb_age.setVisibility(View.INVISIBLE);
                    spin.setVisibility(View.INVISIBLE);
                    rgb_eth.setVisibility(View.INVISIBLE);


                    Context context = getActivity();
                    SharedPreferences sharedPref = context.getSharedPreferences(
                            "userInfo", Context.MODE_PRIVATE);

                    String Ques = questions[0];
                    String ans = sharedPref.getString(questions[0],"");

                    tvq.setText("Questions are finished." + Ques +":  " +ans);
                }
            }
        });
*/

        return vw;
    }

    public void quesMap(){


        quesInfoMap.put(0,"spinner");
        quesInfoMap.put(1,"ethnicity");
        quesInfoMap.put(2,"age");
        quesInfoMap.put(3,"yesOno");
        quesInfoMap.put(4,"yesOnoOdont");
        quesInfoMap.put(5,"yesOnoOdont");
        quesInfoMap.put(6,"num");
        quesInfoMap.put(7,"yesOnoOdont");
        quesInfoMap.put(8,"yesOnoOdont");
        quesInfoMap.put(9,"yesOnoOdont");
        quesInfoMap.put(10,"yesOnoOdont");
        quesInfoMap.put(11,"yesOnoOdont");

        specialQuesMap.put("What is your race/ethnicity? Please select one:","Please select one:");
        specialQuesMap.put("Have you had any children?","How old were you when your 1st child was born?");
        specialQuesMap.put("","");

    }

    public void save(){
        Context context = getActivity();
        SharedPreferences sharedPref = context.getSharedPreferences(
                "userInfo", Context.MODE_PRIVATE);

        String question;
        String answer = null;
        String type;

        question = questions[questionNum-1];
        type     = quesInfoMap.get(questionNum-1);

        if(type == "spinner"){
        answer  =  spin.getSelectedItem().toString();
        }
        System.out.print(answer);
        System.out.print(type);

        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(question,answer);
        edit.commit();

    }

    public void Reset(){

        rgb_age.clearCheck();
        rgb_eth.clearCheck();
        rgb_yn.clearCheck();
        rgb_ynm.clearCheck();

    }

}
