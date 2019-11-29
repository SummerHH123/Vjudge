package 基础题2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 比较时间大小
 * 用replaceall取代所有的"："比较大小
 *
 */
public class _L_开门人和关门人 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){

            int number = sc.nextInt();
            String id;
            String ftime;
            String ltime;


            String fid=null;
            String lid=null;

            long tempftime=Long.MAX_VALUE;
            long templtime=0;

            for (int j=0;j<number;j++){
                id=sc.next();
                ftime=sc.next();
                ltime=sc.next();
                long lftime = Long.valueOf(ftime.replaceAll(":", ""));
                long lltime = Long.valueOf(ltime.replaceAll(":", ""));
                if (lftime<tempftime){
                    tempftime=lftime;
                    fid=id;
                }
                if (lltime>templtime){
                    templtime=lltime;
                    lid=id;
                }
            }
            System.out.println(fid+" "+lid);


    }
}

}
