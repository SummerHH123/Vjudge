package 基础题1;

import java.util.Scanner;

/**
 * 异或运算
 */
public class _J_find_your_present2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            if (n==0){
                break;
            }
            int ans=0;
            for (int i=0;i<n;i++){
                ans^=sc.nextInt();
            }
            System.out.println(ans);

        }
    }


}
