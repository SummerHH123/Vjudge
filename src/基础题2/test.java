package 基础题2;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("输入：");
//        int num = in.nextInt();
//        String str = in.nextLine();
//        String s=in.nextLine();
//        System.out.println("输出：");
//        System.out.println(num);
//        System.out.println(str);
//        System.out.println(s);
        int step=in.nextInt();
        dfs(step);

    }

    private static void dfs(int step) {
        if (step==1){
            return;
        }
        System.out.println("步长："+step);

        dfs(step-1);
        System.out.println("变化："+step);
    }
}
