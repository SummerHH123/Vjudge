package 基础题2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _H_Who_in_the_Middle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            int n=sc.nextInt();
            if (n==0){
                break;
            }

            List<Integer> li=new ArrayList<>();
            for (int i=0;i<n;i++){
                li.add(sc.nextInt());
            }
            Collections.sort(li);
            int integer = li.get(li.size() / 2);
            System.out.println(integer);
        }
    }
}
