package 基础题1;

import java.io.*;

public class test2 {

    public static void main(String[] args) throws IOException {
        StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        st.nextToken();
        int n=(int)st.nval;

        out.println(n);

//        while (st.nextToken() != StreamTokenizer.TT_EOF){
//            int n=(int) st.nval;
//            st.nextToken();
//            int s=(int)st.nval;
//
////            System.out.println(ans);
//            out.println(n);
//            out.println(s);
//            out.flush();
//
//        }
    }
}
