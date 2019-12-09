package 排序相关;

import java.util.*;

public class A_A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n==-1){
                return;
            }
            List<student> li=new ArrayList<>();
            student[] st=new student[n];
            int[] a=new int[6];//解题目数量
            for (int i=0;i<n;i++){
                int number=sc.nextInt();
                String s=sc.next();
                long time=Long.valueOf(s.replaceAll(":",""));
                st[i]=new student();
                st[i].ser=i;
                st[i].number=number;
                st[i].time=time;
                if (number==5){
                    st[i].th=100;
                }

                li.add(st[i]);
            }
            Collections.sort(li, new Comparator<student>() {
                @Override
                public int compare(student o1, student o2) {
                    if ((o1.number>o2.number)){
                        return -1;
                    }else if (o1.number==o2.number){
                        if (o1.time>o2.time){
                            return 1;
                        }else {
                            return -1;
                        }
                    }
                        return 1;
                }
            });
            int count=1;
            for (student student : li) {
                student.rank=++a[student.number];
            }
            for (student student : li) {
                if (student.number==5){
                    student.th=100;
                }
                if (student.number==4){
                    if (student.rank<=a[student.number]/2){
                        student.th=95;
                    }else {
                        student.th=90;
                    }
                }
                if (student.number==3){
                    if (student.rank<=a[student.number]/2){
                        student.th=85;
                    }else {
                        student.th=80;
                    }
                }
                if (student.number==2){
                    if (student.rank<=a[student.number]/2){
                        student.th=75;
                    }else {
                        student.th=70;
                    }
                }
                if (student.number==1){
                    if (student.rank<=a[student.number]/2){
                        student.th=65;
                    }else {
                        student.th=60;
                    }
                }
                if (student.number==0){
                    student.th=50;
                }
            }
            Collections.sort(li, new Comparator<student>() {
                @Override
                public int compare(student o1, student o2) {
                    if (o1.ser>o2.ser){
                        return 1;
                    }
                    return -1;
                }
            });
            for (student student : li) {
                System.out.println(student.th);
            }
            System.out.println();
        }
    }
}

class student {
    int ser;//学生序号
    int number;//题数
    long time;//时间
    int th;//得分
    int rank;//在这个题目数的排名

}
