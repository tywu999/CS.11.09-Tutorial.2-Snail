public class Snail {
    public static void main(String[] args) {
        int[][] z= new int[][] {

                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}

        };
        flattenSnail(z);
    }

    /**
     *
     * TODO 5
     *
     * Input: an n x n 2d array.
     * Output: a 1d array of length n^2 that contains the order of elements visited in a snail traversal of the 2d array.
     *
     * Example:
     *
     * Input:
     *
     * {
     *     {1,2,3},
     *     {4,5,6},
     *     {7,8,9}
     * }
     *
     * Output:
     *
     * {1,2,3,6,9,8,7,4,5}
     *
     * @param array2d
     * @return a 1d array containing the order of elements visited in a snail traversal of the 2d array.
     *         returns an empty array if array2d is not square.
     */
    public static int[] flattenSnail(int[][] array2d) {
        int[] a = new int[0];
        if(array2d == null || !isPerfectSquare(array2d)){
            return a;
        }

        int asdf = (array2d.length)*(array2d[0].length);
        int[] map = new int[asdf];
        int Row = 0;
        int Col = 0;
        int countRow = array2d.length;
        int countCol = array2d[0].length;
        int mapPlace = 0;
        while(mapPlace < map.length){
            for(int z = 0; z < countCol-1; z++){
                map[mapPlace] = array2d[Row][Col];
                Col++;
                mapPlace++;
            }
            for(int i = 0; i < Math.min(array2d.length, array2d[0].length); i++){
                for(int z = 0; z < countRow-1; z++){
                    if(mapPlace >= map.length){
                        break;
                    }
                    map[mapPlace] = array2d[Row][Col];
                    Row++;
                    mapPlace++;
                }
                for(int z = 0; z < countCol-1; z++){
                    if(mapPlace >= map.length){
                        break;
                    }
                    map[mapPlace] = array2d[Row][Col];
                    mapPlace++;
                    Col--;
                }
                for(int z = 0; z < countRow-2; z++){
                    if(mapPlace >= map.length){
                        break;
                    }
                    map[mapPlace] = array2d[Row][Col];
                    mapPlace++;
                    Row--;
                }
                for(int z = 0; z < countCol-2; z++){
                    if(mapPlace >= map.length){
                        break;
                    }
                    map[mapPlace] = array2d[Row][Col];
                    Col++;
                    mapPlace++;
                }
                countRow -=2;
                countCol-=2;
            }
            map[map.length-1] = array2d[Row][Col];
            mapPlace++;

            print1dArray(map);
        }


        return map;
    }

    /**
     *
     * TODO 6
     *
     * Input: a 1d array of length n, where n is a perfect square.
     * Output: a 2d array of width == height == sqrt(n) that represents a snail.
     *
     * Example:
     *
     * Input:
     *
     * {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
     *
     * Output:
     *
     * {
     *     {1,2,3,4,5},
     *     {16,17,18,19,6},
     *     {15,24,25,20,7},
     *     {14,23,22,21,8},
     *     {13,12,11,10,9},
     * }
     *
     *
     * @param array1d
     * @return a 2d array of width == height == sqrt(n), where n is the length of the inputted array, that represents a snail.
     *         returns an empty 2d array if the length of array1d is not a perfect square.
     */
    public static int[][] makeSnail(int[] array1d) {
        int[][] a = new int[0][0];
        if(array1d == null || !isPerfectSquare(array1d)){
            return a;
        }

        int asdf = (int)Math.sqrt(array1d.length);
        int[][] map = new int[asdf][asdf];
        int Row = 0;
        int Col = 0;
        int countRow = asdf;
        int countCol = asdf;
        int mapPlace = 0;
        while(mapPlace < map.length){
            for(int z = 0; z < countCol-1; z++){
                map[Row][Col] = array1d[mapPlace];
                Col++;
                mapPlace++;
            }
            for(int i = 0; i < asdf*2; i++){
                for(int z = 0; z < countRow-1; z++){
                    if(mapPlace >= array1d.length){
                        break;
                    }
                    map[Row][Col] = array1d[mapPlace];
                    Row++;
                    mapPlace++;
                }
                for(int z = 0; z < countCol-1; z++){
                    if(mapPlace >= array1d.length){
                        break;
                    }
                    map[Row][Col] = array1d[mapPlace];
                    mapPlace++;
                    Col--;
                }
                for(int z = 0; z < countRow-2; z++){
                    if(mapPlace >= array1d.length){
                        break;
                    }
                    map[Row][Col] = array1d[mapPlace];
                    mapPlace++;
                    Row--;
                }
                for(int z = 0; z < countCol-2; z++){
                    if(mapPlace >= array1d.length){
                        break;
                    }
                    map[Row][Col] = array1d[mapPlace];
                    Col++;
                    mapPlace++;
                }
                countRow -=2;
                countCol-=2;
            }
            map[Row][Col] = array1d[array1d.length-1];
            mapPlace++;

            print2dArray(map);
        }


        return map;
    }

    /**
     *
     * TODO 1
     *
     * Private helper method that prints the contents of a 1d array.
     * Used mainly for debugging purposes.
     *
     * @param array1d
     */
    private static void print1dArray(int[] array1d) {
        for(int i = 0; i < array1d.length; i++){
            System.out.print(array1d[i] + " ");
        }
    }

    /**
     *
     * TODO 2
     *
     * Private helper method that prints the contents of a 2d array.
     * Used mainly for debugging purposes.
     *
     * @param array2d
     */
    private static void print2dArray(int[][] array2d) {
        for(int i = 0; i < array2d.length; i++){
            for(int j = 0; j < array2d.length; j++){
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /**
     *
     * TODO 3
     *
     * Private helper method that checks to see if a 1d array is of a length that is a perfect square.
     *
     * @param array1d
     * @return
     */
    private static boolean isPerfectSquare(int[] array1d) {
        double a = Math.sqrt(array1d.length);
        int aa = (int)a;
        if(a-aa != 0.0){
            return false;
        }
        return true;
    }


    /**
     *
     * TODO 4
     *
     * Private helper method that checks to see if a 2d array is a square.
     *
     * @param array2d
     * @return
     */
    private static boolean isPerfectSquare(int[][] array2d) {
        int lengthab = array2d[0].length;
        for(int i = 0; i < array2d.length; i++){
            if(array2d[i].length != lengthab){
                return false;
            }
        }
        if(array2d.length != array2d[0].length){
            return false;
        }
        return true;
    }


}
