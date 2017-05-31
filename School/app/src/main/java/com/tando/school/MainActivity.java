package com.tando.school;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Display setting icon. Using onCreateOptionsMenu method

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //cast the menu xml called settingicon into the Menu inflater
        getMenuInflater().inflate(R.menu.settingicon, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
