package com.example.mo.breastcancerscreening;

/**
 * Created by mo on 12/27/16.
 */

public class QuestionMaker {
    static String[] questions = {"How old are you?","What is your race/ethnicity? Please select one:","How old were you at your first menstrual period?","Have you had any children?","How old were you when your 1st child was born?","Have you ever had a breast biopsy?","Have you ever been diagnosed with atypical ductal hyperplasia of the breast",
            "How many of your first-degree relatives (mother, sisters, daughters) have had breast cancer?","Have any of your first degree relatives (mother, sisters, daughters) had ovarian cancer?","Have you ever been diagnosed with breast cancer?","Have you ever been diagnosed with ductal carcinoma in situ (DCIS) or lobular carcinoma in situ (LCIS)?"
            ,"Have you ever been told that you carry a genetic mutation for the BRCA1 or BRCA2 gene?","Have you ever had radiation therapy to the chest for another medical condition?"};

    String ques1;
    String ques2;
    String ques3;
    String ques4;
    String ques5;
    String ques6;
    String ques7;
    String ques8;
    String ques9;
    String ques10;
    String ques11;

    String quesP1;
    String quesP2;
    String quesP3;
    String quesP4;



    static {

        for(int i = 0; i <= questions.length; i++){

        }

    }

    public boolean hasFollwup(){


        return false;
    }

    public String NextQuestion(){

        return null;
    }

    public String FirstQuestion(){
        return null;
    }
}
