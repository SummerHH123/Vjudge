package 基础题2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_input {
    public static void main(String[] args) throws IOException {
        //BufferedReader对象只将回车看作输入结束，得到的字符串
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        StringTokenizer st=new StringTokenizer(s);
        String s1 = st.nextToken();

        System.out.println(s1);


    }


}
