package com.example.olesya.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int teamApoint=0;
    int teamBpoint=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/

    //team A

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.txt_team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view){
        teamApoint=teamApoint+3;
        displayForTeamA(teamApoint);
    }
    public void addTwoForTeamA(View view){
        teamApoint=teamApoint+2;
        displayForTeamA(teamApoint);
    }
    public void addFreeThrowForTeamA(View view){
        teamApoint=teamApoint+1;
        displayForTeamA(teamApoint);
    }



    //team B

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.txt_team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View view){
        teamBpoint=teamBpoint+3;
        displayForTeamB(teamBpoint);
    }
    public void addTwoForTeamB(View view){
        teamBpoint=teamBpoint+2;
        displayForTeamB(teamBpoint);
    }
    public void addFreeThrowForTeamB(View view){
        teamBpoint=teamBpoint+1;
        displayForTeamB(teamBpoint);
    }

//reset point
    public void resetForTeam(View view) {
        teamApoint = 0;
        teamBpoint = 0;
        displayForTeamA(teamApoint);
        displayForTeamB(teamBpoint);
    }
}