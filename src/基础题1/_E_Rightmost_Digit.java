package 基础题1;

import java.util.Scanner;

/**
 * 以4为周期循环
 */
public class _E_Rightmost_Digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int num=sc.nextInt();
            int last=num%10;
            if (last==0||last==1||last==5||last==6){
                System.out.println(last);
            }else {
                int ans=(int)Math.pow(last,num%4+4)%10;
                System.out.println(ans);
            }


        }
    }
}
