package 基础题1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String sentence = "\u03C0\uD835\uDD6B";
       int lengthU = sentence.length();
        int lengthP = sentence.codePointCount(0, lengthU);
        int[] a=sentence.codePoints().toArray();
        String s=new String(a,0,a.length);
        for (int i : a) {
            System.out.println(i);
        }



        System.out.println(s.codePointAt(1));
        System.out.println(a.length);
        System.out.println(s);
        System.out.println(a);
        System.out.println(lengthU);        // 4个code units
        System.out.println(lengthP);        // 3个code points
        System.out.println(sentence);

        int i = sentence.codePointAt(1);    // i=2 true  i=0,1,3 false  i=4 out of bound
        boolean b = Character.isSupplementaryCodePoint(i);
        System.out.println(b);


    }
}
