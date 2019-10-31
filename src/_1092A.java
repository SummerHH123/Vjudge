import java.util.ArrayList;
import java.util.Scanner;

public class _1092A {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            ArrayList<Character> ar=new ArrayList<>();
            int n=sc.nextInt();
            int k=sc.nextInt();

            int a=n/k;
            int b=n%k;
            for (int o=0;o<a+b;o++)
                ar.add((char)97);
            for (int j=98;j<97+k;j++){
                for (int m=0;m<a;m++){
                    ar.add((char)j);
                }
            }

            for (Character character : ar) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
