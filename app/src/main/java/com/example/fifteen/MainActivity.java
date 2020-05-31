package com.example.fifteen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Integer[] gameArray;
    Integer[] array;
    int empty;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;
    Button btn16;
    Button btnNewGame;
    List<Button> btnList;
    int turnCount;

    TextView tvTurnCount;

    void newGame() {
        tvTurnCount.setText("0");
        turnCount = 0;
        disableAll();
        gameArray = new Integer[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
        };
        List<Integer> intList = Arrays.asList(gameArray);
        Collections.shuffle(intList);
        intList.toArray(gameArray);
        for (int i = 0; i < gameArray.length; i++) {
            btnList.get(i).setText(String.valueOf(gameArray[i]));
            if (btnList.get(i).getText().equals("16")) {
                btnList.get(i).setText(" ");
                enaable(btnList.get(i));
                empty = i;
            }
        }
    }

    void disableAll() {
        for (int i = 0; i < btnList.size(); i++) {
            btnList.get(i).setEnabled(false);

        }
    }

    void turn(Button v) {
        turnCount++;
        tvTurnCount.setText(String.valueOf(turnCount));
        disableAll();
        int value = Integer.valueOf(String.valueOf(v.getText()));
        Log.d("qwe", String.valueOf(value));
        v.setText(" ");

        enaable(v);
        btnList.get(empty).setText(String.valueOf(value));
        for (int i = 0; i < gameArray.length; i++) {
            Log.d("qwe", String.valueOf(gameArray[i]));
            if (gameArray[i] == value) {
                gameArray[i] = 16;
                empty = i;
                Log.d("qwe", "ewrwer" + String.valueOf(gameArray[i]));
                continue;
            }


            if (gameArray[i] == 16) {
                gameArray[i] = value;
            }
        }
        Log.d("qwe", Arrays.toString(gameArray));
        if (Arrays.equals(gameArray, array)) {
            Toast.makeText(getBaseContext(), " Победа за  "+turnCount+ "ходов!", Toast.LENGTH_LONG).show();
            disableAll();
        }

    }

    void enaable(Button v) {
        for (int i = 0; i < btnList.size(); i++) {
            if (btnList.get(i).equals(v)) {

                switch (i) {
                    case 0:
                        btnList.get(1).setEnabled(true);
                        btnList.get(4).setEnabled(true);
                        break;
                    case 1:
                        btnList.get(0).setEnabled(true);
                        btnList.get(2).setEnabled(true);
                        btnList.get(5).setEnabled(true);
                        break;
                    case 2:
                        btnList.get(1).setEnabled(true);
                        btnList.get(3).setEnabled(true);
                        btnList.get(6).setEnabled(true);
                        break;
                    case 3:
                        btnList.get(2).setEnabled(true);
                        btnList.get(7).setEnabled(true);
                        break;
                    case 4:
                        btnList.get(0).setEnabled(true);
                        btnList.get(5).setEnabled(true);
                        btnList.get(8).setEnabled(true);
                        break;
                    case 5:
                        btnList.get(4).setEnabled(true);
                        btnList.get(6).setEnabled(true);
                        btnList.get(9).setEnabled(true);
                        btnList.get(1).setEnabled(true);
                        break;
                    case 6:
                        btnList.get(5).setEnabled(true);
                        btnList.get(7).setEnabled(true);

                        btnList.get(2).setEnabled(true);
                        btnList.get(10).setEnabled(true);
                        break;
                    case 7:
                        btnList.get(3).setEnabled(true);
                        btnList.get(11).setEnabled(true);
                        btnList.get(6).setEnabled(true);
                        break;
                    case 8:
                        btnList.get(9).setEnabled(true);
                        btnList.get(4).setEnabled(true);

                        btnList.get(12).setEnabled(true);
                        break;
                    case 9:
                        btnList.get(10).setEnabled(true);
                        btnList.get(8).setEnabled(true);
                        btnList.get(5).setEnabled(true);
                        btnList.get(13).setEnabled(true);
                        break;
                    case 10:

                        btnList.get(9).setEnabled(true);
                        btnList.get(11).setEnabled(true);
                        btnList.get(6).setEnabled(true);
                        btnList.get(14).setEnabled(true);
                        break;
                    case 11:
                        btnList.get(10).setEnabled(true);
                        btnList.get(7).setEnabled(true);
                        btnList.get(15).setEnabled(true);
                        break;
                    case 12:
                        btnList.get(13).setEnabled(true);
                        btnList.get(8).setEnabled(true);
                        break;
                    case 13:
                        btnList.get(14).setEnabled(true);
                        btnList.get(12).setEnabled(true);
                        btnList.get(9).setEnabled(true);
                        break;
                    case 14:
                        btnList.get(13).setEnabled(true);
                        btnList.get(15).setEnabled(true);

                        btnList.get(10).setEnabled(true);
                        break;
                    case 15:
                        btnList.get(14).setEnabled(true);
                        btnList.get(11).setEnabled(true);
                        break;
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnList = new ArrayList<>();
        btn1 = findViewById(R.id.btn_13);
        btnList.add(btn1);
        btn2 = findViewById(R.id.btn_14);
        btnList.add(btn2);
        btn3 = findViewById(R.id.btn_15);
        btnList.add(btn3);
        btn4 = findViewById(R.id.btn_16);
        btnList.add(btn4);
        btn5 = findViewById(R.id.btn_9);
        btnList.add(btn5);
        btn6 = findViewById(R.id.btn_10);
        btnList.add(btn6);
        btn7 = findViewById(R.id.btn_11);
        btnList.add(btn7);
        btn8 = findViewById(R.id.btn_12);
        btnList.add(btn8);
        btn9 = findViewById(R.id.btn_5);
        btnList.add(btn9);
        btn10 = findViewById(R.id.btn_6);
        btnList.add(btn10);
        btn11 = findViewById(R.id.btn_7);
        btnList.add(btn11);
        btn12 = findViewById(R.id.btn_8);
        btnList.add(btn12);
        btn13 = findViewById(R.id.btn_1);
        btnList.add(btn13);
        btn14 = findViewById(R.id.btn_2);
        btnList.add(btn14);
        btn15 = findViewById(R.id.btn_3);
        btnList.add(btn15);
        btn16 = findViewById(R.id.btn_4);
        btnList.add(btn16);
        tvTurnCount = findViewById(R.id.turn_count);


        btnNewGame = findViewById(R.id.btn_new_game);
        array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        for (int i = 0; i < btnList.size(); i++) {
            btnList.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    turn((Button) v);
                }
            });
            btnList.get(i).setTextSize(25);
        }
        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });
        newGame();
    }
}
