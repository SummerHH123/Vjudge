import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _978A {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[1001];
        int[] index=new int[1001];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int in=0;
        for (int i=n-1;i>=0;i--){
            if (b[a[i]]==0){
                b[a[i]]++;
                index[in++]=a[i];
            }
        }
        int count=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for (int i = index.length-1; i>=0; i--) {
            if (index[i]!=0){
                count++;
                ar.add(index[i]);
            }


        }
        System.out.println(count);
        for (Integer integer : ar) {
            System.out.print(integer+" ");
        }

    }
}
