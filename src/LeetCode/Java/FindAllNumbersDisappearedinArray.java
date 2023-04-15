package LeetCode.Java;

import java.util.*;

public class FindAllNumbersDisappearedinArray {

    static int[] nums1 = {4,3,2,7,8,2,3,1};
    static int[] nums2 = {1,1};
    static int[] nums3 = {1,2,4,4};

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(nums1));
        System.out.println(findDisappearedNumbers(nums2));
        System.out.println(findDisappearedNumbers(nums3));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> array = new ArrayList<>();
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            array.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            array.remove(Integer.valueOf(nums[i]));
        }

        return array;
    }
}
