package com.example.hpnotebook15.mouraghib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Private extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);
    }
    public void studentLogin(View view) {
        Intent intent = new Intent(this, StudentLoginActivity.class);
        startActivity(intent);
    }

    public void parentLogin(View view) {
        Intent intent = new Intent(this, StudentLoginActivity.class);
        startActivity(intent);
    }

    public void stuffLogin(View view) {
        Intent intent = new Intent(this, StudentLoginActivity.class);
        startActivity(intent);
    }
}
