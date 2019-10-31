import java.util.Arrays;
import java.util.Scanner;

public class _HDU4004 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n + 3];
        a[0] = 0;
        a[n + 1] = l;
        for (int i = 1; i < n + 1; i++) {

            a[i] = sc.nextInt();
        }


        Arrays.sort(a);

        int left = 0;
        int right = l;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(mid, m, l, n, a)) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }

        }
        System.out.println(left);

    }

    public static boolean check(int mid, int m, int l, int n, int[] a) {

        if (mid * m < l)
            return true;

        int x = 1;
        int y = 0;
        int step = 0;

        while (x <= n + 1) {
            step++;
            if (a[x] - a[y] > mid)
                return true;

            while ((a[x] - a[y] <= mid) && (x <= n + 1)) {
                x++;
            }
            y = x - 1;

            if (step > m)
                return true;

        }

        return false;


    }


}

