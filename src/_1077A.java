import java.util.Scanner;

public class _1077A {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=0;i<N;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int k=sc.nextInt();
            long point=0;

            long c=k/2;
            long d=k%2;

            point=a*c-b*c+a*d;
            System.out.println(point);





        }
    }
}
