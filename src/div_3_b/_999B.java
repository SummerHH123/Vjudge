package div_3_b;

import java.util.Scanner;

public class _999B {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String str=sc.next();

        char[] chars = str.toCharArray();

        String revr="";

        int sub=1;
        String revr_end="";

        while (true){
            String temp="";
            if (n%sub==0){
                for (int i=sub-1;i>=0;i--){
                    revr=revr+chars[i];
                }



                revr_end=revr;
                char[] te=new char[revr_end.length()];
                revr="";
                te=revr_end.toCharArray();
                for (int i=0;i<te.length;i++){
                    chars[i]=te[i];
                }






            }


            if (sub==n){
                break;
            }
            sub++;

        }
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }
}
