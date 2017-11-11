package com.example.momomo00.testdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.base_layout);

        if(findViewById(R.id.fragment_container) == null) {
            return;
        }

        if(savedInstanceState != null) {
            return;
        }
    }
}
