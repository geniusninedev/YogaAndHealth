package com.geniusnine.android.yogaandhealth.Tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geniusnine.android.yogaandhealth.R;

/**
 * Created by Supriya on 23-01-2017.
 */

public class Excercises  extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.home, container, false);
        return v;
    }
}
