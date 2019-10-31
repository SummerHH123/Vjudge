package 基础题1;

import java.util.Scanner;

public class _A_Elevator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int[] a=new int[110];
            a[0]=0;
            int time=0;
            int n=sc.nextInt();
            if (n==0){
                return ;
            }
            for (int i=1;i<=n;i++){
                a[i]=sc.nextInt();
            }
            for (int i=1;i<=n;i++){
                if (a[i]>a[i-1]){
                    time+=(a[i]-a[i-1])*6+5;
                }else {
                    time+=(a[i-1]-a[i])*4+5;
                }

            }
            System.out.println(time);


        }





    }

}
