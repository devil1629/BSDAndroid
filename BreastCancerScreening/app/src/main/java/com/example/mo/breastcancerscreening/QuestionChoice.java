package com.example.mo.breastcancerscreening;

import java.util.HashMap;

/**
 * Created by mo on 1/18/17.
 */

public class QuestionChoice {

    private String id;
    private String title;
    private HashMap<String,String> options = new HashMap();

    public QuestionChoice(String id, String title, HashMap options){
        this.id = id;
        this.title = title;
        this.options = options;


    }




}
