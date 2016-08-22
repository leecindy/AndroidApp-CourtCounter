package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void addTwoForA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void addOneForA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void displayForTeamA(int scoreA){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void addThreeForB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void addTwoForB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void addOneForB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamB(int scoreB){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
