package com.example.mybighomework;

import android.app.AlertDialog;
import android.os.Bundle;
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
    int res = 0;
    int[] history = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_vsaiactivity);
        if (isaifirst == 1) {
            int i = 1; //randint() % 4;
            switch (i) {
                case 0:
                    play(1);
                    break;
                case 1:
                    play(3);
                    break;
                case 2:
                    play(7);
                    break;
                case 3:
                    play(9);
                    break;
            }
        }
    }

    public void ai_turn() {
        if (isaifirst == 1) {
            if (history[0] == 1) {
                if (history[1] == 5) {
                    if (clock == 2) {
                        int i = randint() % 3;
                        switch (i) {
                            case 0:
                                play(6);
                                break;
                            case 1:
                                play(8);
                                break;
                            case 2:
                                play(9);
                                break;
                        }
                    }
                    if (history[2]==9){
                        if (clock==4&&history[3]==3){
                            play(7);
                        } else if (clock==4&&history[3]==7) {
                            play(3);
                        } else if (clock==4&&history[3]==2) {
                            play(8);
                        } else if (clock==4&&history[3]==4) {
                            play(6);
                        } else if (clock==4&&history[3]==6) {
                            play(4);
                        } else if (clock==4&&history[3]==8) {
                            play(2);
                        }
                        if (history[4]==7){
                            if (clock==6&&history[5]!=4&&history[5]!=8){
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(4);
                                        break;
                                    case 1:
                                        play(8);
                                        break;
                                }
                            } else if (clock==6&&history[5]==4) {
                                play(8);
                            } else if (clock==6) {
                                play(4);
                            }
                        } else if (history[4]==3) {
                            if (clock==6&&history[5]!=2&&history[5]!=6){
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(2);
                                        break;
                                    case 1:
                                        play(6);
                                        break;
                                }
                            } else if (clock==6&&history[5]==2) {
                                play(6);
                            } else if (clock==6) {
                                play(2);
                            }
                        } else if (history[4]==2) {
                            if (clock==6&&history[5]!=3){
                                play(3);
                            } else if (clock==6){
                                play(7);
                            }
                            if (history[6]==7){
                                if (clock==8&&history[7]!=4){
                                    play(4);
                                } else if (clock==8) {
                                    play(6);
                                }
                            }
                        } else if (history[4]==4) {
                            if (clock==6&&history[5]!=7){
                                play(7);
                            } else if (clock==6){
                                play(3);
                            }
                            if (history[6]==3){
                                if (clock==8&&history[7]!=2){
                                    play(2);
                                } else if (clock==8) {
                                    play(8);
                                }
                            }
                        } else if (history[4]==6) {
                            if (clock==6&&history[5]!=3){
                                play(3);
                            } else if (clock==6){
                                play(7);
                            }
                            if (history[6]==7){
                                if (clock==8&&history[7]!=2){
                                    play(2);
                                } else if (clock==8) {
                                    play(8);
                                }
                            }
                        } else if (history[4]==8) {
                            if (clock==6&&history[5]!=7){
                                play(7);
                            } else if (clock==6){
                                play(3);
                            }
                            if (history[6]==7){
                                if (clock==8&&history[7]!=6){
                                    play(6);
                                } else if (clock==8) {
                                    play(4);
                                }
                            }
                        }
                    } else if (history[2] == 8) {
                        if (clock==4&&(history[3]==2||history[3]==3||history[3]==9)){
                            play(7);
                        } else if (clock == 4 && history[3] == 6) {
                            play(4);
                        } else if (clock == 4 && history[3] == 4) {
                            play(6);
                        } else if (clock == 4 && history[3] == 7) {
                            play(3);
                        }
                        if (history[4]==7){
                            if (history[3]==9){
                                if (clock==6&&history[5]!=4){
                                    play(4);
                                } else if (clock == 6) {
                                    play(6);
                                }
                                if (history[6]==6){
                                    if (clock==8&&history[7]!=3){
                                        play(3);
                                    } else if (clock==8) {
                                        play(2);
                                    }
                                }
                            }else {
                                if (clock==6&&history[5]!=4&&history[5]!=9){
                                    int i = randint() % 2;
                                    switch (i) {
                                        case 0:
                                            play(4);
                                            break;
                                        case 1:
                                            play(9);
                                            break;
                                    }
                                } else if (clock == 6 && history[5] == 4) {
                                    play(9);
                                } else if (clock == 6) {
                                    play(4);
                                }
                            }
                        } else if (history[4] == 4) {
                            if (clock==6&&history[5]!=7){
                                play(7);
                            } else if (clock == 6) {
                                play(3);
                            }
                            if (history[6]==3){
                                if (clock==8&&history[7]!=2){
                                    play(2);
                                } else if (clock==8) {
                                    play(9);
                                }
                            }
                        } else if (history[4] == 6) {
                            if (clock==6&&(history[5]==7||history[5] == 9)){
                                play(3);
                            } else if (clock == 6 && history[5] == 3) {
                                play(7);
                            } else if (clock == 6 && history[5] == 2) {
                                play(9);
                            }
                            if (history[6]==3){
                                if (clock==8&&history[7]!=2){
                                    play(2);
                                } else if (clock==8&&history[5]==7) {
                                    play(9);
                                } else if (clock==8&&history[5]==9) {
                                    play(7);
                                }
                            } else if (history[6] == 7) {
                                if (clock==8&&history[7]!=9){
                                    play(9);
                                } else if (clock==8) {
                                    play(2);
                                }
                            }
                        } else if (history[4] == 3) {
                            if (clock==6&&history[5]!=2){
                                play(2);
                            } else if (clock == 6) {
                                play(9);
                            }
                            if (history[6]==9){
                                if (clock==8&&history[7]!=6){
                                    play(6);
                                } else if (clock==8) {
                                    play(4);
                                }
                            }
                        }
                    } else if (history[2] == 6) {
                        if (clock==4&&(history[3]==4||history[3]==7||history[3]==9)){
                            play(3);
                        } else if (clock == 4 && history[3] == 8) {
                            play(2);
                        } else if (clock == 4 && history[3] == 2) {
                            play(8);
                        } else if (clock == 4 && history[3] == 3) {
                            play(7);
                        }
                        if (history[4]==3){
                            if (history[3]==9){
                                if (clock==6&&history[5]!=2){
                                    play(2);
                                } else if (clock == 6) {
                                    play(8);
                                }
                                if (history[6]==8){
                                    if (clock==8&&history[7]!=7){
                                        play(7);
                                    } else if (clock==8) {
                                        play(4);
                                    }
                                }
                            }else {
                                if (clock==6&&history[5]!=2&&history[5]!=9){
                                    int i = randint() % 2;
                                    switch (i) {
                                        case 0:
                                            play(2);
                                            break;
                                        case 1:
                                            play(9);
                                            break;
                                    }
                                } else if (clock == 6 && history[5] == 2) {
                                    play(9);
                                } else if (clock == 6) {
                                    play(2);
                                }
                            }
                        } else if (history[4] == 2) {
                            if (clock==6&&history[5]!=3){
                                play(3);
                            } else if (clock == 6) {
                                play(7);
                            }
                            if (history[6]==7){
                                if (clock==8&&history[7]!=4){
                                    play(4);
                                } else if (clock==8) {
                                    play(9);
                                }
                            }
                        } else if (history[4] == 8) {
                            if (clock==6&&(history[5]==3||history[5] == 9)){
                                play(7);
                            } else if (clock == 6 && history[5] == 7) {
                                play(3);
                            } else if (clock == 6 && history[5] == 4) {
                                play(9);
                            }
                            if (history[6]==7){
                                if (clock==8&&history[7]!=4){
                                    play(4);
                                } else if (clock==8&&history[5]==3) {
                                    play(9);
                                } else if (clock==8&&history[5]==9) {
                                    play(3);
                                }
                            } else if (history[6] == 3) {
                                if (clock==8&&history[7]!=9){
                                    play(9);
                                } else if (clock==8) {
                                    play(4);
                                }
                            }
                        } else if (history[4] == 7) {
                            if (clock==6&&history[5]!=4){
                                play(4);
                            } else if (clock == 6) {
                                play(9);
                            }
                            if (history[6]==9){
                                if (clock==8&&history[7]!=8){
                                    play(8);
                                } else if (clock==8) {
                                    play(2);
                                }
                            }
                        }
                    }
                } else {
                    if (clock == 2 && (history[1] == 6 || history[1] == 8 || history[1] == 9)) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play(3);
                                break;
                            case 1:
                                play(7);
                                break;
                        }
                    } else if (clock == 2 && (history[1] == 2 || history[1] == 3)) {
                        play(7);
                    } else if (clock == 2 && (history[1] == 4 || history[1] == 7)) {
                        play(3);
                    }
                    if (history[2] == 3) {
                        if (clock == 4 && history[3] != 2) {
                            play(2);
                        } else {
                            if (clock == 4 && history[1] == 8) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(7);
                                        break;
                                    case 1:
                                        play(9);
                                        break;
                                }
                            } else {
                                if (clock == 4 && (history[1] == 9 || history[1] == 6)) {
                                    play(7);
                                } else if (clock == 4 && (history[1] == 7 || history[1] == 4)) {
                                    play(9);
                                }
                            }
                        }
                        if (history[4] == 7) {
                            if (clock == 6 && history[5] != 4 && history[5] != 5) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(4);
                                        break;
                                    case 1:
                                        play(5);
                                        break;
                                }
                            } else {
                                if (clock == 6 && history[5] == 4) {
                                    play(5);
                                } else if (clock == 6) {
                                    play(4);
                                }
                            }
                        } else if (history[4] == 9) {
                            if (clock == 6 && history[5] != 6 && history[5] != 5) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(6);
                                        break;
                                    case 1:
                                        play(5);
                                        break;
                                }
                            } else {
                                if (clock == 6 && history[5] == 6) {
                                    play(5);
                                } else if (clock == 6) {
                                    play(6);
                                }
                            }
                        }
                    } else if (history[2] == 7) {
                        if (clock == 4 && history[3] != 4) {
                            play(4);
                        } else {
                            if (clock == 4 && history[1] == 6) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(3);
                                        break;
                                    case 1:
                                        play(9);
                                        break;
                                }
                            } else {
                                if (clock == 4 && (history[1] == 9 || history[1] == 8)) {
                                    play(3);
                                } else if (clock == 4 && (history[1] == 2 || history[1] == 3)) {
                                    play(9);
                                }
                            }
                        }
                        if (history[4] == 3) {
                            if (clock == 6 && history[5] != 2 && history[5] != 5) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(2);
                                        break;
                                    case 1:
                                        play(5);
                                        break;
                                }
                            } else {
                                if (clock == 6 && history[5] == 2) {
                                    play(5);
                                } else if (clock == 6) {
                                    play(2);
                                }
                            }
                        } else if (history[4] == 9) {
                            if (clock == 6 && history[5] != 8 && history[5] != 5) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(8);
                                        break;
                                    case 1:
                                        play(5);
                                        break;
                                }
                            } else {
                                if (clock == 6 && history[5] == 8) {
                                    play(5);
                                } else if (clock == 6) {
                                    play(8);
                                }
                            }
                        }
                    }
                }
            } else if (history[0] == 3) {
                if (history[1] == 5) {
                    if (clock == 2) {
                        int i = randint() % 3;
                        switch (i) {
                            case 0:
                                play(8);
                                break;
                            case 1:
                                play(4);
                                break;
                            case 2:
                                play(7);
                                break;
                        }
                    }
                    if (history[2]==7){
                        if (clock==4&&history[3]==9){
                            play(1);
                        } else if (clock==4&&history[3]==1) {
                            play(9);
                        } else if (clock==4&&history[3]==6) {
                            play(4);
                        } else if (clock==4&&history[3]==2) {
                            play(8);
                        } else if (clock==4&&history[3]==8) {
                            play(2);
                        } else if (clock==4&&history[3]==4) {
                            play(6);
                        }
                        if (history[4]==1){
                            if (clock==6&&history[5]!=2&&history[5]!=4){
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(2);
                                        break;
                                    case 1:
                                        play(4);
                                        break;
                                }
                            } else if (clock==6&&history[5]==2) {
                                play(4);
                            } else if (clock==6) {
                                play(2);
                            }
                        } else if (history[4]==9) {
                            if (clock==6&&history[5]!=6&&history[5]!=8){
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(6);
                                        break;
                                    case 1:
                                        play(8);
                                        break;
                                }
                            } else if (clock==6&&history[5]==6) {
                                play(8);
                            } else if (clock==6) {
                                play(6);
                            }
                        } else if (history[4]==6) {
                            if (clock==6&&history[5]!=9){
                                play(9);
                            } else if (clock==6){
                                play(1);
                            }
                            if (history[6]==1){
                                if (clock==8&&history[7]!=2){
                                    play(2);
                                } else if (clock==8) {
                                    play(8);
                                }
                            }
                        } else if (history[4]==2) {
                            if (clock==6&&history[5]!=1){
                                play(1);
                            } else if (clock==6){
                                play(9);
                            }
                            if (history[6]==9){
                                if (clock==8&&history[7]!=6){
                                    play(6);
                                } else if (clock==8) {
                                    play(4);
                                }
                            }
                        } else if (history[4]==8) {
                            if (clock==6&&history[5]!=9){
                                play(9);
                            } else if (clock==6){
                                play(1);
                            }
                            if (history[6]==1){
                                if (clock==8&&history[7]!=6){
                                    play(6);
                                } else if (clock==8) {
                                    play(4);
                                }
                            }
                        } else if (history[4]==4) {
                            if (clock==6&&history[5]!=1){
                                play(1);
                            } else if (clock==6){
                                play(9);
                            }
                            if (history[6]==1){
                                if (clock==8&&history[7]!=8){
                                    play(8);
                                } else if (clock==8) {
                                    play(2);
                                }
                            }
                        }
                    } else if (history[2] == 4) {
                        if (clock==4&&(history[3]==6||history[3]==9||history[3]==7)){
                            play(1);
                        } else if (clock == 4 && history[3] == 8) {
                            play(2);
                        } else if (clock == 4 && history[3] == 2) {
                            play(8);
                        } else if (clock == 4 && history[3] == 1) {
                            play(9);
                        }
                        if (history[4]==1){
                            if (history[3]==7){
                                if (clock==6&&history[5]!=2){
                                    play(2);
                                } else if (clock == 6) {
                                    play(8);
                                }
                                if (history[6]==8){
                                    if (clock==8&&history[7]!=9){
                                        play(9);
                                    } else if (clock==8) {
                                        play(6);
                                    }
                                }
                            }else {
                                if (clock==6&&history[5]!=2&&history[5]!=7){
                                    int i = randint() % 2;
                                    switch (i) {
                                        case 0:
                                            play(2);
                                            break;
                                        case 1:
                                            play(7);
                                            break;
                                    }
                                } else if (clock == 6 && history[5] == 2) {
                                    play(7);
                                } else if (clock == 6) {
                                    play(2);
                                }
                            }
                        } else if (history[4] == 2) {
                            if (clock==6&&history[5]!=1){
                                play(1);
                            } else if (clock == 6) {
                                play(9);
                            }
                            if (history[6]==9){
                                if (clock==8&&history[7]!=6){
                                    play(6);
                                } else if (clock==8) {
                                    play(7);
                                }
                            }
                        } else if (history[4] == 8) {
                            if (clock==6&&(history[5]==1||history[5] == 7)){
                                play(9);
                            } else if (clock == 6 && history[5] == 9) {
                                play(1);
                            } else if (clock == 6 && history[5] == 6) {
                                play(7);
                            }
                            if (history[6]==9){
                                if (clock==8&&history[7]!=6){
                                    play(6);
                                } else if (clock==8&&history[5]==1) {
                                    play(7);
                                } else if (clock==8&&history[5]==7) {
                                    play(1);
                                }
                            } else if (history[6] == 1) {
                                if (clock==8&&history[7]!=7){
                                    play(7);
                                } else if (clock==8) {
                                    play(6);
                                }
                            }
                        } else if (history[4] == 9) {
                            if (clock==6&&history[5]!=6){
                                play(6);
                            } else if (clock == 6) {
                                play(7);
                            }
                            if (history[6]==7){
                                if (clock==8&&history[7]!=8){
                                    play(8);
                                } else if (clock==8) {
                                    play(2);
                                }
                            }
                        }
                    } else if (history[2] == 8) {
                        if (clock==4&&(history[3]==2||history[3]==1||history[3]==7)){
                            play(9);
                        } else if (clock == 4 && history[3] == 4) {
                            play(6);
                        } else if (clock == 4 && history[3] == 6) {
                            play(2);
                        } else if (clock == 4 && history[3] == 9) {
                            play(1);
                        }
                        if (history[4]==9){
                            if (history[3]==7){
                                if (clock==6&&history[5]!=6){
                                    play(6);
                                } else if (clock == 6) {
                                    play(4);
                                }
                                if (history[6]==4){
                                    if (clock==8&&history[7]!=1){
                                        play(1);
                                    } else if (clock==8) {
                                        play(2);
                                    }
                                }
                            }else {
                                if (clock==6&&history[5]!=6&&history[5]!=7){
                                    int i = randint() % 2;
                                    switch (i) {
                                        case 0:
                                            play(6);
                                            break;
                                        case 1:
                                            play(7);
                                            break;
                                    }
                                } else if (clock == 6 && history[5] == 6) {
                                    play(7);
                                } else if (clock == 6) {
                                    play(6);
                                }
                            }
                        } else if (history[4] == 6) {
                            if (clock==6&&history[5]!=9){
                                play(9);
                            } else if (clock == 6) {
                                play(1);
                            }
                            if (history[6]==1){
                                if (clock==8&&history[7]!=2){
                                    play(2);
                                } else if (clock==8) {
                                    play(7);
                                }
                            }
                        } else if (history[4] == 4) {
                            if (clock==6&&(history[5]==9||history[5] == 7)){
                                play(1);
                            } else if (clock == 6 && history[5] == 1) {
                                play(9);
                            } else if (clock == 6 && history[5] == 2) {
                                play(7);
                            }
                            if (history[6]==1){
                                if (clock==8&&history[7]!=2){
                                    play(2);
                                } else if (clock==8&&history[5]==9) {
                                    play(7);
                                } else if (clock==8&&history[5]==7) {
                                    play(9);
                                }
                            } else if (history[6] == 9) {
                                if (clock==8&&history[7]!=7){
                                    play(7);
                                } else if (clock==8) {
                                    play(2);
                                }
                            }
                        } else if (history[4] == 1) {
                            if (clock==6&&history[5]!=2){
                                play(2);
                            } else if (clock == 6) {
                                play(7);
                            }
                            if (history[6]==7){
                                if (clock==8&&history[7]!=4){
                                    play(4);
                                } else if (clock==8) {
                                    play(6);
                                }
                            }
                        }
                    }//////////////////////////////////////////////
                } else {
                    if (clock == 2 && (history[1] == 6 || history[1] == 8 || history[1] == 9)) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play(3);
                                break;
                            case 1:
                                play(7);
                                break;
                        }
                    } else if (clock == 2 && (history[1] == 2 || history[1] == 3)) {
                        play(7);
                    } else if (clock == 2 && (history[1] == 4 || history[1] == 7)) {
                        play(3);
                    }
                    if (history[2] == 3) {
                        if (clock == 4 && history[3] != 2) {
                            play(2);
                        } else {
                            if (clock == 4 && history[1] == 8) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(7);
                                        break;
                                    case 1:
                                        play(9);
                                        break;
                                }
                            } else {
                                if (clock == 4 && (history[1] == 9 || history[1] == 6)) {
                                    play(7);
                                } else if (clock == 4 && (history[1] == 7 || history[1] == 4)) {
                                    play(9);
                                }
                            }
                        }
                        if (history[4] == 7) {
                            if (clock == 6 && history[5] != 4 && history[5] != 5) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(4);
                                        break;
                                    case 1:
                                        play(5);
                                        break;
                                }
                            } else {
                                if (clock == 6 && history[5] == 4) {
                                    play(5);
                                } else if (clock == 6 && history[5] == 5) {
                                    play(4);
                                }
                            }
                        } else if (history[4] == 9) {
                            if (clock == 6 && history[5] != 6 && history[5] != 5) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(6);
                                        break;
                                    case 1:
                                        play(5);
                                        break;
                                }
                            } else {
                                if (clock == 6 && history[5] == 6) {
                                    play(5);
                                } else if (clock == 6 && history[5] == 5) {
                                    play(6);
                                }
                            }
                        }
                    } else if (history[2] == 7) {
                        if (clock == 4 && history[3] != 4) {
                            play(4);
                        } else {
                            if (clock == 4 && history[1] == 6) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(3);
                                        break;
                                    case 1:
                                        play(9);
                                        break;
                                }
                            } else {
                                if (clock == 4 && (history[1] == 9 || history[1] == 8)) {
                                    play(3);
                                } else if (clock == 4 && (history[1] == 2 || history[1] == 3)) {
                                    play(9);
                                }
                            }
                        }
                        if (history[4] == 3) {
                            if (clock == 6 && history[5] != 2 && history[5] != 5) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(2);
                                        break;
                                    case 1:
                                        play(5);
                                        break;
                                }
                            } else {
                                if (clock == 6 && history[5] == 2) {
                                    play(5);
                                } else if (clock == 6 && history[5] == 5) {
                                    play(2);
                                }
                            }
                        } else if (history[4] == 9) {
                            if (clock == 6 && history[5] != 8 && history[5] != 5) {
                                int i = randint() % 2;
                                switch (i) {
                                    case 0:
                                        play(8);
                                        break;
                                    case 1:
                                        play(5);
                                        break;
                                }
                            } else {
                                if (clock == 6 && history[5] == 8) {
                                    play(5);
                                } else if (clock == 6 && history[5] == 5) {
                                    play(8);
                                }
                            }
                        }
                    }
                }
            } else if (history[0] == 7) {

            } else if (history[0] == 9) {

            }
        } else {

        }
    }

    public void man_vs_ai_place(View v) {
        String s = set(clock);
        boolean isable = false;
        if (v.getId() == R.id.man_vs_ai_place_1) {
            if (place[0][0] == 0) {
                if (s.equals("O")) {
                    place[0][0] = 1;
                } else {
                    place[0][0] = -1;
                }
                history[clock] = 1;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_2) {
            if (place[0][1] == 0) {
                if (s.equals("O")) {
                    place[0][1] = 1;
                } else {
                    place[0][1] = -1;
                }
                history[clock] = 2;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_3) {
            if (place[0][2] == 0) {
                if (s.equals("O")) {
                    place[0][2] = 1;
                } else {
                    place[0][2] = -1;
                }
                history[clock] = 3;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_4) {
            if (place[1][0] == 0) {
                if (s.equals("O")) {
                    place[1][0] = 1;
                } else {
                    place[1][0] = -1;
                }
                history[clock] = 4;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_5) {
            if (place[1][1] == 0) {
                if (s.equals("O")) {
                    place[1][1] = 1;
                } else {
                    place[1][1] = -1;
                }
                history[clock] = 5;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_6) {
            if (place[1][2] == 0) {
                if (s.equals("O")) {
                    place[1][2] = 1;
                } else {
                    place[1][2] = -1;
                }
                history[clock] = 6;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_7) {
            if (place[2][0] == 0) {
                if (s.equals("O")) {
                    place[2][0] = 1;
                } else {
                    place[2][0] = -1;
                }
                history[clock] = 7;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_8) {
            if (place[2][1] == 0) {
                if (s.equals("O")) {
                    place[2][1] = 1;
                } else {
                    place[2][1] = -1;
                }
                history[clock] = 8;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_9) {
            if (place[2][2] == 0) {
                if (s.equals("O")) {
                    place[2][2] = 1;
                } else {
                    place[2][2] = -1;
                }
                history[clock] = 9;
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
            ai_turn();
        }
    }

    public int randint() {
        return Math.abs((new Random(System.currentTimeMillis())).nextInt());
    }

    public void play(int i) {
        switch (i) {
            case 1:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_1));
                break;
            case 2:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_2));
                break;
            case 3:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_3));
                break;
            case 4:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_4));
                break;
            case 5:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_5));
                break;
            case 6:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_6));
                break;
            case 7:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_7));
                break;
            case 8:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_8));
                break;
            case 9:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_9));
                break;
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
        TextView who1 = findViewById(R.id.man_vs_ai_who_1);
        TextView who2 = findViewById(R.id.man_vs_ai_who_2);
        ProgressBar wait = findViewById(R.id.man_vs_ai_wait);
        if (isaifirst == 1) {
            if (s.equals("X")) {
                who1.setVisibility(View.GONE);
                who2.setVisibility(View.VISIBLE);
                wait.setVisibility(View.VISIBLE);
            } else {
                who1.setVisibility(View.VISIBLE);
                who2.setVisibility(View.GONE);
                wait.setVisibility(View.GONE);
            }
        } else {
            if (s.equals("X")) {
                who1.setVisibility(View.VISIBLE);
                who2.setVisibility(View.GONE);
                wait.setVisibility(View.GONE);
            } else {
                who1.setVisibility(View.GONE);
                who2.setVisibility(View.VISIBLE);
                wait.setVisibility(View.VISIBLE);
            }
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
        builder.setTitle(R.string.gend).setMessage(s).setPositiveButton(R.string.newgame, (dialog, which) -> recreate()).setNegativeButton(R.string.endgame, (dialog, which) -> finish());
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