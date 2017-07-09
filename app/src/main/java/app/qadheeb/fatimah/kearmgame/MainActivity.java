package app.qadheeb.fatimah.kearmgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textPlayer1;
    TextView textPlayer2;
    TextView textPlayer3;
    TextView textPlayer4;
    int player1 = 0;
    int player2 = 0;
    int player3 = 0;
    int player4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textPlayer1 = (TextView) findViewById(R.id.s1);
        textPlayer2 = (TextView) findViewById(R.id.s2);
        textPlayer3 = (TextView) findViewById(R.id.s3);
        textPlayer4 = (TextView) findViewById(R.id.s4);
    }

    //methods for player 1
    public void plusFivePoints(View v) {
        player1 = player1 + 5;
        displayPlayer1(player1);
    }

    public void plusTenPoints(View v) {
        player1 = player1 + 10;
        displayPlayer1(player1);

    }

    public void plusFivetyPoints(View v) {
        player1 = player1 + 50;
        displayPlayer1(player1);

    }

    public void subFivePoints(View v) {
        player1 = player1 - 5;
        displayPlayer1(player1);

    }

    //methods for player 2
    public void plusFivePoints2(View v) {
        player2 = player2 + 5;
        displayPlayer2(player2);

    }

    public void plusTenPoints2(View v) {
        player2 = player2 + 10;
        displayPlayer2(player2);

    }

    public void plusFivetyPoints2(View v) {
        player2 = player2 + 50;
        displayPlayer2(player2);

    }

    public void subFivePoints2(View v) {
        player2 = player2 - 5;
        displayPlayer2(player2);

    }

    //methods for player 3
    public void plusFivePoints3(View v) {
        player3 = player3 + 5;
        displayPlayer3(player3);

    }

    public void plusTenPoints3(View v) {
        player3 = player3 + 10;
        displayPlayer3(player3);

    }

    public void plusFivetyPoints3(View v) {
        player3 = player3 + 50;
        displayPlayer3(player3);

    }

    public void subFivePoints3(View v) {
        player3 = player3 - 5;
        displayPlayer3(player3);

    }

    //methods for player 4
    public void plusFivePoints4(View v) {
        player4 = player4 + 5;
        displayPlayer4(player4);

    }

    public void plusTenPoints4(View v) {
        player4 = player4 + 10;
        displayPlayer4(player4);

    }

    public void plusFivetyPoints4(View v) {
        player4 = player4 + 50;
        displayPlayer4(player4);

    }

    public void subFivePoints4(View v) {
        player4 = player4 - 5;
        displayPlayer4(player4);

    }

    //score for player 1
    public void displayPlayer1(int score) {

        textPlayer1.setText(String.valueOf(score));
    }
    //score for player 2

    public void displayPlayer2(int score) {
        textPlayer2.setText(String.valueOf(score));
    }
    //score for player 3

    public void displayPlayer3(int score) {

        textPlayer3.setText(String.valueOf(score));
    }

    //score for player 4
    public void displayPlayer4(int score) {

        textPlayer4.setText(String.valueOf(score));
    }

    //reset button
    public void resetButton(View v) {
        textPlayer1.setText(String.valueOf(0));
        textPlayer2.setText(String.valueOf(0));
        textPlayer3.setText(String.valueOf(0));
        textPlayer4.setText(String.valueOf(0));
    }
}
