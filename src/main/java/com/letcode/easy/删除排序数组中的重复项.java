package com.letcode.easy;

import java.util.HashSet;

/**
 * @description:
 * @author: YX
 * @date: 2020/10/27 10:14
 */
public class 删除排序数组中的重复项 {

    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int[] nums2 = {1,2,3,4,5};
        int[] nums3 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));
        System.out.println(removeDuplicates(nums3));
    }

    /**
     * 双指针法
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}