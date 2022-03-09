package PropertiesDemo;

import java.util.Properties;
import java.util.Set;

/**
 *| 方法名                                       | 说明                                                         |
 * | -------------------------------------------- | ------------------------------------------------------------ |
 * | Object setProperty(String key, String value) | 设置集合的键和值，都是String类型，底层调用Hashtable方法put   |
 * | String getProperty(String key)               | 使用此属性列表中指定的键搜索属性                             |
 * | Set<String> stringPropertyNames()            | 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串 |
 *
 */

public class PropretiesDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop=new Properties();

        prop.setProperty("001","宵宫");
        System.out.println(prop.getProperty("001"));//宵宫

        Set<String> names = prop.stringPropertyNames();
        for (String key:names){
            System.out.println(key);//001
        }

        System.out.println(prop);//{001=宵宫}
    }
}
