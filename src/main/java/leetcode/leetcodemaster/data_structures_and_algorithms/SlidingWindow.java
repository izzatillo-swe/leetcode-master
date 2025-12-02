package leetcode.leetcodemaster.data_structures_and_algorithms;


public class SlidingWindow {

    public static void main(String[] args) {
        int i = maxSum(new int[]{2, 1, 5, 1, 3, 2}, 3);
        System.out.println(i);
    }

    public static int maxSum(int[] arr, int k) {
        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        // Slide the window
        for (int end = k; end < arr.length; end++) {
            windowSum += arr[end] - arr[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}