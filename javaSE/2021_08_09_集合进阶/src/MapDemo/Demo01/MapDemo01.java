package MapDemo.Demo01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> hm = new HashMap<String,String>();

        //V put (K key,V value) 将指定的值与该映射中的指定键相关联
        hm.put("itheima001","宵宫");
        hm.put("itheima002","新海");
        hm.put("itheima003","砂糖");
        hm.put("itheima004","芭芭拉");

        //输出集合对象
        System.out.println();

    }
}
