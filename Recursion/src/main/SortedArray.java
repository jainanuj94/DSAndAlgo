package main;

public class SortedArray {

    public static int isArraySorted(int A[], int numberOfElements){
        if(numberOfElements == 1){
            return 1;
        }

        return A[numberOfElements-1] < A[numberOfElements - 2] ? 0:
            isArraySorted(A, numberOfElements - 1);
    }
}
