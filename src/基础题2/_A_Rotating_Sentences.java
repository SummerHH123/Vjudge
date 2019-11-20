package 基础题2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * list的使用
 */
public class _A_Rotating_Sentences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        char[][] ch=new char[110][110];
        List<String> ch=new ArrayList<>();
        int maxLen=0;

        while (sc.hasNext()){

            String s = sc.nextLine();

           ch.add(s);
            if (maxLen<s.length()){
                maxLen=s.length();
            }

        }

        int length=ch.size();
        for (int i=0;i<maxLen;i++){
            for (int j=length-1;j>=0;j--){
                if (i<ch.get(j).length()){
                    System.out.print(ch.get(j).substring(i,i+1));
                }else {
                    System.out.print(" ");

                }


            }
            System.out.println();
        }
    }
}
