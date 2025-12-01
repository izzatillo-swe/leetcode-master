package leetcode.leetcodemaster.data_structures_and_algorithms;


import java.util.Arrays;

public class TwoPointers {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9);
        System.out.println(Arrays.toString(ints));

        boolean palindrome = isPalindrome("abcdcba");
        System.out.println(palindrome);
    }

    /// buyerda sorted array ichidan ikkita indexlarning yig'indisi targetga teng bolganini topish kerak.
    /// bu usul faqat array o'sish tartibida sort qilingan bo'lsagina ishlaydi.
    public static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) return new int[]{left, right};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    /// Stringni palindromlikka tekshirish, bu ham two pointers bilan ishlanadi
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}