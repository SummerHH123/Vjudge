import java.util.Scanner;

public class _1015A {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] a=new int[M+1];
        for (int i = 0; i < N; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            for (int j=x;j<=y;j++){
                a[j]++;
            }
        }
        int count_num=0;
        for (int i = 1; i < a.length; i++) {
            if (a[i]==0){
                count_num++;
            }
        }
        if (count_num==0){
            System.out.println(0);
        }else {
            System.out.println(count_num);
            for (int i=1;i<=M;i++) {
                if (a[i]==0){
                    System.out.print(i+" ");
                }

            }

        }
    }
}
