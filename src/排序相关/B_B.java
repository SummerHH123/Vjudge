package 排序相关;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

public class B_B {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF){
            int n=(int)st.nval;
            Student[] students=new Student[n];
            if (n==0){
                return;
            }
            st.nextToken();
            int M=(int)st.nval;
            st.nextToken();
            int G=(int)st.nval;
            List<Student> li=new ArrayList<>();

            int[] a=new int[M];
            for (int i=0;i<M;i++){
                st.nextToken();
                a[i]=(int)st.nval;
            }
            for (int i=0;i<n;i++){
                st.nextToken();
                students[i]=new Student();
                students[i].number=st.sval;

                st.nextToken();
                int ac=(int)st.nval;
                int[] ac_number=new int[ac];
                for (int j=0;j<ac;j++){
                    st.nextToken();
                    ac_number[j]=(int)st.nval;
                }
                int sum=0;
                for (int j=0;j<ac;j++){
                    sum+=a[ac_number[j]-1];
                }
                students[i].score=sum;
                li.add(students[i]);

            }


            Collections.sort(li, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if (o1.score>o2.score){
                        return -1;
                    }else if (o1.score==o2.score){
                       return o1.number.compareTo(o2.number);
                    }
                    return 1;
                }
            });
            int count=0;
            for (Student student : li) {
                if (student.score>=G)
                    count++;
            }
            System.out.println(count);
            for (Student student : li) {
                if (student.score>=G)
                    System.out.println(student.number+" "+student.score);

            }




        }

    }
}

class Student{
    String number;
    int score;

}
