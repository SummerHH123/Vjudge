package 基础题2;

import java.util.*;

/**
 * linklist实现了queue接口
 * 可以把linklist当做队列使用
 */

public class _G_Team_Queue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            Map<Integer, Integer> mp = new HashMap<>();//记录输入队列

            Queue<Integer>[] qu = new LinkedList[n];//记录每个小队
            Queue<Integer> queue = new LinkedList<>();//记录总队列所在编号
            int[] flag = new int[n];

            for (int i = 0; i < n; i++) {
                int line = sc.nextInt();
                qu[i] = new LinkedList<>();

                for (int j = 0; j < line; j++) {
                    int nu = sc.nextInt();
                    mp.put(nu, i);
                }
            }

            String command;

            System.out.println("Scenario #" + (++count));
            while (sc.hasNext()) {
                command = sc.next();
                if (command.equals("STOP")) {
                    break;
                }
                if (command.equals("ENQUEUE")) {
                    int number = sc.nextInt();
                    int line = mp.get(number);

                    qu[line].offer(number);
                    if (flag[line] == 0) {
                        queue.offer(line);
                        flag[line] = 1;
                    }
                } else if (command.equals("DEQUEUE")) {

                    int ans = qu[queue.peek()].poll();
                    System.out.println(ans);

                    if (qu[queue.peek()].isEmpty()) {
                        flag[queue.peek()] = 0;
                        queue.poll();
                    }
                }
            }
            System.out.println();
        }


    }
}
