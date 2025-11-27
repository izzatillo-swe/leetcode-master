package leetcode.leetcodemaster.string;

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
        String s = interpret("G()()()()(al)");
        System.out.println(s);
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
}