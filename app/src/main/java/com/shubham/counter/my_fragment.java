package com.shubham.counter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class my_fragment extends Fragment {

    private String myStr;
    private TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my_fragment, container, false);

        tv = v.findViewById(R.id.my_textview);

        Bundle data = getArguments();
        if(data != null){
            myStr = data.getString("count");
        }

        tv.setText(myStr);
        return v;
    }
}