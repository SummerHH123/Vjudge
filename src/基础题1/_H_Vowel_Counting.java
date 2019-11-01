package 基础题1;

import java.util.Scanner;

/**
 * 元音字母大写
 * 其他小写
 */

public class _H_Vowel_Counting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=0;i<n;i++){
            String s=sc.next();



            char[] chars = s.toCharArray();

            for (int j=0;j<s.length();j++){
                if (chars[j]=='a'||chars[j]=='e'||chars[j]=='i'||chars[j]=='o'||chars[j]=='u'){
                    chars[j]-=32;
                }else if (chars[j]=='A'||chars[j]=='E'||chars[j]=='I'||chars[j]=='O'||chars[j]=='U'){
                    continue;
                }else  if (chars[j]>='A'&&chars[j]<='Z'){
                    chars[j]+=32;
                }
            }
            String s1 = String.valueOf(chars);
            System.out.println(s1);
        }

    }
}
