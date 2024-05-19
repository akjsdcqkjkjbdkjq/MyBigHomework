package com.example.mybighomework;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ManVSAIActivity extends AppCompatActivity {
    int[][] place = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };
    int clock = Math.abs((new Random(System.currentTimeMillis())).nextInt()) % 2;
    Boolean res = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_vsaiactivity);
        if (clock == 1) {
            TextView place5 = findViewById(R.id.man_vs_ai_place_5);
            place5.setText("O");
            place[1][1] = 1;
            TextView who1 = findViewById(R.id.man_vs_ai_who_1);
            who1.setText("");
            TextView who2 = findViewById(R.id.man_vs_ai_who_2);
            who2.setText(set(clock));
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
            clock++;
            judge_vertical();
            judge_horizontal();
            judge_cross();
            if (set(clock).equals("O")) {
                TextView who1 = findViewById(R.id.man_vs_ai_who_1);
                who1.setText(set(clock));
                TextView who2 = findViewById(R.id.man_vs_ai_who_2);
                who2.setText("");
            } else {
                TextView who1 = findViewById(R.id.man_vs_ai_who_1);
                who1.setText("");
                TextView who2 = findViewById(R.id.man_vs_ai_who_2);
                who2.setText(set(clock));
            }
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
    }

    public String set(int c) {
        if (c % 2 == 0) {
            return "O";
        } else {
            return "X";
        }
    }

    public void judge_horizontal() {
        for (int i = 0; i < 3; i++) {
            int k = 0;
            for (int j = 0; j < 3; j++) {
                k += place[i][j];
            }
            if (k == 3) {
                res = true;
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
                break;
            } else if (k == -3) {
                res = true;
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
                break;
            } else if (k == -3) {
                res = true;
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
                break;
            }
        }
    }

    public void judge_cross() {
        int x = place[0][0] + place[1][1] + place[2][2];
        int y = place[0][2] + place[1][1] + place[2][0];
        if (x == 3 || y == 3) {
            res = true;
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
        } else if (x == -3 || y == -3) {
            res = true;
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
    }
}