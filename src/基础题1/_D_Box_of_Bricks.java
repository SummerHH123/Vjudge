package 基础题1;

/**
 * 平均高度
 */

import java.util.Scanner;

public class _D_Box_of_Bricks {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] a=new int[52];
        int flag=0;
        while (scanner.hasNext()){
            int sum=0;
            int n = scanner.nextInt();
            if (n==0){
                break;
            }
            if (flag==1){
                System.out.println();
            }

            for (int i=0;i<n;i++){
                a[i]= scanner.nextInt();
            }
            for (int i=0;i<n;i++){
                sum+=a[i];
            }
            int avg=sum/n;

            int count=0;
            for (int i=0;i<n;i++){
                if (a[i]>avg){
                    count+=a[i]-avg;
                }

            }
            flag=1;
            System.out.println(count);


        }



    }
}
