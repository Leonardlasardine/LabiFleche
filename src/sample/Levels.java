package sample;

public class Levels {

    public static int[][] levels(int level) {

    int[][] c1 = new int[10][10];
    c1[0][0] = 1;  c1[0][1] = 41; c1[0][2] = 5;  c1[0][3] = 45; c1[0][4] = 9;  c1[0][5] = 2;  c1[0][6] = 2;  c1[0][7] = 2;  c1[0][8] = 2;  c1[0][9] = 1;
    c1[1][0] = 1;  c1[1][1] = 3;  c1[1][2] = 4;  c1[1][3] = 25; c1[1][4] = 2;  c1[1][5] = 1;  c1[1][6] = 5;  c1[1][7] = 2;  c1[1][8] = 3;  c1[1][9] = 9;
    c1[2][0] = 0;  c1[2][1] = 4;  c1[2][2] = 16; c1[2][3] = 4;  c1[2][4] = 7;  c1[2][5] = 45; c1[2][6] = 1;  c1[2][7] = 2;  c1[2][8] = 6;  c1[2][9] = 5;
    c1[3][0] = 1;  c1[3][1] = 2;  c1[3][2] = 2;  c1[3][3] = 5;  c1[3][4] = 4;  c1[3][5] = 6;  c1[3][6] = 1;  c1[3][7] = 45; c1[3][8] = 6;  c1[3][9] = 6;
    c1[4][0] = 0;  c1[4][1] = 45; c1[4][2] = 2;  c1[4][3] = 5;  c1[4][4] = 2;  c1[4][5] = 3;  c1[4][6] = 1;  c1[4][7] = 4;  c1[4][8] = 6;  c1[4][9] = 3;
    c1[5][0] = 1;  c1[5][1] = 2;  c1[5][2] = 37; c1[5][3] = 7;  c1[5][4] = 27; c1[5][5] = 3;  c1[5][6] = 12; c1[5][7] = 3;  c1[5][8] = 7;  c1[5][9] = 6;
    c1[6][0] = 4;  c1[6][1] = 45; c1[6][2] = 5;  c1[6][3] = 7;  c1[6][4] = 2;  c1[6][5] = 1;  c1[6][6] = 4;  c1[6][7] = 3;  c1[6][8] = 11; c1[6][9] = 3;
    c1[7][0] = 1;  c1[7][1] = 24; c1[7][2] = 1;  c1[7][3] = 2;  c1[7][4] = 3;  c1[7][5] = 0;  c1[7][6] = 3;  c1[7][7] = 29; c1[7][8] = 3;  c1[7][9] = 1;
    c1[8][0] = 1;  c1[8][1] = 1;  c1[8][2] = 1;  c1[8][3] = 3;  c1[8][4] = 2;  c1[8][5] = 6;  c1[8][6] = 2;  c1[8][7] = 28; c1[8][8] = 7;  c1[8][9] = 1;
    c1[9][0] = 1;  c1[9][1] = 0;  c1[9][2] = 0;  c1[9][3] = 45; c1[9][4] = 3;  c1[9][5] = 2;  c1[9][6] = 10; c1[9][7] = 2;  c1[9][8] = 6;  c1[9][9] = 2;

    int[][] c2 = new int[10][10];
    c2[0][0] = 0;  c2[0][1] = 0;  c2[0][2] = 0;  c2[0][3] = 0;  c2[0][4] = 0;  c2[0][5] = 0;  c2[0][6] = 0;  c2[0][7] = 0;  c2[0][8] = 0;  c2[0][9] = 0;
    c2[1][0] = 0;  c2[1][1] = 0;  c2[1][2] = 0;  c2[1][3] = 0;  c2[1][4] = 0;  c2[1][5] = 0;  c2[1][6] = 0;  c2[1][7] = 0;  c2[1][8] = 0;  c2[1][9] = 0;
    c2[2][0] = 0;  c2[2][1] = 0;  c2[2][2] = 0;  c2[2][3] = 0;  c2[2][4] = 0;  c2[2][5] = 0;  c2[2][6] = 0;  c2[2][7] = 0;  c2[2][8] = 0;  c2[2][9] = 0;
    c2[3][0] = 0;  c2[3][1] = 0;  c2[3][2] = 0;  c2[3][3] = 0;  c2[3][4] = 0;  c2[3][5] = 0;  c2[3][6] = 0;  c2[3][7] = 0;  c2[3][8] = 0;  c2[3][9] = 0;
    c2[4][0] = 0;  c2[4][1] = 0;  c2[4][2] = 0;  c2[4][3] = 0;  c2[4][4] = 0;  c2[4][5] = 0;  c2[4][6] = 0;  c2[4][7] = 0;  c2[4][8] = 0;  c2[4][9] = 0;
    c2[5][0] = 0;  c2[5][1] = 0;  c2[5][2] = 0;  c2[5][3] = 0;  c2[5][4] = 0;  c2[5][5] = 0;  c2[5][6] = 0;  c2[5][7] = 0;  c2[5][8] = 0;  c2[5][9] = 0;
    c2[6][0] = 0;  c2[6][1] = 0;  c2[6][2] = 0;  c2[6][3] = 0;  c2[6][4] = 0;  c2[6][5] = 0;  c2[6][6] = 0;  c2[6][7] = 0;  c2[6][8] = 0;  c2[6][9] = 0;
    c2[7][0] = 0;  c2[7][1] = 0;  c2[7][2] = 0;  c2[7][3] = 0;  c2[7][4] = 0;  c2[7][5] = 0;  c2[7][6] = 0;  c2[7][7] = 0;  c2[7][8] = 0;  c2[7][9] = 0;
    c2[8][0] = 0;  c2[8][1] = 0;  c2[8][2] = 0;  c2[8][3] = 0;  c2[8][4] = 0;  c2[8][5] = 0;  c2[8][6] = 0;  c2[8][7] = 0;  c2[8][8] = 0;  c2[8][9] = 0;
    c2[9][0] = 0;  c2[9][1] = 0;  c2[9][2] = 0;  c2[9][3] = 0;  c2[9][4] = 0;  c2[9][5] = 0;  c2[9][6] = 0;  c2[9][7] = 0;  c2[9][8] = 0;  c2[9][9] = 0;

    int[][] c = new int[10][10];

    switch (level) {
        case 1 -> c = c1;
        case 2 -> c = c2;
    }

    return c;
    }
}
