package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsToTeamA(View view) {

        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);

    }

    public void addTwoPointsToTeamA(View view) {

        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);

    }

    public void addOnePointToTeamA(View view) {

        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void addThreePointsToTeamB(View view) {

        teamBScore = teamAScore + 3;
        displayForTeamB(teamBScore);
    }

    public void addTwoPointsToTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void addOnePointToTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    public void resetScore(View view) {

        displayForTeamA(0);
        displayForTeamB(0);
        teamAScore = 0;
        teamBScore = 0;
    }
}
