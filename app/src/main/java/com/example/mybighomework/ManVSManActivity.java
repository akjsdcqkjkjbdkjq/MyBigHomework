package com.example.mybighomework;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ManVSManActivity extends AppCompatActivity {
    int[][] place = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };
    int clock = 0;
    Boolean res = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_vsman);
    }

    public void wait_exchange() {
        ProgressBar wait1 = findViewById(R.id.man_vs_man_wait_1);
        TextView who1 = findViewById(R.id.man_vs_man_who_1);
        ProgressBar wait2 = findViewById(R.id.man_vs_man_wait_2);
        TextView who2 = findViewById(R.id.man_vs_man_who_2);
        if (set(clock).equals("O")) {
            who1.setVisibility(View.INVISIBLE);
            wait1.setVisibility(View.INVISIBLE);
            who2.setVisibility(View.VISIBLE);
            wait2.setVisibility(View.VISIBLE);
        } else {
            who1.setVisibility(View.VISIBLE);
            wait1.setVisibility(View.VISIBLE);
            who2.setVisibility(View.INVISIBLE);
            wait2.setVisibility(View.INVISIBLE);
        }
    }

    public void show_even() {
        if (clock == 9 && !res) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("GAME OVER").setMessage("EVEN").setPositiveButton("ONE MORE ROUND", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    recreate();
                }
            }).setNegativeButton("END", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.create().show();
        }
    }

    public void man_vs_man_place_1(View v) {
        if (place[0][0] == 0) {
            TextView place1 = findViewById(R.id.man_vs_man_place_1);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[0][0] = 1;
            } else {
                place[0][0] = -1;
            }
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
        }
    }

    public void man_vs_man_place_2(View v) {
        if (place[0][1] == 0) {
            TextView place1 = findViewById(R.id.man_vs_man_place_2);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[0][1] = 1;
            } else {
                place[0][1] = -1;
            }
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
        }
    }

    public void man_vs_man_place_3(View v) {
        if (place[0][2] == 0) {
            TextView place1 = findViewById(R.id.man_vs_man_place_3);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[0][2] = 1;
            } else {
                place[0][2] = -1;
            }
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
        }
    }

    public void man_vs_man_place_4(View v) {
        if (place[1][0] == 0) {
            TextView place1 = findViewById(R.id.man_vs_man_place_4);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[1][0] = 1;
            } else {
                place[1][0] = -1;
            }
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
        }
    }

    public void man_vs_man_place_5(View v) {
        if (place[1][1] == 0) {
            TextView place1 = findViewById(R.id.man_vs_man_place_5);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[1][1] = 1;
            } else {
                place[1][1] = -1;
            }
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
        }
    }

    public void man_vs_man_place_6(View v) {
        if (place[1][2] == 0) {
            TextView place1 = findViewById(R.id.man_vs_man_place_6);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[1][2] = 1;
            } else {
                place[1][2] = -1;
            }
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
        }
    }

    public void man_vs_man_place_7(View v) {
        if (place[2][0] == 0) {
            TextView place1 = findViewById(R.id.man_vs_man_place_7);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[2][0] = 1;
            } else {
                place[2][0] = -1;
            }
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
        }
    }

    public void man_vs_man_place_8(View v) {
        if (place[2][1] == 0) {
            TextView place1 = findViewById(R.id.man_vs_man_place_8);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[2][1] = 1;
            } else {
                place[2][1] = -1;
            }
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
        }
    }

    public void man_vs_man_place_9(View v) {
        if (place[2][2] == 0) {
            TextView place1 = findViewById(R.id.man_vs_man_place_9);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[2][2] = 1;
            } else {
                place[2][2] = -1;
            }
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
        }
    }

    public String set(int c) {
        if (c % 2 == 0) {
            return "O";
        } else {
            return "X";
        }
    }

    public void show_O_win() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("GAME OVER").setMessage("WINNER IS O").setPositiveButton("ONE MORE ROUND", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        }).setNegativeButton("END", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.create().show();
    }

    public void show_X_win() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("GAME OVER").setMessage("WINNER IS X").setPositiveButton("ONE MORE ROUND", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        }).setNegativeButton("END", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.create().show();
    }

    public void judge_horizontal() {
        for (int i = 0; i < 3; i++) {
            int k = 0;
            for (int j = 0; j < 3; j++) {
                k += place[i][j];
            }
            if (k == 3) {
                res = true;
                show_O_win();
                break;
            } else if (k == -3) {
                res = true;
                show_X_win();
                break;
            }
        }
    }

    public void judge_vertical() {
        for (int i = 0; i < 3; i++) {
            int k = 0;
            for (int j = 0; j < 3; j++) {
                k += place[j][i];
            }
            if (k == 3) {
                res = true;
                show_O_win();
                break;
            } else if (k == -3) {
                res = true;
                show_X_win();
                break;
            }
        }
    }

    public void judge_cross() {
        int x = place[0][0] + place[1][1] + place[2][2];
        int y = place[0][2] + place[1][1] + place[2][0];
        if (x == 3 || y == 3) {
            res = true;
            show_O_win();
        } else if (x == -3 || y == -3) {
            res = true;
            show_X_win();
        }
    }
}