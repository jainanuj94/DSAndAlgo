package main;

public class AverageTemperature {

    public static void main(String[] args) {
        System.out.println(averageTemperature(new int[]{19, 29, 42, 24, 12}, 4));
    }

    private static double averageTemperature(int[] temperatures, int days) {
        int sum=0;
        for (int i = 0; i < days; i++) {
            sum += temperatures[i];
        }

        return sum/days;
    }
}
