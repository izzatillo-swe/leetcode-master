package leetcode.leetcodemaster.leetcode_problems.string;

/// Started at: 11/11/2025
public class StringProblems {

    public static void main(String[] args) {

        // To Lower Case
//        String s = toLowerCase("Hello World");
//        System.out.println(s);

        // Defanging an IP Address
//        String s = defangIPaddr("255.100.50.0");
//        System.out.println(s);

        // Goal Parser Interpretation
//        String s = interpret("G()()()()(al)");
//        System.out.println(s);

        // Valid Palindrome
//        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
//        System.out.println(palindrome);

        // Reverse Words in a String |||
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    // To Lower Case
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    // Defanging an IP Address
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    // Goal Parser Interpretation
    public static String interpret(String command) {
        command = command.replace("()", "o");
        return command.replace("(al)", "al");
    }

    // Valid Palindrome
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;

        while (i<j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }
            if(left != right) return false;
            i++;
            j--;
        }

        return true;
    }

    // Reverse Words in a String |||
    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }
        return new String(arr);
    }

    private static void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}