package com.example.administrator.creatmyapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends ActionBarActivity {
private TextView mTvPassed;
    private Button mBtnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mTvPassed = (TextView)findViewById(R.id.tv_new);
        String userInput = getIntent().getStringExtra("userInput");
        Log.d("SecondActivity","传进来的是："+userInput);
        mTvPassed.setText(userInput);
        mBtnback=(Button) findViewById(R.id.btn_back);
        mBtnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i.putExtra("data","test");
                Log.d("SecondActivity","准备返回数据:" + "test");
                setResult(1,i);
                finish();
            }
        });
    }


}
