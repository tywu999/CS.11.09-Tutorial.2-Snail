import static org.junit.jupiter.api.Assertions.*;

class SnailTest {

    private int[][] snail_1;
    private int[][] snail_2;
    private int[][] snail_3;
    private int[][] snail_4;
    private int[][] snail_5;
    private int[][] snail_6;
    private int[][] snail_7;
    private int[][] snail_8;

    private int[] flattenedSnail_1;
    private int[] flattenedSnail_2;
    private int[] flattenedSnail_3;
    private int[] flattenedSnail_4;
    private int[] flattenedSnail_5;
    private int[] flattenedSnail_6;
    private int[] flattenedSnail_7;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        snail_1 = new int[][]
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

        snail_2 = new int[][]
                {
                        {1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}
                };

        // 2D array 7 x 7
        snail_3 = new int[7][7];
        int value = 1;
        for (int i = 0; i < snail_3.length; i++) {
            for (int j = 0; j < snail_3[i].length; j++)
                snail_3[i][j] = value++;
        }

        // 2D array 10 x 10.
        snail_4 = new int[10][10];
        value = 1;
        for (int i = 0; i < snail_4.length; i++) {
            for (int j = 0; j < snail_4[i].length; j++)
                snail_4[i][j] = value++;
        }

        // 2D array not a square.
        snail_5 = new int[3][5];
        value = 1;
        for (int i = 0; i < snail_5.length; i++) {
            for (int j = 0; j < snail_5[i].length; j++)
                snail_5[i][j] = value++;
        }

