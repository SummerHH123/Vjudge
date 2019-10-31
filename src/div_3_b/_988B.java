package div_3_b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


//return 结束整个方法的运行
public class _988B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();

        }

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() == o2.length()) {
                    return 0;
                }
                return 1;
            }
        };
        Arrays.sort(str,c);


        for (int i=1;i<n;i++){
            if (str[i].indexOf(str[i-1])==-1){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        for (String s : str) {
            System.out.println(s);
        }


    }


}

