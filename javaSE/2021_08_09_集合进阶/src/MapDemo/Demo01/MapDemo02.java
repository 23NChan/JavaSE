package MapDemo.Demo01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map=new HashMap<String,String>();

        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");


        //V remove(Object key)
        System.out.println(map.remove("郭靖"));
        System.out.println(map.remove("宵宫"));

        //void clear()
//        map.clear();

        //boolean containsKey(Object key)
        System.out.println(map.containsKey("张无忌"));

        //boolean cotainsValue(Object value)
        System.out.println(map.containsValue("小龙女"));

        //boolean isEmpty()
        System.out.println(map.isEmpty());

        //int size()
        System.out.println(map.size());

        //输出集合对象
        System.out.println(map);
    }
}
