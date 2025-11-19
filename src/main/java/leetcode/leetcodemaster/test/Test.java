package leetcode.leetcodemaster.test;

public class Test {

    public static void main(String[] args) {
//        System.out.println(ts(3)); // 1, 3, 5, 7, 9

//        int[] ncs = ncs(new int[]{1, 2, 0, 0, 3, 4, 0, 5, 6});
//        System.out.println(Arrays.toString(ncs));

        System.out.println(findDigits(0));
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

}