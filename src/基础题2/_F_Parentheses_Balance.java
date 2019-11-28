package 基础题2;

import java.util.Scanner;
import java.util.Stack;

/**
 * 栈  括号匹配
 */
public class _F_Parentheses_Balance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Stack<Character> st = new Stack<>();

            String next = sc.nextLine();

            int flag = 0;
            for (int j = 0; j < next.length(); j++) {
                if (next.charAt(j) == '(' || next.charAt(j) == '[') {
                    st.push(next.charAt(j));
                } else if (st.size() > 0) {
                    if ((next.charAt(j) == ')' && st.peek() == '(') || (next.charAt(j) == ']' && st.peek() == '[')) {
                        if (st.size() > 0) {
                            st.pop();
                        }
                    }
                } else {
                    flag = 1;
                    break;
                }

            }


            if (st.size() == 0 && flag == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


        }

    }
}