        // Length of last row not equal to the number of rows.
        snail_6 = new int[][] {

                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24}

        };

        // Length of first row not equal to the number of rows.
        snail_7 = new int[][] {

                {1,2,3,4},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}

        };

        // Length of middle row not equal to the number of rows.
        snail_8 = new int[][] {

                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14},
                {16,17,18,19,20},
                {21,22,23,24,25}

        };

        flattenedSnail_1 = new int[] {1,2,3,4,5,6,7,8,9};

        flattenedSnail_2 = new int[64];
        for (int i = 0; i < flattenedSnail_2.length; i++) flattenedSnail_2[i] = i+1;

        flattenedSnail_3 = new int[100];
        for (int i = 0; i < flattenedSnail_3.length; i++) flattenedSnail_3[i] = i+1;

        flattenedSnail_4 = new int[121];
        for (int i = 0; i < flattenedSnail_4.length; i++) flattenedSnail_4[i] = i+1;

        // Length of array (10) not a perfect square.
        flattenedSnail_5 = new int[] {1,2,3,4,5,6,7,8,9,10};

        // Length of array (14) not a perfect square.
        flattenedSnail_6 = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        // Length of array (101) not a perfect square.
        flattenedSnail_7 = new int[101];
        for (int i = 0; i < flattenedSnail_7.length; i++) flattenedSnail_7[i] = i+1;

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

        snail_1 = null;
        snail_2 = null;
        snail_3 = null;
        snail_4 = null;
        snail_5 = null;
        snail_6 = null;
        snail_7 = null;
        snail_8 = null;

        flattenedSnail_1 = null;
        flattenedSnail_2 = null;
        flattenedSnail_3 = null;
        flattenedSnail_4 = null;
        flattenedSnail_5 = null;
        flattenedSnail_6 = null;
        flattenedSnail_7 = null;

    }

    @org.junit.jupiter.api.Test
    void flattenSnail1() {

        int[] flattenedSnail_1 = Snail.flattenSnail(snail_1);

//        {1,2,3},
//        {4,5,6},
//        {7,8,9}

        assertEquals(flattenedSnail_1[0], 1);
        assertEquals(flattenedSnail_1[1], 2);
        assertEquals(flattenedSnail_1[2], 3);
        assertEquals(flattenedSnail_1[3], 6);
        assertEquals(flattenedSnail_1[4], 9);
        assertEquals(flattenedSnail_1[5],8);
        assertEquals(flattenedSnail_1[6],7);
        assertEquals(flattenedSnail_1[7], 4);
        assertEquals(flattenedSnail_1[8],5);


    }

    @org.junit.jupiter.api.Test
    void flattenSnail2() {

        int[] flattenedSnail_1 = Snail.flattenSnail(snail_2);

//                        {1,2,3,4,5},
//                        {6,7,8,9,10},
//                        {11,12,13,14,15},
//                        {16,17,18,19,20},
//                        {21,22,23,24,25}

        assertEquals(flattenedSnail_1[0], 1);
        assertEquals(flattenedSnail_1[1], 2);
        assertEquals(flattenedSnail_1[2], 3);
        assertEquals(flattenedSnail_1[3], 4);
        assertEquals(flattenedSnail_1[4], 5);
        assertEquals(flattenedSnail_1[5],10);
        assertEquals(flattenedSnail_1[6],15);
        assertEquals(flattenedSnail_1[7], 20);
        assertEquals(flattenedSnail_1[8],25);

        assertEquals(flattenedSnail_1[9], 24);
        assertEquals(flattenedSnail_1[10], 23);
        assertEquals(flattenedSnail_1[11], 22);
        assertEquals(flattenedSnail_1[12], 21);
        assertEquals(flattenedSnail_1[13], 16);
        assertEquals(flattenedSnail_1[14],11);
        assertEquals(flattenedSnail_1[15],6);
        assertEquals(flattenedSnail_1[16], 7);
        assertEquals(flattenedSnail_1[17],8);

        assertEquals(flattenedSnail_1[18], 9);
        assertEquals(flattenedSnail_1[19], 14);
        assertEquals(flattenedSnail_1[20], 19);
        assertEquals(flattenedSnail_1[21], 18);
        assertEquals(flattenedSnail_1[22], 17);
        assertEquals(flattenedSnail_1[23],12);
        assertEquals(flattenedSnail_1[24],13);

    }

    @org.junit.jupiter.api.Test
    void flattenSnail3() {

        int[] flattenedSnail_1 = Snail.flattenSnail(snail_3);

//      {1,2,3,4,5,6,7},
//      {8,9,10,11,12,13,14},
//      {15,16,17,18,19,20,21},
//      {22,23,24,25,26,27,28},
//      {29,30,31,32,33,34,35}
//      {36,37,38,39,40,41,42}
//      {43,44,45,46,47,48,49}

        assertEquals(flattenedSnail_1[0], 1);
        assertEquals(flattenedSnail_1[1], 2);
        assertEquals(flattenedSnail_1[2], 3);
        assertEquals(flattenedSnail_1[3], 4);
        assertEquals(flattenedSnail_1[4], 5);
        assertEquals(flattenedSnail_1[5],6);
        assertEquals(flattenedSnail_1[6],7);
        assertEquals(flattenedSnail_1[7], 14);
        assertEquals(flattenedSnail_1[8],21);

        assertEquals(flattenedSnail_1[9], 28);
        assertEquals(flattenedSnail_1[10], 35);
        assertEquals(flattenedSnail_1[11], 42);
        assertEquals(flattenedSnail_1[12], 49);
        assertEquals(flattenedSnail_1[13], 48);
        assertEquals(flattenedSnail_1[14],47);
        assertEquals(flattenedSnail_1[15],46);
        assertEquals(flattenedSnail_1[16], 45);
        assertEquals(flattenedSnail_1[17],44);

        assertEquals(flattenedSnail_1[18], 43);
        assertEquals(flattenedSnail_1[19], 36);
        assertEquals(flattenedSnail_1[20], 29);
        assertEquals(flattenedSnail_1[21], 22);
        assertEquals(flattenedSnail_1[22], 15);
        assertEquals(flattenedSnail_1[23],8);
        assertEquals(flattenedSnail_1[24],9);
        assertEquals(flattenedSnail_1[25], 10);
        assertEquals(flattenedSnail_1[26],11);

        assertEquals(flattenedSnail_1[27], 12);
        assertEquals(flattenedSnail_1[28], 13);
        assertEquals(flattenedSnail_1[29], 20);
        assertEquals(flattenedSnail_1[30], 27);
        assertEquals(flattenedSnail_1[31], 34);
        assertEquals(flattenedSnail_1[32],41);
        assertEquals(flattenedSnail_1[33],40);
        assertEquals(flattenedSnail_1[34], 39);
        assertEquals(flattenedSnail_1[35],38);

        assertEquals(flattenedSnail_1[36], 37);
        assertEquals(flattenedSnail_1[37], 30);
        assertEquals(flattenedSnail_1[38], 23);
        assertEquals(flattenedSnail_1[39], 16);
        assertEquals(flattenedSnail_1[40], 17);
        assertEquals(flattenedSnail_1[41],18);
        assertEquals(flattenedSnail_1[42],19);
        assertEquals(flattenedSnail_1[43], 26);
        assertEquals(flattenedSnail_1[44],33);

        assertEquals(flattenedSnail_1[45], 32);
        assertEquals(flattenedSnail_1[46], 31);
        assertEquals(flattenedSnail_1[47], 24);
        assertEquals(flattenedSnail_1[48], 25);

    }

    @org.junit.jupiter.api.Test
    void flattenSnail4() {

        int[] flattenedSnail_1 = Snail.flattenSnail(snail_4);
        assertEquals(100,flattenedSnail_1.length);

    }

    @org.junit.jupiter.api.Test
    void flattenSnail5() {

        int[] flattenedSnail_1 = Snail.flattenSnail(snail_5);
        assertEquals(0,flattenedSnail_1.length);

    }

    @org.junit.jupiter.api.Test
    void flattenSnail6() {

        int[] flattenedSnail_1 = Snail.flattenSnail(snail_6);
        assertEquals(0,flattenedSnail_1.length);

    }

    @org.junit.jupiter.api.Test
    void flattenSnail7() {

        int[] flattenedSnail_1 = Snail.flattenSnail(snail_7);
        assertEquals(0,flattenedSnail_1.length);

    }

    @org.junit.jupiter.api.Test
    void flattenSnail8() {

        int[] flattenedSnail_1 = Snail.flattenSnail(null);
        assertEquals(0,flattenedSnail_1.length);

    }


    @org.junit.jupiter.api.Test
    void makeSnail1() {

        int[][] snail = Snail.makeSnail(flattenedSnail_1);

        int[][] expectedResult =
                {
                        {1,2,3},
                        {8,9,4},
                        {7,6,5}
                };

        for (int i = 0; i < expectedResult.length; i++) {
            for (int j = 0; j < expectedResult[i].length; j++) {

                assertEquals(expectedResult[i][j], snail[i][j]);

            }
        }

    }

    @org.junit.jupiter.api.Test
    void makeSnail2() {

        int[][] snail = Snail.makeSnail(flattenedSnail_2);

        int[][] expectedResult =
                {
                        {1,2,3,4,5,6,7,8},
                        {28,29,30,31,32,33,34,9},
                        {27,48,49,50,51,52,35,10},
                        {26,47,60,61,62,53,36,11},
                        {25,46,59,64,63,54,37,12},
                        {24,45,58,57,56,55,38,13},
                        {23,44,43,42,41,40,39,14},
                        {22,21,20,19,18,17,16,15}
                };

        for (int i = 0; i < expectedResult.length; i++) {
            for (int j = 0; j < expectedResult[i].length; j++) {

                assertEquals(expectedResult[i][j], snail[i][j]);

            }
        }

    }

    @org.junit.jupiter.api.Test
    void makeSnail3() {

        int[][] snail = Snail.makeSnail(flattenedSnail_3);

        int[][] expectedResult =
                {
                        {1,2,3,4,5,6,7,8,9,10},
                        {36,37,38,39,40,41,42,43,44,11},
                        {35,64,65,66,67,68,69,70,45,12},
                        {34,63,84,85,86,87,88,71,46,13},
                        {33,62,83,96,97,98,89,72,47,14},
                        {32,61,82,95,100,99,90,73,48,15},
                        {31,60,81,94,93,92,91,74,49,16},
                        {30,59,80,79,78,77,76,75,50,17},
                        {29,58,57,56,55,54,53,52,51,18},
                        {28,27,26,25,24,23,22,21,20,19},
                };

        for (int i = 0; i < expectedResult.length; i++) {
            for (int j = 0; j < expectedResult[i].length; j++) {

                assertEquals(expectedResult[i][j], snail[i][j]);

            }
        }

    }

    @org.junit.jupiter.api.Test
    void makeSnail4() {

        int[][] snail = Snail.makeSnail(flattenedSnail_5);

        int[][] expectedResult = new int[0][0];

        assertEquals(0,snail.length);

    }

    @org.junit.jupiter.api.Test
    void makeSnail5() {

        int[][] snail = Snail.makeSnail(flattenedSnail_6);

        int[][] expectedResult = new int[0][0];

        assertEquals(0,snail.length);

    }

    @org.junit.jupiter.api.Test
    void makeSnail6() {

        int[][] snail = Snail.makeSnail(flattenedSnail_7);

        int[][] expectedResult = new int[0][0];

        assertEquals(0,snail.length);

    }

    @org.junit.jupiter.api.Test
    void makeSnail7() {

        int[][] snail = Snail.makeSnail(null);

        int[][] expectedResult = new int[0][0];

        assertEquals(0, snail.length);

    }

}