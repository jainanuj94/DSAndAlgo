package main;

import java.util.Arrays;

/*
You are given two integer arrays nums1 and nums2,
sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function,
 but instead be stored inside the array nums1.
 To accommodate this, nums1 has a length of m + n, where the first m elements denote
  the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */


/**** NOT ANSWERED ****/
public class MergeSortedArrays {
    public static void main(String[] args) {
        final int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3, n = 3;
        final int[] nums2 = new int[]{2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = 0;
        int nums2Index = 0;


        while(nums1Index < m+n && nums2Index < n){
            if(nums1[nums1Index] > nums2[nums2Index]){
                int temp = nums1[nums1Index];
//                nums1[nums1Index] = nums2[nums2Index];
//                int t = nums1[nums1Index];
                for(int i = nums1Index; i < m+n-1; i++){
                    temp = nums1[i];
                    nums1[i+1] = temp;
                }
                nums1[nums1Index] = nums2[nums2Index];
                nums2Index++;
                nums1Index++;
            } else if (nums1[nums1Index] <= nums2[nums2Index]) {
                nums1Index++;
            }
        }
    }
}
