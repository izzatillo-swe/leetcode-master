package leetcode.leetcodemaster.data_structures_and_algorithms;


import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {
        int[] prefix = buildPrefixSum(new int[]{5, 1, 3, 6, 2, 4});
        System.out.println(Arrays.toString(prefix));
        System.out.println(rangeSum(prefix, 2, 5));

        int[] i = windowSumsWithPrefix(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3);
        System.out.println(Arrays.toString(i));
    }

    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    public static int rangeSum(int[] prefix, int l, int r) {
        if (l == 0) {
            return prefix[r];
        } else {
            return prefix[r] - prefix[l - 1];
        }
    }

    public static int[] windowSumsWithPrefix(int[] arr, int k) {
        int[] prefix = buildPrefixSum(arr);
        int[] result = new int[k];

        result[0] = prefix[k-1];
        for (int i = 1; i < k; i++) {
            result[i] = prefix[i + 2] - prefix[i - 1];
        }

        return result;
    }
}