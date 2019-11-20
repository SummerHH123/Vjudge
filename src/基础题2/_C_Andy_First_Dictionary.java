package 基础题2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * treeset  可以自动排序的set集合
 * Character.isLetter 判断是否是字母
 */
public class _C_Andy_First_Dictionary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> st=new TreeSet<>();


        while (sc.hasNext()){

            String s=sc.next().toLowerCase();
            if (s.equals("exit")){
                sc.close();
                break;

            }
            String e="";

            for (int i=0;i<s.length();i++){
                if (Character.isLetter(s.charAt(i))){

                    e+=s.charAt(i);

                }else {
                    if (!e.equals("")){
                        st.add(e);
                        e="";
                    }else {
                        continue;
                    }
                }

            }
            if (!e.equals("")){
                st.add(e);
            }


        }
        for (String s : st) {
            System.out.println(s);
        }
    }
}
