import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _988A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] ch=new int[101];
        int[] index=new int[101];
        int[] in=new int[k];

        for (int i=0;i<n;i++){
            ch[i]=sc.nextInt();
        }

        int x=0;


        for (int i=0;i<n;i++){
            if (index[ch[i]]==0){
                index[ch[i]]++;
                if (x!=k){
                    in[x]=i;
                    x++;
                }

            }

        }
        if (x==k){
            System.out.println("YES");
            for (int i=0;i<k;i++){
                System.out.print(in[i]+1+" ");
            }
        }else {
            System.out.println("NO");
        }



    }
}
