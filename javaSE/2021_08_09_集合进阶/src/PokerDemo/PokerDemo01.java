package PokerDemo;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo01 {
    public static void main(String[] args) {
        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        ArrayList<String> array = new ArrayList<String>();

        //往牌盒里面装牌
        /*
            ♢2，♢3，♢4......♢K,♢A
            ♧2,...
            ♡2,...
            ♤2,...
            小王，大王
         */
        //定义花色数组
        String[] colors = {"♢", "♧", "♡", "♤"};
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");

        //洗牌
        Collections.shuffle(array);

        //发牌，给三个玩家
        ArrayList<String> user1 = new ArrayList<>();
        ArrayList<String> user2 = new ArrayList<>();
        ArrayList<String> user3 = new ArrayList<>();
        ArrayList<String> dz = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);

            if (i >= array.size() - 3) {
                dz.add(poker);
            } else if (i % 3 == 0) {
                user1.add(poker);
            } else if (i % 3 == 1) {
                user2.add(poker);
            } else if (i % 3 == 2) {
                user3.add(poker);
            }
        }

        //看牌
        lookPorker("宵宫",user1);
        lookPorker("新海",user2);
        lookPorker("彩鳞",user3);
        lookPorker("底牌",dz);
    }

    //看牌的方法
    public static void lookPorker(String name,ArrayList<String> array){
        System.out.print(name+ "的牌是：");
        for (String poker:array){
            System.out.print(poker+ "  ");
        }
        System.out.println();

    }

}
