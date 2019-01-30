package com.example.fragmentcodinginflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment fragment = MainFragment.newInstance("some text", 321);


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit();


    }

}
