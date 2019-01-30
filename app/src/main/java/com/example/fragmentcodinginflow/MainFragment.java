package com.example.fragmentcodinginflow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private static final String ARG_TEXT = "argText";
    private static final String ARG_NUMBER = "argNumber";

    private String text;
    private int num;


    public static MainFragment newInstance(String text, int num) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, "This is wizardry");
        args.putInt(ARG_NUMBER, 3);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v;
        TextView textView;
        v = inflater.inflate(R.layout.fragment_main, container, false);
        textView = v.findViewById(R.id.textview_mainfragment);


        if (getArguments() != null) {
            text = getArguments().getString(ARG_TEXT);
            num = getArguments().getInt(ARG_NUMBER);

        }

        textView.setText(text + " " + num);
        return v;
    }


}
