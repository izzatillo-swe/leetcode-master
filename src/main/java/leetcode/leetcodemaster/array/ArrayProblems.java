package leetcode.leetcodemaster.array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 7, 4, 2, 15}, 17);
        System.out.println(Arrays.toString(ints));
    }

    // Two Sum -> Easy
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (map.containsKey(n)) {
                return new int[]{map.get(n), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}