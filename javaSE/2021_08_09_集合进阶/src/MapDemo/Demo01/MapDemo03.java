package MapDemo.Demo01;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map=new HashMap<String,String>();

        //添加元素
        map.put("艾瑞莉亚","艾欧尼亚");
        map.put("佐伊","巨神峰");
        map.put("影哨","恕瑞玛");

        //V get(Object key)
        System.out.println(map.get("艾瑞莉亚"));
        System.out.println(map.get("赫卡里姆"));

        //Set<K> keySet()
        System.out.println(map.keySet());

        //Collection<V> values()
        System.out.println(map.values());

    }
}
