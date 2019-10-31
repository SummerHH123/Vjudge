package div_3_b;

import java.util.Scanner;

public class _999B_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.next();

        for (int i=0;i<n;i++){
            if (n%(i+1)==0){
                String sub=str.substring(0,i+1);
                StringBuilder stb=new StringBuilder(sub);
                stb=stb.reverse();

                str=str.replaceFirst(sub,stb.toString());


            }
        }

        System.out.println(str);
    }


}
