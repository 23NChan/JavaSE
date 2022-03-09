package MapDemo.Demo02.Student01;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String, Student> hm = new HashMap<String, Student>();

        //创建学生对象
        Student s1 = new Student("宵宫", 18);
        Student s2 = new Student("新海", 20);
        Student s3 = new Student("砂糖", 16);

        //把学生添加到集合
        hm.put("tiwate001", s1);
        hm.put("tiwate002", s2);
        hm.put("tiwate003", s3);

        //遍历集合
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());

        }
    }
}
