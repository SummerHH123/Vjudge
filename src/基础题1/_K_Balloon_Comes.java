package 基础题1;


import java.util.Scanner;

public class _K_Balloon_Comes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=0;i<n;i++){
            String s=sc.next();
            int s1=sc.nextInt();
            int s2=sc.nextInt();

            if (s.charAt(0)=='+'){
                System.out.println(s1+s2);
            }
            else if (s.charAt(0)=='-'){
                System.out.println(s1-s2);
            }
            else if (s.charAt(0)=='*'){
                System.out.println(s1*s2);
            }
            else if (s.charAt(0)=='/'){
                if(s1%s2==0){
                    System.out.println(s1/s2);
                }else {
                    System.out.printf("%.2f\n",((float)s1)/s2);
                }
            }
        }
    }
}


