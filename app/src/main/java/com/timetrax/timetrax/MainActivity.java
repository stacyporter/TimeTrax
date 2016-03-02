package com.timetrax.timetrax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    long timer1 = 0;
    long timer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTimer1(View view) {
    }

    public void startTimer2(View view) {
    }

}