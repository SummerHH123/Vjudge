import java.util.Scanner;

public class _1118A {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            long q=sc.nextLong();
            int a=sc.nextInt();
            int b=sc.nextInt();

            long count=0;

            if (a*2<=b){
                count=a*q;
            }else {
                long c=q%2;
                count=c*a+b*(q/2);
            }
            System.out.println(count);


        }
    }
}
