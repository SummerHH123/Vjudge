import java.util.ArrayList;
import java.util.Scanner;

public class _1095A {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<Character> ar=new ArrayList<>();
        String str=sc.nextLine();


        int count=0;

        for (int i=0;i<n;i++){
            count+=i;
            if (count<n){
                ar.add(str.charAt(count));
            }


        }
        for (Character character : ar) {
            System.out.print(character);
        }



    }
}
