package com.example.android.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_pointsA=0 ;
    int score_pointsB=0 ;
    private static TextView t1 , t2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score3A(View view){
        score_pointsA = score_pointsA+3 ;
        display_teamA(score_pointsA) ;
    }

    public void score2A(View view){
        score_pointsA = score_pointsA+2 ;
        display_teamA(score_pointsA) ;
    }

    public void scorefreeA(View view){
        score_pointsA = score_pointsA+1 ;
        display_teamA(score_pointsA) ;
    }

    public void display_teamA(int score_pointsA){
        t2 = (TextView)findViewById(R.id.scoreA) ;
        t2.setText(Integer.toString(score_pointsA));
    }

    public void score3B(View view){
        score_pointsB = score_pointsB+3 ;
        display_teamB(score_pointsB) ;
    }

    public void score2B(View view){
        score_pointsB = score_pointsB+2 ;
        display_teamB(score_pointsB) ;
    }

    public void scorefreeB(View view){
        score_pointsB = score_pointsB+1 ;
        display_teamB(score_pointsB) ;
    }

    public void display_teamB(int score_pointsA){
        t1 = (TextView)findViewById(R.id.scoreB) ;
        t1.setText(Integer.toString(score_pointsA));
    }

    public void reset_Score(View view){
        score_pointsA=0 ;
        score_pointsB=0 ;
        t1.setText(Integer.toString(0));
        t2.setText(Integer.toString(0));
    }
}



