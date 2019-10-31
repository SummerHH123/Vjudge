package div_3_b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _977B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();

        int[][] arr=new int[26][26];

        for (int i=0;i<str.length()-1;i++){
            arr[str.charAt(i)-'A'][str.charAt(i+1)-'A']++;
        }

        int x=0,y=0;
        int max=0;
        for (int i=0;i<26;i++){
            for (int j=0;j<26;j++){
                if (arr[x][y]<arr[i][j]){
                    x=i;
                    y=j;
                }
            }
        }

        System.out.println(((char) ('A'+x))+""+((char)('A'+y)));




    }
}
