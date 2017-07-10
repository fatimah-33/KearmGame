package app.qadheeb.fatimah.kearmgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textPlayerOne;
    TextView textPlayerTwo;
    TextView textPlayerThree;
    TextView textPlayerFour;
    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;
    int scorePlayerThree = 0;
    int scorePlayerFour = 0;
    Button five_points_player_one;
    Button ten_points_player_one;
    Button fifty_points_player_one;
    Button sub_five_points_player_one;
    Button five_points_player_two;
    Button ten_points_player_two;
    Button fifty_points_player_two;
    Button sub_five_points_player_two;
    Button five_points_player_three;
    Button ten_points_player_three;
    Button fifty_points_player_three;
    Button sub_five_points_player_three;
    Button five_points_player_four;
    Button ten_points_player_four;
    Button fifty_points_player_four;
    Button sub_five_points_player_four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textPlayerOne = (TextView) findViewById(R.id.score_for_player_one);
        textPlayerTwo = (TextView) findViewById(R.id.score_for_player_two);
        textPlayerThree = (TextView) findViewById(R.id.score_for_player_three);
        textPlayerFour = (TextView) findViewById(R.id.score_for_player_four);
        five_points_player_one = (Button) findViewById(R.id.five_points_player_one);
        ten_points_player_one = (Button) findViewById(R.id.ten_points_player_one);
        fifty_points_player_one = (Button) findViewById(R.id.fifty_points_player_one);
        sub_five_points_player_one = (Button) findViewById(R.id.sub_five_points_player_one);
        five_points_player_two = (Button) findViewById(R.id.five_points_player_two);
        ten_points_player_two = (Button) findViewById(R.id.ten_points_player_two);
        fifty_points_player_two = (Button) findViewById(R.id.fifty_points_player_two);
        sub_five_points_player_two = (Button) findViewById(R.id.sub_five_points_player_two);
        five_points_player_three = (Button) findViewById(R.id.five_points_player_three);
        ten_points_player_three = (Button) findViewById(R.id.ten_points_player_three);
        fifty_points_player_three = (Button) findViewById(R.id.fifty_points_player_three);
        sub_five_points_player_three = (Button) findViewById(R.id.sub_five_points_player_three);
        five_points_player_four = (Button) findViewById(R.id.five_points_player_four);
        ten_points_player_four = (Button) findViewById(R.id.ten_points_player_four);
        fifty_points_player_four = (Button) findViewById(R.id.fifty_points_player_four);
        sub_five_points_player_four = (Button) findViewById(R.id.sub_five_points_player_four);
        five_points_player_one.setOnClickListener(this);
        ten_points_player_one.setOnClickListener(this);
        fifty_points_player_one.setOnClickListener(this);
        sub_five_points_player_one.setOnClickListener(this);
        five_points_player_two.setOnClickListener(this);
        ten_points_player_two.setOnClickListener(this);
        fifty_points_player_two.setOnClickListener(this);
        sub_five_points_player_two.setOnClickListener(this);
        five_points_player_three.setOnClickListener(this);
        ten_points_player_three.setOnClickListener(this);
        fifty_points_player_three.setOnClickListener(this);
        sub_five_points_player_three.setOnClickListener(this);
        five_points_player_four.setOnClickListener(this);
        ten_points_player_four.setOnClickListener(this);
        fifty_points_player_four.setOnClickListener(this);
        sub_five_points_player_four.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.five_points_player_one:
                scorePlayerOne += 5;
                displayscorePlayerOne(scorePlayerOne);
                break;
            case R.id.ten_points_player_one:
                scorePlayerOne += 10;
                displayscorePlayerOne(scorePlayerOne);
                break;
            case R.id.fifty_points_player_one:
                scorePlayerOne += 50;
                displayscorePlayerOne(scorePlayerOne);
                break;
            case R.id.sub_five_points_player_one:
                scorePlayerOne -= 5;
                displayscorePlayerOne(scorePlayerOne);
                break;
            case R.id.five_points_player_two:
                scorePlayerTwo += 5;
                displayscorePlayerTwo(scorePlayerTwo);
                break;
            case R.id.ten_points_player_two:
                scorePlayerTwo += 10;
                displayscorePlayerTwo(scorePlayerTwo);
                break;
            case R.id.fifty_points_player_two:
                scorePlayerTwo += 50;
                displayscorePlayerTwo(scorePlayerTwo);
                break;
            case R.id.sub_five_points_player_two:
                scorePlayerTwo -= 5;
                displayscorePlayerTwo(scorePlayerTwo);
                break;
            case R.id.five_points_player_three:
                scorePlayerThree += 5;
                displayscorePlayerThree(scorePlayerThree);
                break;
            case R.id.ten_points_player_three:
                scorePlayerThree += 10;
                displayscorePlayerThree(scorePlayerThree);
                break;
            case R.id.fifty_points_player_three:
                scorePlayerThree += 50;
                displayscorePlayerThree(scorePlayerThree);
                break;
            case R.id.sub_five_points_player_three:
                scorePlayerThree -= 5;
                displayscorePlayerThree(scorePlayerThree);
                break;
            case R.id.five_points_player_four:
                scorePlayerFour += 5;
                displayscorePlayerFour(scorePlayerFour);
                break;
            case R.id.ten_points_player_four:
                scorePlayerFour += 10;
                displayscorePlayerFour(scorePlayerFour);
                break;
            case R.id.fifty_points_player_four:
                scorePlayerFour += 50;
                displayscorePlayerFour(scorePlayerFour);
                break;
            case R.id.sub_five_points_player_four:
                scorePlayerFour -= 5;
                displayscorePlayerFour(scorePlayerFour);
                break;
        }
    }
    //display score for player one
    public void displayscorePlayerOne(int score) {
        textPlayerOne.setText(String.valueOf(score));
    }
    //display score for player two
    public void displayscorePlayerTwo(int score) {
        textPlayerTwo.setText(String.valueOf(score));
    }
    //display score for player three
    public void displayscorePlayerThree(int score) {
        textPlayerThree.setText(String.valueOf(score));
    }
    //display score for player four
    public void displayscorePlayerFour(int score) {

        textPlayerFour.setText(String.valueOf(score));
    }
    //reset button for all players
    public void resetButton(View v) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        scorePlayerThree = 0;
        scorePlayerFour = 0;
        displayscorePlayerOne(scorePlayerOne);
        displayscorePlayerTwo(scorePlayerTwo);
        displayscorePlayerThree(scorePlayerThree);
        displayscorePlayerFour(scorePlayerFour);
    }
}
