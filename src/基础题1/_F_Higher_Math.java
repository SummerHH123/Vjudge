package 基础题1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 判断直角三角形
 */
public class _F_Higher_Math {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i =0; i<n;i++){
            int[] a=new int[3];
            for (int j=0;j<3;j++){
                a[j]=sc.nextInt();
            }
            Arrays.sort(a);
            if (a[0]*a[0]+a[1]*a[1]==a[2]*a[2]){
                System.out.println("Scenario #"+(i+1)+":");
                System.out.println("yes");
                System.out.println();
            }else {
                System.out.println("Scenario #"+(i+1)+":");
                System.out.println("no");
                System.out.println();
            }

        }
    }
}