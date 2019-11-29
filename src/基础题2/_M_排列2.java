package 基础题2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * DFS
 */
public class _M_排列2 {
    static boolean[] vis=new boolean[4];
    static int[] a=new int[5];


    static int[] b=new int[4];
    static  int last;
    static int flag;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean f=false;


        while (sc.hasNext()){
            for (int i=0;i<4;i++){
                a[i]=sc.nextInt();
            }
            if (a[0]==0&&a[1]==0&&a[2]==0&&a[3]==0){
                return;
            }

            Arrays.sort(a,0,4);
            Arrays.fill(vis,false);

            int step=0;
            flag=0;


            if (f){
                System.out.println();
            }
            f=true;
            dfs(step);
            System.out.println();

        }

    }

    private static void dfs(int step) {

        if (step==4){

            if (b[0]==0){
                return;
            }
            if(b[0]==last&&flag!=0){
                System.out.print(" ");
            }
            if (b[0]!=last&&flag!=0){
                System.out.println();
            }

            for (int i : b) {
                System.out.print(i);
            }
            flag++;
            last=b[0];


        }

        for (int i=0;i<4;i++){
            if (!vis[i]){
                vis[i]=true;
                b[step]=a[i];
//                System.out.println("i:"+i);
                dfs(step+1);
                vis[i]=false;
                while (a[i]==a[i+1]){//去重
                    i++;
                }

            }
        }

    }
}
