package main;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RaceCar {

    public static int racecar(int target) {
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(new int[]{0, 1});
        visited.add("0-1");

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int position = current[0];
                int speed = current[1];

                if (position == target) {
                    return steps;
                }

                // Accelerate
                int newPositionA = position + speed;
                int newSpeedA = speed * 2;
                String stateA = newPositionA + "-" + newSpeedA;

                if (!visited.contains(stateA) && Math.abs(newPositionA - target) < target) {
                    queue.offer(new int[]{newPositionA, newSpeedA});
                    visited.add(stateA);
                }

                // Reverse
                int newPositionR = position;
                int newSpeedR = (speed > 0) ? -1 : 1;
                String stateR = newPositionR + "-" + newSpeedR;

                if (!visited.contains(stateR) && Math.abs(newPositionR - target) < target) {
                    queue.offer(new int[]{newPositionR, newSpeedR});
                    visited.add(stateR);
                }
            }

            steps++;
        }

        return -1; // Should not reach here
    }

    public static void main(String[] args) {
        int target = 4;
        System.out.println(racecar(3)); // Output: 2 (AA)
        System.out.println(racecar(4)); // Output: 5 (AARRA)
        System.out.println(racecar(6));
    }
}
