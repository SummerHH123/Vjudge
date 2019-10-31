import java.util.Scanner;

public class _1133A {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String[] split1 = a.split(":");
        String[] split2=b.split(":");



        int h=Integer.valueOf(split2[0])-Integer.valueOf(split1[0]);
        int m=Integer.valueOf(split2[1])-Integer.valueOf(split1[1]);



        int count=(h*60+m)/2;

        int h_end=count/60;
        int m_end=count%60;


        int h_sum=Integer.valueOf(split1[0])+h_end;
        int m_sum=Integer.valueOf(split1[1])+m_end;

        if (m_sum>=60){
            h_sum+=1;
            m_sum=m_sum-60;
        }



        String h_str="";
        String m_str="";



        if (h_sum<10&&m_sum>=10){
            h_str='0'+String.valueOf(h_sum);
            m_str=String.valueOf(m_sum);

        }else if(m_sum<10&&h_sum>=10){
             m_str='0'+String.valueOf(m_sum);
            h_str=String.valueOf(h_sum);
        }else if (h_sum<10&&m_sum<10){
            h_str='0'+String.valueOf(h_sum);
            m_str='0'+String.valueOf(m_sum);

        }else {
            h_str=String.valueOf(h_sum);
            m_str=String.valueOf(m_sum);
        }


        System.out.println(h_str+":"+m_str);



    }
}
