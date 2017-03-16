package com.example.mo.breastcancerscreening;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class Q1Fragment extends Fragment{

       private View vw;

    public Q1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vw =  inflater.inflate(R.layout.fragment_q1,container,false);

        Button bt = (Button) vw.findViewById(R.id.fragYesq1);


        return vw;
    }


}
