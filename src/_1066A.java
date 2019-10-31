import java.util.Scanner;

public class _1066A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int L=sc.nextInt();
            int v=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();

            int a=L/v;
            int[] b=new int[a];
            for (int j=0;j<a;j++){
                b[j]=(j+1)*v;
            }

            int length=r-l+1;
            int[] c=new int[length];
            for (int x=0;x<c.length;x++){
                c[x]=l++;

            }


            int count=0;
            for (int m=0;m<length;m++){
                for (int n=0;n<b.length;n++){
                    if (b[n]==c[m]){
                        count++;
                    }
                }
            }

            int out=a-count;
            System.out.println(out);



        }
    }
}
