import java.util.Scanner;

public class _1029A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int L=sc.nextInt();
        String str=sc.next();
        char[] chars = str.toCharArray();

        String s1="";
        String s2="";
        int sub=0;
        for (int i=0;i<N-1;i++){

            s1+=chars[i];
            s2=chars[N-1-i]+s2;
            if (s1.equals(s2)){
                sub=i+1;

            }
//            System.out.println("s1"+s1);
//            System.out.println("s2"+s2);

        }
//        System.out.println(sub);
        System.out.print(str.toString());
        for (int i=1;i<L;i++){
            System.out.print(str.substring(sub));
        }


    }
}
