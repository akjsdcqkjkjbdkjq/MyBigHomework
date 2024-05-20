package com.example.mybighomework;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ManVSAIActivity extends AppCompatActivity {
    int[][] place = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };
    int isaifirst = 1;//Math.abs((new Random(System.currentTimeMillis())).nextInt()) % 2;
    int clock = 0;
    Boolean res = false;
    int[] history = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_vsaiactivity);
        wait_exchange();
        if (isaifirst == 1) {
            man_vs_ai_place_1(findViewById(R.id.man_vs_man_place_1));
        }
    }
//        162
//        597
//        483
    public void ai_turn() {
        if (isaifirst == 1) {
            if (clock == 2 && history[1] != 2 && history[1] != 3) {
                man_vs_ai_place_3(findViewById(R.id.man_vs_man_place_3));
            } else if (clock == 2 && history[1] != 4 && history[1] != 7) {
                man_vs_ai_place_7(findViewById(R.id.man_vs_man_place_7));
            }
            if (history[2] == 3) {
                if (clock == 4 && history[3] != 2) {
                    man_vs_ai_place_2(findViewById(R.id.man_vs_man_place_2));
                } else if (clock == 4 && history[1] == 8) {
                    man_vs_ai_place_5(findViewById(R.id.man_vs_man_place_5));
                } else if (clock == 4 && history[1] == 5) {
                    man_vs_ai_place_8(findViewById(R.id.man_vs_man_place_8));
                } else if (clock == 4 && (history[1] == 6 || history[1] == 9)) {
                    man_vs_ai_place_7(findViewById(R.id.man_vs_man_place_7));
                } else if (clock == 4 && (history[1] == 4 || history[1] == 7)) {
                    man_vs_ai_place_9(findViewById(R.id.man_vs_man_place_9));
                }
                if (history[4] == 5) {
                    if (clock == 6 && history[5] != 7) {
                        man_vs_ai_place_7(findViewById(R.id.man_vs_man_place_7));
                    } else if (clock == 6 && history[5] != 9) {
                        man_vs_ai_place_9(findViewById(R.id.man_vs_man_place_9));
                    }
                } else if (history[4] == 7) {
                    if (clock == 6 && history[5] != 5) {
                        man_vs_ai_place_5(findViewById(R.id.man_vs_man_place_5));
                    } else if (clock == 6 && history[5] != 4) {
                        man_vs_ai_place_4(findViewById(R.id.man_vs_man_place_4));
                    }
                } else if (history[4] == 9) {
                    if (clock == 6 && history[5] != 5) {
                        man_vs_ai_place_5(findViewById(R.id.man_vs_man_place_5));
                    } else if (clock == 6 && history[5] != 6) {
                        man_vs_ai_place_6(findViewById(R.id.man_vs_man_place_6));
                    }
                } else if (history[4] == 8) {
                    if (clock == 6 && (history[5] == 6 || history[5] == 9)) {
                        man_vs_ai_place_4(findViewById(R.id.man_vs_man_place_4));
                    } else if (clock == 6 && (history[5] == 4 || history[5] == 7)) {
                        man_vs_ai_place_6(findViewById(R.id.man_vs_man_place_6));
                    }
                    if (history[6] == 6) {
                        if (clock == 8 && (history[7] == 4 || history[7] == 7)) {
                            man_vs_ai_place_9(findViewById(R.id.man_vs_man_place_9));
                        } else if (clock == 8 && history[7] == 9 && history[5] == 7) {
                            man_vs_ai_place_4(findViewById(R.id.man_vs_man_place_4));
                        } else if (clock == 8 && history[7] == 9 && history[5] == 4) {
                            man_vs_ai_place_7(findViewById(R.id.man_vs_man_place_7));
                        }
                    } else if (history[6] == 4) {
                        if (clock == 8 && (history[7] == 6 || history[7] == 9)) {
                            man_vs_ai_place_7(findViewById(R.id.man_vs_man_place_7));
                        } else if (clock == 8 && history[7] == 7 && history[5] == 9) {
                            man_vs_ai_place_6(findViewById(R.id.man_vs_man_place_6));
                        } else if (clock == 8 && history[7] == 7 && history[5] == 6) {
                            man_vs_ai_place_9(findViewById(R.id.man_vs_man_place_9));
                        }
                    }
                }
            } else if (history[2] == 7) {
                if (clock == 4 && history[3] != 4) {
                    man_vs_ai_place_4(findViewById(R.id.man_vs_man_place_4));
                } else if (clock == 4 && history[1] == 6) {
                    man_vs_ai_place_5(findViewById(R.id.man_vs_man_place_5));
                } else if (clock == 4 && history[1] == 5) {
                    man_vs_ai_place_6(findViewById(R.id.man_vs_man_place_6));
                } else if (clock == 4 && (history[1] == 8 || history[1] == 9)) {
                    man_vs_ai_place_3(findViewById(R.id.man_vs_man_place_3));
                } else if (clock == 4 && (history[1] == 2 || history[1] == 3)) {
                    man_vs_ai_place_9(findViewById(R.id.man_vs_man_place_9));
                }
                if (history[4] == 5) {
                    if (clock == 6 && history[5] != 3) {
                        man_vs_ai_place_3(findViewById(R.id.man_vs_man_place_3));
                    } else if (clock == 6 && history[5] != 9) {
                        man_vs_ai_place_9(findViewById(R.id.man_vs_man_place_9));
                    }
                } else if (history[4] == 3) {
                    if (clock == 6 && history[5] != 5) {
                        man_vs_ai_place_5(findViewById(R.id.man_vs_man_place_5));
                    } else if (clock == 6 && history[5] != 2) {
                        man_vs_ai_place_2(findViewById(R.id.man_vs_man_place_2));
                    }
                } else if (history[4] == 9) {
                    if (clock == 6 && history[5] != 5) {
                        man_vs_ai_place_5(findViewById(R.id.man_vs_man_place_5));
                    } else if (clock == 6 && history[5] != 8) {
                        man_vs_ai_place_8(findViewById(R.id.man_vs_man_place_8));
                    }
                } else if (history[4] == 6) {
                    if (clock == 6 && (history[5] == 8 || history[5] == 9)) {
                        man_vs_ai_place_2(findViewById(R.id.man_vs_man_place_2));
                    } else if (clock == 6 && (history[5] == 2 || history[5] == 3)) {
                        man_vs_ai_place_8(findViewById(R.id.man_vs_man_place_8));
                    }
                    if (history[6] == 8) {
                        if (clock == 8 && (history[7] == 2 || history[7] == 3)) {
                            man_vs_ai_place_9(findViewById(R.id.man_vs_man_place_9));
                        } else if (clock == 8 && history[7] == 9 && history[5] == 3) {
                            man_vs_ai_place_2(findViewById(R.id.man_vs_man_place_2));
                        } else if (clock == 8 && history[7] == 9 && history[5] == 2) {
                            man_vs_ai_place_3(findViewById(R.id.man_vs_man_place_3));
                        }
                    } else if (history[6] == 2) {
                        if (clock == 8 && (history[7] == 8 || history[7] == 9)) {
                            man_vs_ai_place_3(findViewById(R.id.man_vs_man_place_3));
                        } else if (clock == 8 && history[7] == 3 && history[5] == 9) {
                            man_vs_ai_place_8(findViewById(R.id.man_vs_man_place_8));
                        } else if (clock == 8 && history[7] == 3 && history[5] == 8) {
                            man_vs_ai_place_9(findViewById(R.id.man_vs_man_place_9));
                        }
                    }
                }
            }
        } else {

        }
    }

    public void wait_exchange() {
        TextView who1 = findViewById(R.id.man_vs_ai_who_1);
        TextView who2 = findViewById(R.id.man_vs_ai_who_2);
        if (isaifirst == 1) {
            if (set(clock).equals("O")) {
                who1.setVisibility(View.GONE);
                who2.setVisibility(View.VISIBLE);

            } else {
                who1.setVisibility(View.VISIBLE);
                who2.setVisibility(View.GONE);
            }
        } else {
            if (set(clock).equals("O")) {
                who1.setVisibility(View.VISIBLE);
                who2.setVisibility(View.GONE);
            } else {
                who1.setVisibility(View.GONE);
                who2.setVisibility(View.VISIBLE);
            }
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

    public void man_vs_ai_place_1(View v) {
        if (place[0][0] == 0) {
            TextView place1 = findViewById(R.id.man_vs_ai_place_1);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[0][0] = 1;
            } else {
                place[0][0] = -1;
            }
            history[clock] = 1;
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
            ai_turn();
        }
    }

    public void man_vs_ai_place_2(View v) {
        if (place[0][1] == 0) {
            TextView place1 = findViewById(R.id.man_vs_ai_place_2);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[0][1] = 1;
            } else {
                place[0][1] = -1;
            }
            history[clock] = 2;
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
            ai_turn();
        }
    }

    public void man_vs_ai_place_3(View v) {
        if (place[0][2] == 0) {
            TextView place1 = findViewById(R.id.man_vs_ai_place_3);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[0][2] = 1;
            } else {
                place[0][2] = -1;
            }
            history[clock] = 3;
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
            ai_turn();
        }
    }

    public void man_vs_ai_place_4(View v) {
        if (place[1][0] == 0) {
            TextView place1 = findViewById(R.id.man_vs_ai_place_4);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[1][0] = 1;
            } else {
                place[1][0] = -1;
            }
            history[clock] = 4;
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
            ai_turn();
        }
    }

    public void man_vs_ai_place_5(View v) {
        if (place[1][1] == 0) {
            TextView place1 = findViewById(R.id.man_vs_ai_place_5);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[1][1] = 1;
            } else {
                place[1][1] = -1;
            }
            history[clock] = 5;
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
            ai_turn();
        }
    }

    public void man_vs_ai_place_6(View v) {
        if (place[1][2] == 0) {
            TextView place1 = findViewById(R.id.man_vs_ai_place_6);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[1][2] = 1;
            } else {
                place[1][2] = -1;
            }
            history[clock] = 6;
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
            ai_turn();
        }
    }

    public void man_vs_ai_place_7(View v) {
        if (place[2][0] == 0) {
            TextView place1 = findViewById(R.id.man_vs_ai_place_7);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[2][0] = 1;
            } else {
                place[2][0] = -1;
            }
            history[clock] = 7;
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
            ai_turn();
        }
    }

    public void man_vs_ai_place_8(View v) {
        if (place[2][1] == 0) {
            TextView place1 = findViewById(R.id.man_vs_ai_place_8);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[2][1] = 1;
            } else {
                place[2][1] = -1;
            }
            history[clock] = 8;
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
            ai_turn();
        }
    }

    public void man_vs_ai_place_9(View v) {
        if (place[2][2] == 0) {
            TextView place1 = findViewById(R.id.man_vs_ai_place_9);
            place1.setText(set(clock));
            if (set(clock).equals("O")) {
                place[2][2] = 1;
            } else {
                place[2][2] = -1;
            }
            history[clock] = 9;
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            wait_exchange();
            show_even();
            ai_turn();
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