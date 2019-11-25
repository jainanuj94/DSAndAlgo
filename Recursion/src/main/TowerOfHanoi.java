package main;

public class TowerOfHanoi {

    /**
     * Tower of Hanoi Problem
     */
    public static void toh(int numberOfDisks, char fromPeg, char toPeg, char auxPeg){
        if(numberOfDisks == 1){
            System.out.println("Move disk " + numberOfDisks + " from " + fromPeg + " to " + toPeg);
            return;
        }

        // Move n-1 from A to B
        toh(numberOfDisks-1, fromPeg, auxPeg, toPeg);

        System.out.println("Move disk " + numberOfDisks + " from " + fromPeg + " to " + toPeg);

        toh(numberOfDisks-1, auxPeg, toPeg, fromPeg);
    }
}
