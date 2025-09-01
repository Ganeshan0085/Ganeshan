import java.util.Scanner;

/*
   Name: Ganeshan
   Roll No: 2117240070085
   Program: Manual implementation of substring and replace operations
*/

public class ManualStringOps {

    // Manual substring
    static String manualSubstring(String s, int start, int len) {
        if (start < 0 || start >= s.length() || len <= 0) return "";
        int end = Math.min(start + len, s.length());
        char[] sub = new char[end - start];
        for (int i = 0; i < sub.length; i++) {
            sub[i] = s.charAt(start + i);
        }
        return new String(sub);
    }

    // Manual replace
    static String manualReplace(String s, String target, String repl) {
        if (target.length() == 0) return s;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            boolean match = true;
            if (i + target.length() <= s.length()) {
                for (int j = 0; j < target.length(); j++) {
                    if (s.charAt(i + j) != target.charAt(j)) {
                        match = false; break;
                    }
                }
            } else match = false;

            if (match) {
                out.append(repl);
                i += target.length();
            } else {
                out.append(s.charAt(i));
                i++;
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: Ganeshan");
        System.out.println("Roll No: 2117240070085");
        System.out.println("---- Manual String Operations ----");

        // Input string
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Substring demo
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        System.out.println("Substring: " + manualSubstring(input, start, len));

        sc.nextLine(); // consume newline

        // Replace demo
        System.out.print("Enter target substring: ");
        String target = sc.nextLine();
        System.out.print("Enter replacement substring: ");
        String repl = sc.nextLine();
        System.out.println("Replaced string: " + manualReplace(input, target, repl));

        sc.close();
    }
}
