package youtube.demo.youtubedemo.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import youtube.demo.youtubedemo.R;

public class fragment_smokeno extends Fragment {

    String print;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bmi, container, false);




            print = "Low Risk";


        TextView textView2 = (TextView) view.findViewById(R.id.textView2);
        textView2.setText(print);


        return view;
    }
}
