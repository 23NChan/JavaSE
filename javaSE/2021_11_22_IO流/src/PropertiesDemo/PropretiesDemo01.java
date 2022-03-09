package PropertiesDemo;

import javax.lang.model.element.NestingKind;
import java.util.Properties;
import java.util.Set;

public class PropretiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();
        prop.put("001","李青");
        prop.put("002","安妮");

        Set<Object> keyset = prop.keySet();
        for (Object key : keyset){
            Object value = prop.get(key);
            System.out.println(key +","+value);
        }
    }
}
