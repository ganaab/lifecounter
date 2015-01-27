package edu.washington.ganaab.lifecounter;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends Activity {
    int counter = 20;
    int counter2 = 20;
    int counter3 = 20;
    int counter4 = 20;
    int[] players = new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        if (savedInstanceState == null){
            Arrays.fill(players, 20);
        } else {
            final TextView text5 = (TextView) findViewById(R.id.textView5);
            final TextView text6 = (TextView) findViewById(R.id.textView6);
            final TextView text7 = (TextView) findViewById(R.id.textView7);
            final TextView text8 = (TextView) findViewById(R.id.textView8);
            players = savedInstanceState.getIntArray("players");
            counter = players[0];
            counter2 = players[1];
            counter3 = players[2];
            counter4 = players[3];
            text5.setText("Score: " + counter);
            text6.setText("Score: " + counter2);
            text7.setText("Score: " + counter3);
            text8.setText("Score: " + counter4);
        }

    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        players[0] = counter;
        players[1] = counter2;
        players[2] = counter3;
        players[3] = counter4;
        savedInstanceState.putIntArray("players", players);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void p1m1(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text5 = (TextView) findViewById(R.id.textView5);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        counter--;
        if (counter <= 0) {
            text9.setText("Player 1 LOSES!");
        }
        text5.setText("Score: " + counter);
    }
    public void p1p1(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text5 = (TextView) findViewById(R.id.textView5);
        counter++;
        text5.setText("Score: " + counter);
    }
    public void p1m5(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text5 = (TextView) findViewById(R.id.textView5);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        counter = counter - 5;
        if (counter <= 0) {
            text9.setText("Player 1 LOSES!");
        }
        text5.setText("Score: " + counter);
    }
    public void p1p5(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text5 = (TextView) findViewById(R.id.textView5);
        counter = counter + 5;
        text5.setText("Score: " + counter);
    }
    public void p2m1(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text6 = (TextView) findViewById(R.id.textView6);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        counter2--;
        if (counter2 <= 0) {
            text9.setText("Player 2 LOSES!");
        }
        text6.setText("Score: " + counter2);
    }
    public void p2p1(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text6 = (TextView) findViewById(R.id.textView6);
        counter2++;
        text6.setText("Score: " + counter2);
    }
    public void p2m5(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text6 = (TextView) findViewById(R.id.textView6);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        counter2 = counter2 - 5;
        if (counter2 <= 0) {
            text9.setText("Player 2 LOSES!");
        }
        text6.setText("Score: " + counter2);
    }
    public void p2p5(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text6 = (TextView) findViewById(R.id.textView6);
        counter2 = counter2 + 5;
        text6.setText("Score: " + counter2);
    }
    public void p3m1(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text7 = (TextView) findViewById(R.id.textView7);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        counter3--;
        if (counter3 <= 0) {
            text9.setText("Player 3 LOSES!");
        }
        text7.setText("Score: " + counter3);
    }
    public void p3p1(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text7 = (TextView) findViewById(R.id.textView7);
        counter3++;
        text7.setText("Score: " + counter3);
    }
    public void p3m5(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text7 = (TextView) findViewById(R.id.textView7);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        counter3 = counter3 - 5;
        if (counter3 <= 0) {
            text9.setText("Player 3 LOSES!");
        }
        text7.setText("Score: " + counter3);
    }
    public void p3p5(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text7 = (TextView) findViewById(R.id.textView7);
        counter3 = counter3 + 5;
        text7.setText("Score: " + counter3);
    }
    public void p4m1(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text8 = (TextView) findViewById(R.id.textView8);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        counter4--;
        if (counter4 <= 0) {
            text9.setText("Player 4 LOSES!");
        }
        text8.setText("Score: " + counter4);
    }
    public void p4p1(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text8 = (TextView) findViewById(R.id.textView8);
        counter4++;
        text8.setText("Score: " + counter4);
    }
    public void p4m5(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text8 = (TextView) findViewById(R.id.textView8);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        counter4 = counter4 - 5;
        if (counter4 <= 0) {
            text9.setText("Player 4 LOSES!");
        }
        text8.setText("Score: " + counter4);
    }
    public void p4p5(View view) {
        // Do something in response to button click
        Button button = (Button) findViewById(R.id.button);
        TextView text8 = (TextView) findViewById(R.id.textView8);
        counter4 = counter4 + 5;
        text8.setText("Score: " + counter4);
    }
}
