package leetcode.leetcodemaster.data_structures_and_algorithms;


public class PrefixSum {

    public static void main(String[] args) {
        int[] prefix = buildPrefixSum(new int[]{2, 5, 3, 10});
        System.out.println(rangeSum(prefix, 1, 3));
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
}