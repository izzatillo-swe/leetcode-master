package leetcode.leetcodemaster.leetcode_problems.array;


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

        // Pascal's Triangle
//        List<List<Integer>> lists = generate(6);
//        System.out.println(lists);

        // Height Checker
//        int i = heightChecker(new int[]{1,1,4,2,1,3});
//        System.out.println(i);

        // Running Sum of 1d Array
//        int[] i = runningSum(new int[]{1, 2, 3, 4, 5});
//        System.out.println(Arrays.toString(i));

        // Find Pivot index
//        int i = pivotIndex(new int[]{-1,-1,0,1,1,0});
//        System.out.println(i);

        // Move Zeroes
//        int[] ints = {0, 1, 0, 3, 12};
//        moveZeroes(ints);
//        System.out.println(Arrays.toString(ints));

        // Reverse String
//        char[] chars = {'h', 'e', 'l', 'l', 'o'};
//        reverseString(chars);
//        System.out.println(Arrays.toString(chars));

        // Maximum Average Subarray |
        double maxAverage = findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        System.out.println(maxAverage);
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

    // Pascal's Triangle
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(List.of(1));
        if (numRows == 1) return mainList;
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> last = mainList.get(i - 1);
            for (int j = 0; j < i - 1; j++) {
                list.add(last.get(j) + last.get(j+1));
            }
            list.add(1);
            mainList.add(list);
        }
        return mainList;
    }

    // Height Checker
    public static int heightChecker(int[] heights) {
        int result = 0;
        int[] expected = new int[101];
        for (int height : heights) {
            expected[height]++;
        }
        int k = 0;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != 0) {
                while (expected[i] > 0) {
                    if(i != heights[k]){
                        result++;
                    }
                    expected[i]--;
                    k++;
                }
            }
        }
        return result;
    }

    // Running Sum of 1d Array
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        return prefix;
    }

    // Find Pivot index
    public static int pivotIndex(int[] nums) {
        int l = nums.length;
        int[] prefix = buildPrefix(nums, l);

        if (prefix[l-1] - prefix[0] == 0) return 0;

        for (int i = 1; i < l; i++) {
            if (prefix[i-1] == (prefix[l-1] - prefix[i])) {
                return i;
            }
        }

        return -1;
    }

    public static int[] buildPrefix(int[] nums, int l) {
        int[] prefix = new int[l];
        prefix[0] = nums[0];

        for (int i = 1; i < l; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        return prefix;
    }

    // Move Zeroes
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    // Reverse String
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char t = s[left];
            s[left] = s[right];
            s[right] = t;
            left++;
            right--;
        }
    }

    // Maximum Average Subarray |
    public static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxS = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            if (windowSum > maxS) maxS = windowSum;
        }

        return (double) maxS / k;
    }
}