package com.ttp.pmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> list = new ArrayList<>();
        if(null != list && list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                Toast.makeText(this, list.get(i), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
