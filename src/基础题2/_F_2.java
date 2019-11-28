package 基础题2;

import java.util.Scanner;
/**
 * 栈  括号匹配
 */
public class _F_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            while (s.contains("()") || s.contains("[]")) {
                s = s.replace("()", "");
                s = s.replace("[]", "");
            }
            if (s.length() != 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }

    }

}
