import java.util.Scanner;

public class _1141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a==b){
            System.out.println(0);
        }else if (b%a!=0){
            System.out.println(-1);
        }else {
            int count=0;
            int sub=b/a;
            while (sub%2==0){
                count++;
                sub/=2;
            }
            while (sub%3==0){
                count++;
                sub/=3;
            }
            if (sub!=1){
                System.out.println(-1);
            }else {
                System.out.println(count);
            }



        }

    }
}
