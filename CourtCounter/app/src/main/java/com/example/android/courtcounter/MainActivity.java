package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0,scoreB=0;

    public void displayA(int x)
    {
        TextView t=(TextView) findViewById(R.id.score_text_view_a);
        t.setText(""+x);
    }
    public void threePointsA(View view)
    {
        scoreA+=3;
        displayA(scoreA);
    }

    public void twoPointsA(View view)
    {
        scoreA+=2;
        displayA(scoreA);
    }

    public void freePointsA(View view)
    {
        scoreA+=1;
        displayA(scoreA);
    }

    public void displayB(int x)
    {
        TextView t=(TextView) findViewById(R.id.score_text_view_b);
        t.setText(""+x);
    }
    public void threePointsB(View view)
    {
        scoreB+=3;
        displayB(scoreB);
    }

    public void twoPointsB(View view)
    {
        scoreB+=2;
        displayB(scoreB);
    }

    public void freePointsB(View view)
    {
        scoreB+=1;
        displayB(scoreB);
    }
    public void reset(View view)
    {
        scoreA=0;
        displayA(scoreA);
        scoreB=0;
        displayB(scoreB);
    }
}
