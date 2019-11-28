package 基础题2;

import java.util.*;

public class _I_Concatenation_of_Languages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;

        for (int i = 0; i < n; i++) {
            Set<String> str = new HashSet<>();
            List<String> li = new ArrayList<>();
            List<String> li2 = new ArrayList<>();
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();

            for (int k1 = 0; k1 < x; k1++) {
                li.add(sc.nextLine());
//                sc.nextLine();

            }
            for (int k2 = 0; k2 < y; k2++) {
                li2.add(sc.nextLine());
//                sc.nextLine();
            }
            for (int m = 0; m < x; m++) {
                for (int k = 0; k < y; k++) {
                    String s = li.get(m) + li2.get(k);
                    str.add(s);

                }
            }
            System.out.print("Case "+count++ +": "+str.size());
            System.out.println();

        }

    }
}
