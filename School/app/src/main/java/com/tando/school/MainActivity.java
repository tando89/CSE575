package com.tando.school;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

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
    //Called a boolean called onOptionsItemSelected

    @Override
    //Called when a panel's menu is opened by the user
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            //case that the user clicks on the setting icon
            case R.id.settingsIcon:
                //when the user clicks, it open a loadPreferenceActivity
                Intent intent = new Intent(this, loadPreferenceActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
