package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.administrator.myapplication.utilites.MyTestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTestUtil util = new MyTestUtil();

        TextView tv = (TextView) findViewById(R.id.myTextView);
        tv.setText(util.getValue());

        for (int counter = 0; counter < 10; counter++) {
            Log.i("lilong", "value " + counter);
        }
    }
}
