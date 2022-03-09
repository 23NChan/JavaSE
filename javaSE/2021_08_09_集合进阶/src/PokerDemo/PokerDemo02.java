package PokerDemo;

import com.sun.jdi.request.ThreadDeathRequest;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo02 {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<Integer, String> hm = new HashMap<>();

        //创建ArrayList集合
        ArrayList<Integer> array = new ArrayList<>();

        //定义花色数组
        String[] colors = {"♢", "♧", "♡", "♤"};
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};


        //从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;

        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);

        //洗牌
        Collections.shuffle(array);

        //发牌
        TreeSet<Integer> user1 = new TreeSet<>();
        TreeSet<Integer> user2 = new TreeSet<>();
        TreeSet<Integer> user3 = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (i >= array.size() - 3) {
                dp.add(x);
            } else if (i % 3 == 0) {
                user1.add(x);
            } else if (i % 3 == 1) {
                user2.add(x);
            } else if (i % 3 == 2) {
                user3.add(x);
            }
        }

        //调用看牌方法
        lookPoker("user1",user1,hm);
        lookPoker("user2",user2,hm);
        lookPoker("user2",user3,hm);
        lookPoker("底牌",dp,hm);

    }

    public static void lookPoker(String name, TreeSet < Integer > ts, HashMap < Integer, String > hm ){
        System.out.print(name+"的牌是： ");
        for (Integer key:ts){
            String poker=hm.get(key);
            System.out.print(poker+"  ");
        }
        System.out.println();
    }
}
