package com.example.abc.mems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createClick(String top, String bottom) {
bottomsectionfragment bottomsfragment = (bottomsectionfragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomsfragment.setMemeText(top,bottom);
     }
}
