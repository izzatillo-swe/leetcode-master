package leetcode.leetcodemaster.array;


import java.util.*;

/// Started at: 11/11/2025
public class ArrayProblems {

    public static void main(String[] args) {
        // Two Sum -> Easy
//        int[] ints = twoSum(new int[]{1, 7, 4, 2, 15}, 17);
//        System.out.println(Arrays.toString(ints));

        // Remove Elements
//        int i = removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
//        int i = removeElement(new int[]{3, 2, 2, 3}, 3);
//        System.out.println(i);

        // Single Number
//        int i = singleNumber(new int[]{4,1,2,1,2});
//        System.out.println(i);

        // Array Partition
//        int i = arrayPairSum(new int[]{6,2,6,5,1,2});
//        System.out.println(i);

        // Find Numbers with Even Number of Digits
//        int i = findNumbers(new int[]{555,901,482,1771});
//        System.out.println(i);

        // Smaller Numbers Than Current Number
//        int[] i = smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
//        System.out.println(Arrays.toString(i));

        // Remove Duplicates from Sorted Array
//        int i = removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
//        System.out.println(i);

        // Remove Duplicates from Sorted Array
//        List<List<Integer>> res = new ArrayList<>();
//        res.add(List.of(1));
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

    // Single Number -> Easy
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    // Array Partition
    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    // Find Numbers with Even Number of Digits
    public static int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int i : nums) {
            if (i == 0) {
                evenCount++;
            } else {
                boolean condition = true;
                while (i != 0) {
                    i /= 10;
                    condition = !condition;
                }
                if (condition) evenCount++;
            }
        }
        return evenCount;
    }

    // Smaller Numbers Than Current Number
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        for (int n : nums) {
            int c = 0;
            for (int i = 0; i < nums.length; i++){
                if (n > nums[i]) c++;
            }
            arr[index++] = c;
        }
        return arr;
    }

    // Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] && nums[i] > nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}