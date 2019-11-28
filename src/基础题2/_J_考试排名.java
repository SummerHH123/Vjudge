package 基础题2;

import java.util.*;

public class _J_考试排名 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<student> li=new ArrayList<>();



        while (sc.hasNext()) {


            String name = sc.next();
            if (name.equals("stop")) {
                break;
            }
            int number = 0;
            int score = 0;
            for (int i = 0; i < n; i++) {

                String ti = sc.next();
                if (!ti.contains("(")) {
                    int i1 = Integer.parseInt(ti);
                    if (i1 > 0) {
                        score += i1;
                        number++;
                    }
                } else {
                    String s1 = "";
                    String s2 = "";
                    int j, k;
                    for (j = 0; ti.charAt(j) != '('; j++) {
                        s1 += ti.charAt(j);
                    }
                    for (k = j + 1; ti.charAt(k) != ')'; k++) {
                        s2 += ti.charAt(k);
                    }

                    int score1 = Integer.parseInt(s1);
                    int score2 = Integer.parseInt(s2);

                    score = score + score1 + m * score2;
                    number++;
                }

            }
            student st= new student(name, number, score);
            li.add(st);

        }

        Collections.sort(li, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                if (o1.number < o2.number) {
                    return 1;
                }
                if (o1.number == o2.number && o1.score > o2.score) {
                    return 1;
                }
                if (o1.number == o2.number && o1.score == o2.score) {
                    return o1.name.compareTo(o2.name);
                }
                return -1;
            }
        });
        for (student student : li) {
            System.out.printf("%-10s %2d %4d", student.name, student.number, student.score);
            System.out.println();
        }
    }
}

class student {
    String name;
    int number;
    int score;

    public student(String name, int number, int score) {
        this.name = name;
        this.number = number;
        this.score = score;
    }
}
