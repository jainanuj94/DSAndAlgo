package main;

public class ConnectedCells {

    /**
     * Approach:
     * start with the max region as 0
     * 1) We need to traverse the matrix - start traversing
     * 2) getSize of the current Region
     * 3) current Region size vs previous maxRegion size set max as new maxregion
     *
     * Current Region Size Calculation
     * 1) Change the visited matrix to 0 so that we dont visit it again
     * 2) go from row - 1, row, row + 1 to col -1, col, col + 1 i.e. covering a total of 8 nodes (9 - 1 self node)
     * @param matrix
     * @return
     */
    public static int getBiggestRegion(int[][] matrix){
        int maxRegion = 0;

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix.length; column++){
                if(matrix[row][column] == 1){
                    int size = getRegionSize(matrix, row, column);
                    System.out.println("Called Region size for [" + row + "][" + column + "] = SIZE: " + size);
                    maxRegion = Math.max(size, maxRegion);
                }
            }
        }
        return maxRegion;
    }

    private static int getRegionSize(int[][] matrix, int row, int column) {
        if(row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length){
            return 0;
        }

        if(matrix[row][column] == 0){
            return 0;
        }

        matrix[row][column] = 0;
        int size = 1;
        for(int r=row - 1; r <= row + 1; r++){
            for(int c=column-1; c<=column+1; c++){
                if(r != row || c != column){
                    size +=getRegionSize(matrix, r, c);
                }
            }
        }
        return size;
    }
}
