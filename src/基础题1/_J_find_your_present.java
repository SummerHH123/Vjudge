package 基础题1;

import java.util.Arrays;
import java.util.Scanner;

public class _J_find_your_present {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int flag_re=0;
            int flag_ls=0;
            if (a[0]!=a[1]){
                System.out.println(a[0]);

            }else if (a[n-1]!=a[n-2]){
                System.out.println(a[n-1]);

            }else {
                for (int i=1;i<n-1;i++){
                    if (a[i-1]!=a[i]&&a[i]!=a[i+1]){
                        System.out.println(a[i]);
                        break;
                    }
                }
            }

        }
    }
}
