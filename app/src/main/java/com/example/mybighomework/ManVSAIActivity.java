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
    int isaifirst = 0; //randint()%2;
    int clock = 0;
    int res = 0;
    int[] history = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
    int g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_vsaiactivity);
        wait_exchange(set(clock + 1));
        if (isaifirst == 1) {
            int i = randint() % 4;
            play(i);
        }
    }

    public void ai_turn() {
        if (isaifirst == 1) {
            hardmodefirst(history[0]);
        } else {
            hardmodesecond(history[0]);
        }
    }

    public void hardmodefirst(int k) {
        if (history[1] == 8) {
            if (clock == 2) {
                int i = randint() % 3;
                switch (i) {
                    case 0:
                        play((k + 2) % 4 + 4);
                        break;
                    case 1:
                        play((k + 3) % 4 + 4);
                        break;
                    case 2:
                        play((k + 2) % 4);
                        break;
                }
            }
            if (history[2] == (k + 2) % 4) {
                if (clock == 4 && history[3] == (k + 1) % 4) {
                    play((k + 3) % 4);
                } else if (clock == 4 && history[3] == (k + 3) % 4) {
                    play((k + 1) % 4);
                } else if (clock == 4 && history[3] == (k + 1) % 4 + 4) {
                    play((k + 3) % 4 + 4);
                } else if (clock == 4 && history[3] == (k) % 4 + 4) {
                    play((k + 2) % 4 + 4);
                } else if (clock == 4 && history[3] == (k + 2) % 4 + 4) {
                    play((k) % 4 + 4);
                } else if (clock == 4 && history[3] == (k + 3) % 4 + 4) {
                    play((k + 1) % 4 + 4);
                }
                if (history[4] == (k + 3) % 4) {
                    if (clock == 6 && history[5] != (k) % 4 + 4 && history[5] != (k + 3) % 4 + 4) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((k) % 4 + 4);
                                break;
                            case 1:
                                play((k + 3) % 4 + 4);
                                break;
                        }
                    } else if (clock == 6 && history[5] == (k) % 4 + 4) {
                        play((k + 3) % 4 + 4);
                    } else if (clock == 6) {
                        play((k) % 4 + 4);
                    }
                } else if (history[4] == (k + 1) % 4) {
                    if (clock == 6 && history[5] != (k + 1) % 4 + 4 && history[5] != (k + 2) % 4 + 4) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((k + 1) % 4 + 4);
                                break;
                            case 1:
                                play((k + 2) % 4 + 4);
                                break;
                        }
                    } else if (clock == 6 && history[5] == (k + 1) % 4 + 4) {
                        play((k + 2) % 4 + 4);
                    } else if (clock == 6) {
                        play((k + 1) % 4 + 4);
                    }
                } else if (history[4] == (k + 1) % 4 + 4) {
                    if (clock == 6 && history[5] != (k + 1) % 4) {
                        play((k + 1) % 4);
                    } else if (clock == 6) {
                        play((k + 3) % 4);
                    }
                    if (history[6] == (k + 3) % 4) {
                        if (clock == 8 && history[7] != (k) % 4 + 4) {
                            play((k) % 4 + 4);
                        } else if (clock == 8) {
                            play((k + 2) % 4 + 4);
                        }
                    }
                } else if (history[4] == (k) % 4 + 4) {
                    if (clock == 6 && history[5] != (k + 3) % 4) {
                        play((k + 3) % 4);
                    } else if (clock == 6) {
                        play((k + 1) % 4);
                    }
                    if (history[6] == (k + 1) % 4) {
                        if (clock == 8 && history[7] != (k + 1) % 4 + 4) {
                            play((k + 1) % 4 + 4);
                        } else if (clock == 8) {
                            play((k + 3) % 4 + 4);
                        }
                    }
                } else if (history[4] == (k + 2) % 4 + 4) {
                    if (clock == 6 && history[5] != (k + 1) % 4) {
                        play((k + 1) % 4);
                    } else if (clock == 6) {
                        play((k + 3) % 4);
                    }
                    if (history[6] == (k + 3) % 4) {
                        if (clock == 8 && history[7] != (k + 1) % 4 + 4) {
                            play((k + 1) % 4 + 4);
                        } else if (clock == 8) {
                            play((k + 3) % 4 + 4);
                        }
                    }
                } else if (history[4] == (k + 3) % 4 + 4) {
                    if (clock == 6 && history[5] != (k + 3) % 4) {
                        play((k + 3) % 4);
                    } else if (clock == 6) {
                        play((k + 1) % 4);
                    }
                    if (history[6] == (k + 3) % 4) {
                        if (clock == 8 && history[7] != (k + 2) % 4 + 4) {
                            play((k + 2) % 4 + 4);
                        } else if (clock == 8) {
                            play((k) % 4 + 4);
                        }
                    }
                }
            } else if (history[2] == (k + 3) % 4 + 4) {
                if (clock == 4 && (history[3] == (k + 1) % 4 + 4 || history[3] == (k + 1) % 4 || history[3] == (k + 2) % 4)) {
                    play((k + 3) % 4);
                } else if (clock == 4 && history[3] == (k + 2) % 4 + 4) {
                    play((k) % 4 + 4);
                } else if (clock == 4 && history[3] == (k) % 4 + 4) {
                    play((k + 2) % 4 + 4);
                } else if (clock == 4 && history[3] == (k + 3) % 4) {
                    play((k + 1) % 4);
                }
                if (history[4] == (k + 3) % 4) {
                    if (history[3] == (k + 2) % 4) {
                        if (clock == 6 && history[5] != (k) % 4 + 4) {
                            play((k) % 4 + 4);
                        } else if (clock == 6) {
                            play((k + 2) % 4 + 4);
                        }
                        if (history[6] == (k + 2) % 4 + 4) {
                            if (clock == 8 && history[7] != (k + 1) % 4) {
                                play((k + 1) % 4);
                            } else if (clock == 8) {
                                play((k + 1) % 4 + 4);
                            }
                        }
                    } else {
                        if (clock == 6 && history[5] != (k) % 4 + 4 && history[5] != (k + 2) % 4) {
                            int i = randint() % 2;
                            switch (i) {
                                case 0:
                                    play((k) % 4 + 4);
                                    break;
                                case 1:
                                    play((k + 2) % 4);
                                    break;
                            }
                        } else if (clock == 6 && history[5] == (k) % 4 + 4) {
                            play((k + 2) % 4);
                        } else if (clock == 6) {
                            play((k) % 4 + 4);
                        }
                    }
                } else if (history[4] == (k) % 4 + 4) {
                    if (clock == 6 && history[5] != (k + 3) % 4) {
                        play((k + 3) % 4);
                    } else if (clock == 6) {
                        play((k + 1) % 4);
                    }
                    if (history[6] == (k + 1) % 4) {
                        if (clock == 8 && history[7] != (k + 1) % 4 + 4) {
                            play((k + 1) % 4 + 4);
                        } else if (clock == 8) {
                            play((k + 2) % 4);
                        }
                    }
                } else if (history[4] == (k + 2) % 4 + 4) {
                    if (clock == 6 && (history[5] == (k + 3) % 4 || history[5] == (k + 2) % 4)) {
                        play((k + 1) % 4);
                    } else if (clock == 6 && history[5] == (k + 1) % 4) {
                        play((k + 3) % 4);
                    } else if (clock == 6 && history[5] == (k + 1) % 4 + 4) {
                        play((k + 2) % 4);
                    }
                    if (history[6] == (k + 1) % 4) {
                        if (clock == 8 && history[7] != (k + 1) % 4 + 4) {
                            play((k + 1) % 4 + 4);
                        } else if (clock == 8 && history[5] == (k + 3) % 4) {
                            play((k + 2) % 4);
                        } else if (clock == 8 && history[5] == (k + 2) % 4) {
                            play((k + 3) % 4);
                        }
                    } else if (history[6] == (k + 3) % 4) {
                        if (clock == 8 && history[7] != (k + 2) % 4) {
                            play((k + 2) % 4);
                        } else if (clock == 8) {
                            play((k + 1) % 4 + 4);
                        }
                    }
                } else if (history[4] == (k + 1) % 4) {
                    if (clock == 6 && history[5] != (k + 1) % 4 + 4) {
                        play((k + 1) % 4 + 4);
                    } else if (clock == 6) {
                        play((k + 2) % 4);
                    }
                    if (history[6] == (k + 2) % 4) {
                        if (clock == 8 && history[7] != (k + 2) % 4 + 4) {
                            play((k + 2) % 4 + 4);
                        } else if (clock == 8) {
                            play((k) % 4 + 4);
                        }
                    }
                }
            } else if (history[2] == (k + 2) % 4 + 4) {
                if (clock == 4 && (history[3] == (k) % 4 + 4 || history[3] == (k + 3) % 4 || history[3] == (k + 2) % 4)) {
                    play((k + 1) % 4);
                } else if (clock == 4 && history[3] == (k + 3) % 4 + 4) {
                    play((k + 1) % 4 + 4);
                } else if (clock == 4 && history[3] == (k + 1) % 4 + 4) {
                    play((k + 3) % 4 + 4);
                } else if (clock == 4 && history[3] == (k + 1) % 4) {
                    play((k + 3) % 4);
                }
                if (history[4] == (k + 1) % 4) {
                    if (history[3] == (k + 2) % 4) {
                        if (clock == 6 && history[5] != (k + 1) % 4 + 4) {
                            play((k + 1) % 4 + 4);
                        } else if (clock == 6) {
                            play((k + 3) % 4 + 4);
                        }
                        if (history[6] == (k + 3) % 4 + 4) {
                            if (clock == 8 && history[7] != (k + 3) % 4) {
                                play((k + 3) % 4);
                            } else if (clock == 8) {
                                play((k) % 4 + 4);
                            }
                        }
                    } else {
                        if (clock == 6 && history[5] != (k + 1) % 4 + 4 && history[5] != (k + 2) % 4) {
                            int i = randint() % 2;
                            switch (i) {
                                case 0:
                                    play((k + 1) % 4 + 4);
                                    break;
                                case 1:
                                    play((k + 2) % 4);
                                    break;
                            }
                        } else if (clock == 6 && history[5] == (k + 1) % 4 + 4) {
                            play((k + 2) % 4);
                        } else if (clock == 6) {
                            play((k + 1) % 4 + 4);
                        }
                    }
                } else if (history[4] == (k + 1) % 4 + 4) {
                    if (clock == 6 && history[5] != (k + 1) % 4) {
                        play((k + 1) % 4);
                    } else if (clock == 6) {
                        play((k + 3) % 4);
                    }
                    if (history[6] == (k + 3) % 4) {
                        if (clock == 8 && history[7] != (k) % 4 + 4) {
                            play((k) % 4 + 4);
                        } else if (clock == 8) {
                            play((k + 2) % 4);
                        }
                    }
                } else if (history[4] == (k + 3) % 4 + 4) {
                    if (clock == 6 && (history[5] == (k + 1) % 4 || history[5] == (k + 2) % 4)) {
                        play((k + 3) % 4);
                    } else if (clock == 6 && history[5] == (k + 3) % 4) {
                        play((k + 1) % 4);
                    } else if (clock == 6 && history[5] == (k) % 4 + 4) {
                        play((k + 2) % 4);
                    }
                    if (history[6] == (k + 3) % 4) {
                        if (clock == 8 && history[7] != (k) % 4 + 4) {
                            play((k) % 4 + 4);
                        } else if (clock == 8 && history[5] == (k + 1) % 4) {
                            play((k + 2) % 4);
                        } else if (clock == 8 && history[5] == (k + 2) % 4) {
                            play((k + 1) % 4);
                        }
                    } else if (history[6] == (k + 1) % 4) {
                        if (clock == 8 && history[7] != (k + 2) % 4) {
                            play((k + 2) % 4);
                        } else if (clock == 8) {
                            play((k) % 4 + 4);
                        }
                    }
                } else if (history[4] == (k + 3) % 4) {
                    if (clock == 6 && history[5] != (k) % 4 + 4) {
                        play((k) % 4 + 4);
                    } else if (clock == 6) {
                        play((k + 2) % 4);
                    }
                    if (history[6] == (k + 2) % 4) {
                        if (clock == 8 && history[7] != (k + 3) % 4 + 4) {
                            play((k + 3) % 4 + 4);
                        } else if (clock == 8) {
                            play((k + 1) % 4 + 4);
                        }
                    }
                }
            }
        } else {
            if (clock == 2 && (history[1] == (k + 2) % 4 + 4 || history[1] == (k + 3) % 4 + 4 || history[1] == (k + 2) % 4)) {
                int i = randint() % 2;
                switch (i) {
                    case 0:
                        play((k + 1) % 4);
                        break;
                    case 1:
                        play((k + 3) % 4);
                        break;
                }
            } else if (clock == 2 && (history[1] == (k + 1) % 4 + 4 || history[1] == (k + 1) % 4)) {
                play((k + 3) % 4);
            } else if (clock == 2 && (history[1] == (k) % 4 + 4 || history[1] == (k + 3) % 4)) {
                play((k + 1) % 4);
            }
            if (history[2] == (k + 1) % 4) {
                if (clock == 4 && history[3] != (k + 1) % 4 + 4) {
                    play((k + 1) % 4 + 4);
                } else {
                    if (clock == 4 && history[1] == (k + 3) % 4 + 4) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((k + 3) % 4);
                                break;
                            case 1:
                                play((k + 2) % 4);
                                break;
                        }
                    } else {
                        if (clock == 4 && (history[1] == (k + 2) % 4 || history[1] == (k + 2) % 4 + 4)) {
                            play((k + 3) % 4);
                        } else if (clock == 4 && (history[1] == (k + 3) % 4 || history[1] == (k) % 4 + 4)) {
                            play((k + 2) % 4);
                        }
                    }
                }
                if (history[4] == (k + 3) % 4) {
                    if (clock == 6 && history[5] != (k) % 4 + 4 && history[5] != 8) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((k) % 4 + 4);
                                break;
                            case 1:
                                play(8);
                                break;
                        }
                    } else {
                        if (clock == 6 && history[5] == (k) % 4 + 4) {
                            play(8);
                        } else if (clock == 6) {
                            play((k) % 4 + 4);
                        }
                    }
                } else if (history[4] == (k + 2) % 4) {
                    if (clock == 6 && history[5] != (k + 2) % 4 + 4 && history[5] != 8) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((k + 2) % 4 + 4);
                                break;
                            case 1:
                                play(8);
                                break;
                        }
                    } else {
                        if (clock == 6 && history[5] == (k + 2) % 4 + 4) {
                            play(8);
                        } else if (clock == 6) {
                            play((k + 2) % 4 + 4);
                        }
                    }
                }
            } else if (history[2] == (k + 3) % 4) {
                if (clock == 4 && history[3] != (k) % 4 + 4) {
                    play((k) % 4 + 4);
                } else {
                    if (clock == 4 && history[1] == (k + 2) % 4 + 4) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((k + 1) % 4);
                                break;
                            case 1:
                                play((k + 2) % 4);
                                break;
                        }
                    } else {
                        if (clock == 4 && (history[1] == (k + 2) % 4 || history[1] == (k + 3) % 4 + 4)) {
                            play((k + 1) % 4);
                        } else if (clock == 4 && (history[1] == (k + 1) % 4 + 4 || history[1] == (k + 1) % 4)) {
                            play((k + 2) % 4);
                        }
                    }
                }
                if (history[4] == (k + 1) % 4) {
                    if (clock == 6 && history[5] != (k + 1) % 4 + 4 && history[5] != 8) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((k + 1) % 4 + 4);
                                break;
                            case 1:
                                play(8);
                                break;
                        }
                    } else {
                        if (clock == 6 && history[5] == (k + 1) % 4 + 4) {
                            play(8);
                        } else if (clock == 6) {
                            play((k + 1) % 4 + 4);
                        }
                    }
                } else if (history[4] == (k + 2) % 4) {
                    if (clock == 6 && history[5] != (k + 3) % 4 + 4 && history[5] != 8) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((k + 3) % 4 + 4);
                                break;
                            case 1:
                                play(8);
                                break;
                        }
                    } else {
                        if (clock == 6 && history[5] == (k + 3) % 4 + 4) {
                            play(8);
                        } else if (clock == 6) {
                            play((k + 3) % 4 + 4);
                        }
                    }
                }
            }
        }
    }

    public void hardmodesecond(int k) {
        if (k >= 0 && k <= 3) {
            if (clock == 1) {
                play(8);
            }
            if (clock == 3 && (history[2] == (k + 1) % 4 + 4 || history[2] == (k + 2) % 4 + 4)) {
                play((k + 1) % 4);
            } else if (clock == 3 && (history[2] == k % 4 + 4 || history[2] == (k + 3) % 4 + 4)) {
                play((k + 3) % 4);
            } else if (clock == 3 && history[2] == (k + 2) % 4) {
                int i = randint() % 4;
                switch (i) {
                    case 0:
                        play(k % 4 + 4);
                        break;
                    case 1:
                        play((k + 1) % 4 + 4);
                        break;
                    case 2:
                        play((k + 2) % 4 + 4);
                        break;
                    case 3:
                        play((k + 3) % 4 + 4);
                        break;
                }
            } else if (clock == 3 && history[2] == (k + 3) % 4) {
                play(k % 4 + 4);
            } else if (clock == 3 && history[2] == (k + 1) % 4) {
                play((k + 1) % 4 + 4);
            }
            if (history[3] == (k + 3) % 4) {
                if (clock == 5 && history[4] != (k + 1) % 4) {
                    play((k + 1) % 4);
                } else if (clock == 5 && history[4] == (k + 1) % 4) {
                    play((k + 1) % 4 + 4);
                }
                if (clock == 7 && history[2] != (k + 3) % 4 + 4 && history[6] != (k + 3) % 4 + 4) {
                    play((k + 3) % 4 + 4);
                } else if (clock == 7 && history[2] == (k + 3) % 4 + 4 && history[6] == k % 4 + 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((k + 2) % 4 + 4);
                            break;
                        case 1:
                            play((k + 2) % 4);
                            break;
                    }
                } else if (clock == 7 && history[2] == (k + 3) % 4 + 4 && history[6] == (k + 2) % 4 + 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play(k % 4 + 4);
                            break;
                        case 1:
                            play((k + 2) % 4);
                            break;
                    }
                } else if (clock == 7 && history[2] == (k + 3) % 4 + 4 && history[6] == (k + 2) % 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((k + 2) % 4 + 4);
                            break;
                        case 1:
                            play(k % 4 + 4);
                            break;
                    }
                } else if (clock == 7 && history[2] != (k + 3) % 4 + 4 && history[6] == (k + 3) % 4 + 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((k + 2) % 4 + 4);
                            break;
                        case 1:
                            play((k + 2) % 4);
                            break;
                    }
                }
            } else if (history[3] == (k + 1) % 4) {
                if (clock == 5 && history[4] != (k + 3) % 4) {
                    play((k + 3) % 4);
                } else if (clock == 5 && history[4] == (k + 3) % 4) {
                    play(k % 4 + 4);
                }
                if (clock == 7 && history[2] != (k + 2) % 4 + 4 && history[6] != (k + 2) % 4 + 4) {
                    play((k + 2) % 4 + 4);
                } else if (clock == 7 && history[2] == (k + 2) % 4 + 4 && history[6] == (k + 1) % 4 + 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((k + 3) % 4 + 4);
                            break;
                        case 1:
                            play((k + 2) % 4);
                            break;
                    }
                } else if (clock == 7 && history[2] == (k + 2) % 4 + 4 && history[6] == (k + 3) % 4 + 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((k + 1) % 4 + 4);
                            break;
                        case 1:
                            play((k + 2) % 4);
                            break;
                    }
                } else if (clock == 7 && history[2] == (k + 2) % 4 + 4 && history[6] == (k + 2) % 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((k + 3) % 4 + 4);
                            break;
                        case 1:
                            play((k + 1) % 4 + 4);
                            break;
                    }
                } else if (clock == 7 && history[2] != (k + 2) % 4 + 4 && history[6] == (k + 2) % 4 + 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((k + 3) % 4 + 4);
                            break;
                        case 1:
                            play((k + 2) % 4);
                            break;
                    }
                }
            } else if (history[3] == k % 4 + 4) {
                if (clock == 5 && history[4] != (k + 2) % 4 + 4) {
                    play((k + 2) % 4 + 4);
                } else if (clock == 5 && history[4] == (k + 2) % 4 + 4 && history[2] == (k + 2) % 4) {
                    play((k + 1) % 4);
                } else if (clock == 5 && history[4] == (k + 2) % 4 + 4 && history[2] == (k + 3) % 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((k + 3) % 4 + 4);
                            break;
                        case 1:
                            play((k + 1) % 4 + 4);
                            break;
                    }
                }
                if (history[5] == (k + 1) % 4) {
                    if (clock == 7 && history[6] != (k + 3) % 4) {
                        play((k + 3) % 4);
                    } else if (clock == 7 && history[6] == (k + 3) % 4) {
                        play((k + 3) % 4 + 4);
                    }
                } else if (history[5] == (k + 1) % 4 + 4) {
                    if (clock == 7 && history[6] != (k + 3) % 4 + 4) {
                        play((k + 3) % 4 + 4);
                    } else if (clock == 7 && history[6] == (k + 3) % 4 + 4) {
                        play((k + 2) % 4);
                    }
                } else if (history[5] == (k + 3) % 4 + 4) {
                    if (clock == 7 && history[6] != (k + 1) % 4 + 4) {
                        play((k + 1) % 4 + 4);
                    } else if (clock == 7 && history[6] == (k + 1) % 4 + 4) {
                        play((k + 1) % 4);
                    }
                }
            } else if (history[3] == (k + 1) % 4 + 4) {
                if (clock == 5 && history[4] != (k + 3) % 4 + 4) {
                    play((k + 3) % 4 + 4);
                } else if (clock == 5 && history[4] == (k + 3) % 4 + 4 && history[2] == (k + 2) % 4) {
                    play((k + 3) % 4);
                } else if (clock == 5 && history[4] == (k + 3) % 4 + 4 && history[2] == (k + 1) % 4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play(k % 4 + 4);
                            break;
                        case 1:
                            play((k + 2) % 4 + 4);
                            break;
                    }
                }
                if (history[5] == (k + 3) % 4) {
                    if (clock == 7 && history[6] != (k + 1) % 4) {
                        play((k + 1) % 4);
                    } else if (clock == 7 && history[6] == (k + 1) % 4) {
                        play((k + 1) % 4 + 4);
                    }
                } else if (history[5] == k % 4 + 4) {
                    if (clock == 7 && history[6] != (k + 2) % 4 + 4) {
                        play((k + 2) % 4 + 4);
                    } else if (clock == 7 && history[6] == (k + 2) % 4 + 4) {
                        play((k + 2) % 4);
                    }
                } else if (history[5] == (k + 2) % 4 + 4) {
                    if (clock == 7 && history[6] != k % 4 + 4) {
                        play(k % 4 + 4);
                    } else if (clock == 7 && history[6] == k % 4 + 4) {
                        play((k + 3) % 4);
                    }
                }
            } else if (history[3] == (k + 3) % 4 + 4) {
                if (clock == 5 && history[4] != (k + 1) % 4 + 4) {
                    play((k + 1) % 4 + 4);
                } else if (clock == 5 && history[4] == (k + 1) % 4 + 4) {
                    play((k + 1) % 4);
                }
                if (clock == 7 && history[6] != (k + 3) % 4) {
                    play((k + 3) % 4);
                } else if (clock == 7 && history[6] == (k + 3) % 4) {
                    play(k % 4 + 4);
                }
            } else if (history[3] == (k + 2) % 4 + 4) {
                if (clock == 5 && history[4] != k%4+4) {
                    play(k%4+4);
                } else if (clock == 5 && history[4] == k%4+4) {
                    play((k+3)%4);
                }
                if (clock == 7 && history[6] != (k+1)%4) {
                    play((k+1)%4);
                } else if (clock == 7 && history[6] == (k+1)%4) {
                    play((k+1)%4+4);
                }
            }
        } else if (k >= 4 && k <= 7) {
            if (clock==1){
                g  = k-4;

            }
        } else if (k == 8) {
            if (clock==1){
                g = randint()%4;
                play(g);
            }
            if (clock==3&&history[2]==(g+1)%4+4){
                play((g+3)%4+4);
            } else if (clock == 3 && history[2] ==(g+3)%4+4) {
                play((g+1)%4+4);
            } else if (clock == 3 && history[2] ==(g+1)%4) {
                play((g+3)%4);
            } else if (clock == 3 && history[2] ==(g+3)%4) {
                play((g+1)%4);
            } else if (clock == 3 && history[2] ==g%4+4) {
                play((g+2)%4+4);
            } else if (clock == 3 && history[2] ==(g+2)%4+4) {
                play(g%4+4);
            } else if (clock == 3 && history[2] ==(g+2)%4) {
                int i = randint() % 2;
                switch (i) {
                    case 0:
                        play((g+1)%4);
                        break;
                    case 1:
                        play((g+3)%4);
                        break;
                }
            }
            if (history[3]==(g+3)%4+4){
                if (clock==5&&history[4]==(g+3)%4){
                    play((g+1)%4);
                } else if (clock==5&&history[4]==g%4+4) {
                    play((g+2)%4+4);
                } else if (clock==5&&history[4]==(g+1)%4) {
                    play((g+3)%4);
                } else if (clock==5&&history[4]==(g+2)%4+4) {
                    play(g%4+4);
                } else if (clock==5&&history[4]==(g+2)%4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play(g%4+4);
                            break;
                        case 1:
                            play((g+3)%4);
                            break;
                    }
                }
                if (history[5]==(g+1)%4){
                    if (clock==7&&history[6]==g%4+4){
                        play((g+2)%4+4);
                    } else if (clock==7&&history[6]==(g+2)%4+4) {
                        play(g%4+4);
                    } else if (clock==7&&history[6]==(g+2)%4) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play(g%4+4);
                                break;
                            case 1:
                                play((g+2)%4+4);
                                break;
                        }
                    }
                } else if (history[5] == (g + 2) % 4 + 4) {
                    if (clock==7&&history[6]==(g+1)%4){
                        play((g+3)%4);
                    } else if (clock==7&&history[6]==(g+3)%4) {
                        play((g+1)%4);
                    } else if (clock==7&&history[6]==(g+2)%4) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play(g%4+4);
                                break;
                            case 1:
                                play((g+3)%4);
                                break;
                        }
                    }
                } else if (history[5] == g%4+4) {
                    if (clock==7&&history[6]!=(g+3)%4){
                        play((g+3)%4);
                    } else if (clock == 7 && history[6] == (g + 3) % 4) {
                        play((g+1)%4);
                    }
                } else if (history[5] == (g+3)%4) {
                    if (clock==7&&history[6]!=g%4+4){
                        play(g%4+4);
                    } else if (clock == 7 && history[6] == g%4+4) {
                        play((g+2)%4+4);
                    }
                }
            } else if (history[3]==(g+1)%4+4) {
                if (clock==5&&history[4]!=(g+1)%4){
                    play((g+1)%4);
                } else if (clock==5&&history[4]==(g+1)%4) {
                    play((g+3)%4);
                }
                if (clock==7&&history[6]!=g%4+4){
                    play(g%4+4);
                } else if (clock==7&&history[6]==g%4+4) {
                    play((g+2)%4+4);
                }
            } else if (history[3]==(g+2)%4+4) {
                if (clock==5&&history[4]==(g+1)%4){
                    play((g+3)%4);
                } else if (clock==5&&history[4]==(g+1)%4+4) {
                    play((g+3)%4+4);
                } else if (clock==5&&history[4]==(g+3)%4) {
                    play((g+1)%4);
                } else if (clock==5&&history[4]==(g+3)%4+4) {
                    play((g+1)%4+4);
                } else if (clock==5&&history[4]==(g+2)%4) {
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((g+1)%4);
                            break;
                        case 1:
                            play((g+1)%4+4);
                            break;
                    }
                }
                if (history[5]==(g+3)%4){
                    if (clock==7&&history[6]==(g+1)%4+4){
                        play((g+3)%4+4);
                    } else if (clock==7&&history[6]==(g+3)%4+4) {
                        play((g+1)%4+4);
                    } else if (clock==7&&history[6]==(g+2)%4) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((g+1)%4+4);
                                break;
                            case 1:
                                play((g+3)%4+4);
                                break;
                        }
                    }
                } else if (history[5] == (g+3)%4+4) {
                    if (clock==7&&history[6]==(g+3)%4){
                        play((g+1)%4);
                    } else if (clock==7&&history[6]==(g+1)%4) {
                        play((g+3)%4);
                    } else if (clock==7&&history[6]==(g+2)%4) {
                        int i = randint() % 2;
                        switch (i) {
                            case 0:
                                play((g+1)%4+4);
                                break;
                            case 1:
                                play((g+1)%4);
                                break;
                        }
                    }
                } else if (history[5] == (g+1)%4+4) {
                    if (clock==7&&history[6]!=(g+1)%4){
                        play((g+1)%4);
                    } else if (clock == 7 && history[6] == (g+1)%4) {
                        play((g+3)%4);
                    }
                } else if (history[5] == (g+1)%4) {
                    if (clock==7&&history[6]!=(g+1)%4+4){
                        play((g+1)%4+4);
                    } else if (clock == 7 && history[6] == (g+1)%4+4) {
                        play((g+3)%4+4);
                    }
                }
            } else if (history[3]==g%4+4) {
                if (clock==5&&history[4]!=(g+3)%4){
                    play((g+3)%4);
                } else if (clock==5&&history[4]==(g+3)%4) {
                    play((g+1)%4);
                }
                if (clock==7&&history[6]!=(g+1)%4+4){
                    play((g+1)%4+4);
                } else if (clock==7&&history[6]==(g+1)%4+4) {
                    play((g+3)%4+4);
                }
            } else if (history[3]==(g+1)%4) {
                if (clock==5&&history[4]!=(g+1)%4+4){
                    play((g+1)%4+4);
                } else if (clock==5&&history[4]==(g+1)%4+4) {
                    play((g+3)%4+4);
                }
                if (clock==7&&history[6]!=g%4+4&&history[6]!=(g+2)%4+4){
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play(g%4+4);
                            break;
                        case 1:
                            play((g+2)%4+4);
                            break;
                    }
                } else if (clock == 7 && history[6] == g % 4 + 4) {
                    play((g+2)%4+4);
                } else if (clock == 7 && history[6] == (g+2)%4+4) {
                    play(g%4+4);
                }
            } else if (history[3]==(g+3)%4) {
                if (clock==5&&history[4]!=g%4+4){
                    play(g%4+4);
                } else if (clock==5&&history[4]==g%4+4) {
                    play((g+2)%4+4);
                }
                if (clock==7&&history[6]!=(g+1)%4+4&&history[6]!=(g+3)%4+4){
                    int i = randint() % 2;
                    switch (i) {
                        case 0:
                            play((g+1)%4+4);
                            break;
                        case 1:
                            play((g+3)%4+4);
                            break;
                    }
                } else if (clock == 7 && history[6] == (g+1)%4+4) {
                    play((g+3)%4+4);
                } else if (clock == 7 && history[6] == (g+3)%4+4) {
                    play((g+1)%4+4);
                }
            }
        }
    }

    public void man_vs_ai_place(View v) {
        String s = set(clock);
        boolean isable = false;
        if (v.getId() == R.id.man_vs_ai_place_0) {
            if (place[0][0] == 0) {
                if (s.equals("O")) {
                    place[0][0] = 1;
                } else {
                    place[0][0] = -1;
                }
                history[clock] = 0;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_5) {
            if (place[0][1] == 0) {
                if (s.equals("O")) {
                    place[0][1] = 1;
                } else {
                    place[0][1] = -1;
                }
                history[clock] = 5;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_1) {
            if (place[0][2] == 0) {
                if (s.equals("O")) {
                    place[0][2] = 1;
                } else {
                    place[0][2] = -1;
                }
                history[clock] = 1;
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
        } else if (v.getId() == R.id.man_vs_ai_place_8) {
            if (place[1][1] == 0) {
                if (s.equals("O")) {
                    place[1][1] = 1;
                } else {
                    place[1][1] = -1;
                }
                history[clock] = 8;
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
        } else if (v.getId() == R.id.man_vs_ai_place_3) {
            if (place[2][0] == 0) {
                if (s.equals("O")) {
                    place[2][0] = 1;
                } else {
                    place[2][0] = -1;
                }
                history[clock] = 3;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_7) {
            if (place[2][1] == 0) {
                if (s.equals("O")) {
                    place[2][1] = 1;
                } else {
                    place[2][1] = -1;
                }
                history[clock] = 7;
                isable = true;
            }
        } else if (v.getId() == R.id.man_vs_ai_place_2) {
            if (place[2][2] == 0) {
                if (s.equals("O")) {
                    place[2][2] = 1;
                } else {
                    place[2][2] = -1;
                }
                history[clock] = 2;
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
            case 0:
                man_vs_ai_place(findViewById(R.id.man_vs_ai_place_0));
                break;
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