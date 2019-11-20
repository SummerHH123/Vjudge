package 基础题2;

import java.util.*;


/**
 * map的使用
 * 以及list的排序
 */
public class _B_List_of_Conquests {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer> mp=new HashMap<>();
        for (int i=0;i<n;i++){
            String s=sc.next();
            if (mp.get(s)==null){
                mp.put(s,1);
            }else {
                Integer num=mp.get(s);
                num++;
                mp.put(s,num);

            }
            sc.nextLine();
        }
        List<Map.Entry<String,Integer>> li=new ArrayList<>(mp.entrySet());

        Collections.sort(li, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for (Map.Entry<String, Integer> stringIntegerEntry : li) {

            System.out.println(stringIntegerEntry.getKey()+" "+stringIntegerEntry.getValue());
        }


    }
}
