package leetcode.leetcodemaster.array;


import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {

    public static void main(String[] args) {
        // Two Sum -> Easy
//        int[] ints = twoSum(new int[]{1, 7, 4, 2, 15}, 17);
//        System.out.println(Arrays.toString(ints));

        // Remove Elements
//        int i = removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
//        int i = removeElement(new int[]{3, 2, 2, 3}, 3);
//        System.out.println(i);
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

    // Remove Element -> Easy
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}