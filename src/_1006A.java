import java.util.Scanner;

public class _1006A {

    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int N = scc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (a[i] % 2 == 0) {
                a[i] = a[i]-1;
            } else {
                a[i] = a[i] ;
            }
        }

        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
