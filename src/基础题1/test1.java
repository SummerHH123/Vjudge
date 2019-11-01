package 基础题1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t=cin.nextInt();
        while(t-->0)
        {
            char c=cin.next().charAt(0);
            int a=cin.nextInt();
            int b=cin.nextInt();
            if(c=='+')System.out.print(a+b);
            else if(c=='-')System.out.print(a-b);
            else if(c=='*')System.out.print(a*b);
            else if(c=='/')
            {
                if(a%b==0)
                    System.out.print(a/b);
                else
                    System.out.printf("%.2f",(float)a/b);
            }
            System.out.println();
        }


    }
}
