import java.util.Scanner;

public class _1003A {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();

        int[] a=new int[110];


        for (int i=0;i<N;i++){
            int num=scanner.nextInt();
            a[num]++;

        }
        int count=0;
        for (int i=0;i<=100;i++){
            if (a[i]>count){
                count=a[i];
            }
        }

        System.out.println(count);



    }


}
