package div_3_b;

import java.util.ArrayList;
import java.util.Scanner;

public class _978B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();


        int count=0;


        int temp=0;
        for (int i=0;i<n;i++){
            char c = str.charAt(i);
            if (c=='x'){
                temp++;
            }else {
                temp=0;
            }
            if (temp==3){
                temp--;
                count++;
            }
        }


        System.out.println(count);



    }
}
