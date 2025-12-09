package leetcode.leetcodemaster.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        System.out.println(ts(3)); // 1, 3, 5, 7, 9

//        int[] ncs = ncs(new int[]{1, 2, 0, 0, 3, 4, 0, 5, 6});
//        System.out.println(Arrays.toString(ncs));

//        System.out.println(findDigits(0));

//        List<List<Integer>> lists = generate(5);
//        System.out.println(lists);

        int[] i = sortArray(new int[]{5, 2, 1, 3, 6, 2, 4, 1, 1, 3});
        System.out.println(Arrays.toString(i));
    }

    public static int ts(int n) {
        if (n % 2 == 0) return (n / 2);
        else return n / 2 + 1;
    }

    public static int[] ncs(int[] arr) {
        int[] res = new int[arr.length];
        int index = 0;
        for (int i : arr) {
            if (i != 0) res[index++] = i;
        }
        return res;
    }

    public static int findDigits(int num) {
        int d = 0;
        while (num != 0) {
            num /= 10;
            d++;
        }
        return d;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(List.of(1));
        if (numRows == 1) return mainList;
        int count = 2;
        for (int i = 1; i < numRows; i++) {  // numsRows = 5
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j < count + 1; j++) {
                list.add(j);
            }
            mainList.add(list);
            count++;
        }
        return mainList;
    }

    public static int[] sortArray(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
            sorted[i] = min;
        }
        return sorted;
    }

    // 1051 leetcode
    // 268 leetcode buniyam ishlash kerak tushunvolib.
    // https://leetcode.com/problems/missing-number/?envType=problem-list-v2&envId=array
    public static int heightChecker(int[] heights) {
        int result = 0;
        int[] expected = new int[101];
        for (int height : heights) {
            expected[height]++;
        }
        return result;
        //TODO: tepadagi logikani o'rganib chiqib masalani ishlash kerak
        //debug qilib tekshirish kerak ishlagandan keyin
    }
}