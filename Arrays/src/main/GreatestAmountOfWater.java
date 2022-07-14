package main;

public class GreatestAmountOfWater {
    public static void main(String[] args) {
        final int[] heights = {7, 1, 2, 3, 9};
        System.out.println(maxWaterContainer(heights));
    }

    // input is array of numbers
    static int maxWaterContainer(int[] heights){
        int maxArea = 0;
        int startIndex = 0;
        int endIndex = heights.length - 1;

        while(startIndex < endIndex){
            int area = 0;

            if(heights[startIndex] == heights[endIndex]) {
                area = heights[startIndex] * heights[endIndex];
                startIndex++;
                endIndex--;
            } else if (heights[startIndex] < heights[endIndex]){
                area = (int) Math.pow(heights[startIndex], 2);
                startIndex++;
            }
            else {
                area = (int) Math.pow(heights[endIndex], 2);
                endIndex--;
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
