import java.util.Scanner;

public class _1108A {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=0;i<n;i++){
            int l1=sc.nextInt();
            int r1=sc.nextInt();
            int l2=sc.nextInt();
            int r2=sc.nextInt();
            if (r1>l2){
                System.out.println(r1+" "+l2);
            }else if (r1<l2){
                System.out.println(l1+" "+l2);
            }else if (r1==l2){
                System.out.println(l1+" "+l2);
            }
        }

    }
}
