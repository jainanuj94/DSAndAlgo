package main;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    private static int missingNumber(int[] nums) {

        int actualSum = (nums.length+1)*(nums.length)/2;
        return actualSum - Arrays.stream(nums).sum();
        /*** Solution 2 ***/
        //        int[] array = new int[nums.length+1];
//        Arrays.fill(array, -1);
//
//        for (int i = 0; i < nums.length; i++) {
//            array[nums[i]] = nums[i];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if(array[i] == -1) return i;
//        }
//        return nums.length;

        /*** Solution 1 ***/
        //        Arrays.sort(nums);
//
//        int i;
//        for (i = 0; i < nums.length; i++) {
//            if(nums[i] != i) return i;
//        }
//        return i;
    }
}
