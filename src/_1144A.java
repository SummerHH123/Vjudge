import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1144A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String str=sc.next();
            int length = str.length();
            char[] chars = str.toCharArray();

            Arrays.sort(chars);
            int count=0;
            for (int j=0;j<length-1;j++){
                if (chars[j]-chars[j+1]!=-1){
                    break;
                }
                count++;
            }
            if (count==length-1){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }


        }
    }
}
