package com.mohaCompany.hpnotebook15.mouraghib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    public void openLogin(View view) {
        Intent intent = new Intent(this, Private.class);
        startActivity(intent);
    }
    public void generalInfo(View view) {
        Intent intent = new Intent(this,publicInfo.class);
        startActivity(intent);
    }
}
