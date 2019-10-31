import java.util.Scanner;

public class _1102A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=N*(1+N)/2;
        if (sum%2==0){
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }
}
