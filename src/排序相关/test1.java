package 排序相关;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        List li1=new ArrayList();
        li1=li;
        li1.add("123");
        System.out.println(li.get(0));
    }
}
