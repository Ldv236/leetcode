package LeetCode.find;

public class SimpleFind {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target1 = 8;
        String str1 = "";

        System.out.println(linearContains(nums1, target1));
        System.out.println(linearFindIndex(nums1, target1));
        System.out.println(binaryFindIndex(nums1, target1));
    }

    public static boolean linearContains(int[] arr, int element) {
        for (int i : arr) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }

    public static int linearFindIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int binaryFindIndex(int[] arr, int element) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == arr[mid]) {
                return mid; //true
            }

            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1; //false
    }
}