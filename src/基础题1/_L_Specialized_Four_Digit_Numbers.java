package 基础题1;

import java.math.BigInteger;

/**
 *  进制转换
 */
public class _L_Specialized_Four_Digit_Numbers {

    public static void main(String[] args) {

        for (int i=2992;i<10000;i++){
            int ten=i/1000+i/100%10+i/10%10+i%10;
            if (ten==f(i,12)&&ten==f(i,16)){
                System.out.println(i);
            }




        }
    }


    public static int f(int x,int h){
        int sub=0;
        int a=0;
        int b=0;
        while (x!=0){
            a=x%h;
            b=x/h;
            x=b;
            sub+=a;
        }
        return sub;
    }
}
