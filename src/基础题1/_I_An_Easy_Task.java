package 基础题1;

import java.util.Scanner;

/**
 * 判断闰年
 */
public class _I_An_Easy_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int y=sc.nextInt();
            int num=sc.nextInt();
            int fl=0;
            for (int j=y;;j++){
                if (j%4==0&&j%100!=0){
                    fl++;
                    if (fl==num){
                        System.out.println(j);
                        break;
                    }


                }else if (j%400==0){
                    fl++;
                    if (fl==num){
                        System.out.println(j);
                        break;
                    }

                }
            }
        }

    }
}
