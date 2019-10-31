package 基础题1;

import java.util.Scanner;

/**
 * asc码转换
 */
public class _G_ASCII {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[1010];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i =0;i<n;i++) {
            System.out.println(a[i]);
        }

    }
}
