package com.ttp.checkstylefindbugspmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = null;
        ((TextView) findViewById(R.id.text1)).setText(str);
        findBugs();
    }

    private boolean findBugs() {
        return "false".equals(false);
    }
}
