package 基础题2;

import java.util.*;

/**
 * 类中属性排序
 */
public class _E_Excel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNext()) {

            List<Student> li = new ArrayList<>();
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n + m == 0) {
                break;
            }
            sc.nextLine();


            for (int i = 0; i < n; i++) {
                Student st = new Student();
                st.no = sc.nextInt();
                st.name = sc.next();
                st.score = sc.nextInt();
                li.add(st);

            }

            Collections.sort(li, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if (m == 1) {
                        return o1.no - o2.no;

                    }
                    if (m == 2) {
                        if (o2.name.compareTo(o1.name) == 0) {
                            return o1.no - o2.no;
                        } else {
                            return o1.name.compareTo(o2.name);
                        }

                    }
                    if (m == 3) {
                        if (o2.score == o1.score) {
                            return o1.no - o2.no;
                        } else {
                            return o1.score - o2.score;
                        }
                    }
                    return -1;
                }

            });



            System.out.println("Case" + " " + count + ":");
            for (Student student : li) {
                System.out.println(String.format("%06d", student.no) + " " + student.name + " " + student.score);
            }
            count++;
        }


    }

}

class Student {
    int no;
    String name;
    int score;
}