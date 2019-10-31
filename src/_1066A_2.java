import java.util.Scanner;

public class _1066A_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int L = sc.nextInt();
            int v = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();


            int num=L/v;
            int sub=r/v-l/v;
            if (l%v==0){
                sub++;
            }
            System.out.println(num-sub);




        }
    }
}

