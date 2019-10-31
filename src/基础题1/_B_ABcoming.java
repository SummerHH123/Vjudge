package 基础题1;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 16进制输出10进制
 */
public class _B_ABcoming {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String a;
            a=scanner.next();
            String b;
            b=scanner.next();
            String res_a=new BigInteger(a,16).toString(10);
            String res_b=new BigInteger(b,16).toString(10);

            BigInteger re_a=new BigInteger(res_a);
            BigInteger re_b=new BigInteger(res_b);

            BigInteger add = re_a.add(re_b);
            System.out.println(add);


        }

    }

}
