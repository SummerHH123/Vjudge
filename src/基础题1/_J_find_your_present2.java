package 基础题1;

import java.io.*;

import java.util.Scanner;

/**
 * 异或运算
 */
public class _J_find_your_present2 {
    public static void main(String[] args) throws IOException {

        StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        while (st.nextToken() != StreamTokenizer.TT_EOF){
            int n=(int) st.nval;
            if (n==0){
                break;
            }
            int ans=0;
            for (int i=0;i<n;i++){
                st.nextToken();
                ans^=(int)st.nval;
            }
//            System.out.println(ans);
            out.println(ans);
            out.flush();

        }

    }
}
