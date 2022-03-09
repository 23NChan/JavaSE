package MapDemo.Demo02.Student02;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<Student, String>();

        Student s1 = new Student("宵宫", 18);
        Student s2 = new Student("砂糖", 19);
        Student s3 = new Student("钟离", 20);
        Student s4 = new Student("钟离", 20);

        hm.put(s1, "稻妻");
        hm.put(s2, "蒙德");
        hm.put(s3, "璃月");
        hm.put(s4, "提瓦特");

        Set<Student> keySet = hm.keySet();

        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }
}
