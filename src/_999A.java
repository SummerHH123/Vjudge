import java.util.ArrayList;
import java.util.Scanner;

public class _999A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();

        for (int i=0;i<n;i++){
            ar.add(sc.nextInt());
        }


        int count=0;
        int indexx=0;
        int indexy=0;
        while (true){
            int x=0;
            if (ar.size()>0){
                if (ar.get(x)<=k){
                    count++;
                    ar.remove(x);


                }else {
                    indexx=1;
                }

            }else {
                indexx=1;
            }

            int y=ar.size()-1;
            if (ar.size()>1){
                if (ar.get(y)<=k){
                    count++;
                    ar.remove(y);
                }else {
                    indexy=1;
                }

            }else {
                indexy=1;
            }


            if (indexx==1&&indexy==1){
                break;
            }
        }
        System.out.println(count);


    }
}
