package 基础题2;

import java.util.*;

/**
 * 栈和数组
 * 两个栈用来存储每次的最大值和最小值
 * 数组用来存储 符号
 */
public class _H_Camel_trading {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//        int max=0;
//        int min=0;

        for (int i=0;i<n;i++){
            Stack<Long> st_max=new Stack<>();
            Stack<Long> st_min=new Stack<>();
            String s=sc.next();

            List<Character> li=new ArrayList<>();

            for (int h=0;h<s.length();h++){
                if (s.charAt(h)=='+'||s.charAt(h)=='*'){
                   li.add(s.charAt(h));
                }
            }

            String[] split = s.split("[+*]");



            long temp=Integer.parseInt(split[0]);
            st_max.push(temp);
            st_min.push(temp);

            for (int j=0;j<li.size();j++){

                if (li.get(j)=='+'){
                    long temp1=Integer.parseInt(split[j+1]);
                    long sum = st_max.pop()+temp1;



                    st_max.push(sum);

                    st_min.push(temp1);

                }else if (li.get(j)=='*'){
                    long temp2=Integer.parseInt(split[j+1]);

                    long cheng = st_min.pop()*temp2;

                    st_min.push(cheng);

                    st_max.push(temp2);


                }

            }
            long result1=1;
            long result2=0;



            while (!st_max.isEmpty()){
                result1*=st_max.pop();
            }
            while (!st_min.isEmpty()){
                result2+=st_min.pop();
            }


            System.out.println("The maximum and minimum are "+ result1 +" and "+result2+".");



        }
    }
}
