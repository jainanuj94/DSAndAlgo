package main;

public class Main {
    public static void main(String[] args) {
//        System.out.println("******************Tower of Hanoi*********************");
//        TowerOfHanoi.toh(3, 'A', 'B', 'C');
//        System.out.println("******************Tower of Hanoi*********************");
//
//        System.out.println("******************Is Sorted Array*********************");
//        int A[] = { 1, 5, 8, 10, 19};
//        System.out.println("Array is sorted: " + SortedArray.isArraySorted(A, A.length));
//        System.out.println("******************Is Sorted Array*********************");


        System.out.println("******************Connected Cells*********************");
        int matrix[][] = {
            {1, 1, 0, 0, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 1, 1}
        };
//        ConnectedCells.getBiggestRegion(matrix);
        System.out.println(ConnectedCells.getBiggestRegion(matrix));
        System.out.println("******************Connected Cells*********************");

    }
}
