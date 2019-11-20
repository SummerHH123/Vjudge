package 基础题2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * set集合
 */
public class _D_A_B_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        while (sc.hasNextInt()){
            Set<Integer> st=new TreeSet<>();
            int m=sc.nextInt();
            int n=sc.nextInt();
            while (m>0){
                st.add(sc.nextInt());
                m--;
            }
            while (n>0){
                st.add(sc.nextInt());
                n--;
            }
            int count=1;
            for (Integer integer : st) {
                if (count!=st.size()){
                    System.out.print(integer+" ");
                }else {
                    System.out.print(integer);
                }


                count++;
            }
            System.out.println();
        }
    }
}
