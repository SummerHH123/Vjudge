package 基础题1;
/**
 * 互为质数
 * 辗转相除法
 */
import java.util.Scanner;

public class _C_hide_handkerchief {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a==-1&&b==-1)
                break;
            int t;

            while (a%b!=0){
                t=a%b;
                a=b;
                b=t;
            }
            if (b==1){
                System.out.println("YES");
            }else {
                System.out.println("POOR Haha");
            }


        }
    }
}
