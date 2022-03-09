package MapDemo.Demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo05 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map=new HashMap<String,String>();

        //添加元素
        map.put("艾瑞莉亚","艾欧尼亚");
        map.put("佐伊","巨神峰");
        map.put("影哨","恕瑞玛");
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        //遍历键值对对象的集合，得到每一个键值对对象
        for(Map.Entry<String,String> me:entrySet){
            //根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+ ","+value);
        }

    }
}
