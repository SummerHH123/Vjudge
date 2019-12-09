package 排序相关;

import java.util.*;

/**
 * 贪心算法，先按照单价最低的来买，如果该商品能全部买下，则买完这件后开始买下一件
 * 如果不能，则按照比例来买
 */
public class C_C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (sc.hasNext()){
            if (n==0){
                return;
            }
            for (int i=0;i<n;i++){
                int money=sc.nextInt();
                int count=sc.nextInt();
                double weight=0.0;
                commodity[] commodities=new commodity[count];
                List<commodity> li=new ArrayList<>();
                for (int j=0;j<count;j++){
                    commodities[j]=new commodity();
                    commodities[j].price=sc.nextInt();
                    commodities[j].weight=sc.nextInt();
                    li.add(commodities[j]);
                }
                Collections.sort(li, new Comparator<commodity>() {
                    @Override
                    public int compare(commodity o1, commodity o2) {
                        if (o1.price>o2.price){
                            return 1;
                        }
                        return -1;
                    }
                });

                for (int m = 0; m < li.size(); m++) {
                    if (money<=0){
                        break;
                    }
                    if (money<(li.get(m).price*li.get(m).weight)){
                        double weig=(double) money/(li.get(m).price*li.get(m).weight)*li.get(m).weight;
                        money-=weig*li.get(m).price;
                        weight+=weig;

                    }else {
                        money-=li.get(m).price*li.get(m).weight;
                        weight+=li.get(m).weight;
                    }

                }

                System.out.printf("%.2f\n",weight);
            }

            n--;
        }

    }
}
class commodity{
    int price;
    int weight;
}
