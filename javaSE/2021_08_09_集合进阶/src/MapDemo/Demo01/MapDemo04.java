package MapDemo.Demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo04 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map=new HashMap<String,String>();

        //添加元素
        map.put("艾瑞莉亚","艾欧尼亚");
        map.put("佐伊","巨神峰");
        map.put("影哨","恕瑞玛");

        //获取所有键的集合
        Set<String> keySet = map.keySet();

        //遍历键的集合，获取到没一个键。用增强for遍历集合
        for(String key:keySet){
            String value =map.get(key);
            System.out.println(key+","+value);

        }
    }
}
