package com.example.mybighomework;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ManVSManActivity extends AppCompatActivity {
    int[][] place = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };
    int clock = 0;
    int res = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_vsman);
    }

    public void man_vs_man_place(View v) {
        String s = set(clock);
        Boolean isable = false;
        if (v.getId() == R.id.man_vs_man_place_1) {
            if (place[0][0] == 0) {
                if (s.equals("O")) {
                    place[0][0] = 1;
                } else {
                    place[0][0] = -1;
                }
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_man_place_2) {
            if (place[0][1] == 0) {
                if (s.equals("O")) {
                    place[0][1] = 1;
                } else {
                    place[0][1] = -1;
                }
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_man_place_3) {
            if (place[0][2] == 0) {
                if (s.equals("O")) {
                    place[0][2] = 1;
                } else {
                    place[0][2] = -1;
                }
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_man_place_4) {
            if (place[1][0] == 0) {
                if (s.equals("O")) {
                    place[1][0] = 1;
                } else {
                    place[1][0] = -1;
                }
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_man_place_5) {
            if (place[1][1] == 0) {
                if (s.equals("O")) {
                    place[1][1] = 1;
                } else {
                    place[1][1] = -1;
                }
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_man_place_6) {
            if (place[1][2] == 0) {
                if (s.equals("O")) {
                    place[1][2] = 1;
                } else {
                    place[1][2] = -1;
                }
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_man_place_7) {
            if (place[2][0] == 0) {
                if (s.equals("O")) {
                    place[2][0] = 1;
                } else {
                    place[2][0] = -1;
                }
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_man_place_8) {
            if (place[2][1] == 0) {
                if (s.equals("O")) {
                    place[2][1] = 1;
                } else {
                    place[2][1] = -1;
                }
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_man_place_9) {
            if (place[2][2] == 0) {
                if (s.equals("O")) {
                    place[2][2] = 1;
                } else {
                    place[2][2] = -1;
                }
                isable = true;
            }
        }
        if (isable) {
            TextView tv = findViewById(v.getId());
            tv.setText(s);
            wait_exchange(s);
            clock++;
            judge();
            if (clock == 9 && res == 0) {
                show(res);
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

    public void wait_exchange(String s) {
        TextView who1 = findViewById(R.id.man_vs_man_who_1);
        TextView who2 = findViewById(R.id.man_vs_man_who_2);
        if (s.equals("X")) {
            who1.setVisibility(View.INVISIBLE);
            who2.setVisibility(View.VISIBLE);
        } else {
            who1.setVisibility(View.VISIBLE);
            who2.setVisibility(View.INVISIBLE);
        }
    }

    public void show(int r) {
        int s = 0;
        if (r == 0) {
            s = R.string.even;
        } else if (r == 1) {
            s = R.string.owin;
        } else if (r == -1) {
            s = R.string.xwin;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.gend).setMessage(s).setPositiveButton(R.string.newgame, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        }).setNegativeButton(R.string.endgame, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.create().show();
    }

    public void judge() {
        for (int i = 0; i < 3; i++) {
            int k = 0;
            for (int j = 0; j < 3; j++) {
                k += place[i][j];
            }
            if (k == 3) {
                res = 1;
                show(res);
                break;
            } else if (k == -3) {
                res = -1;
                show(res);
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            int k = 0;
            for (int j = 0; j < 3; j++) {
                k += place[j][i];
            }
            if (k == 3) {
                res = 1;
                show(res);
                break;
            } else if (k == -3) {
                res = -1;
                show(res);
                break;
            }
        }
        int x = place[0][0] + place[1][1] + place[2][2];
        int y = place[0][2] + place[1][1] + place[2][0];
        if (x == 3 || y == 3) {
            res = 1;
            show(res);
        } else if (x == -3 || y == -3) {
            res = -1;
            show(res);
        }
    }
}