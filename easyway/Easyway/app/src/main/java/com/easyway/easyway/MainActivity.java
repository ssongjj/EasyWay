package com.easyway.easyway;


import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.MotionEvent;



public class MainActivity extends AppCompatActivity {


    float initx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            initx = event.getRawX();
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            float diffx = initx - event.getRawX();
            if (diffx > 30) {
                Intent intent;
                intent = new Intent(getApplicationContext(), BusActivity.class);
                startActivity(intent);
            } else if (diffx < -30) {
                Intent intent2 = new Intent(getApplicationContext(), SubwayActivity.class);
                startActivity(intent2);
            } else if(diffx <30){
                if(diffx > -30){
                    Intent intent3 = new Intent(getApplicationContext(), LocationActivity.class);
                    startActivity(intent3);
                }
            }
        }
        return true;
    }
}






