package main;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        final HashMap<Integer, Integer> integerBooleanHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(integerBooleanHashMap.containsKey(complement)) return new int[]{integerBooleanHashMap.get(complement), i};
            integerBooleanHashMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
