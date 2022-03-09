package set.ComparableDemo;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("xiaogong", 18);
        Student s2 = new Student("xinhai", 20);
        Student s3 = new Student("leishen", 500);
        Student s4 = new Student("ganyu", 17);
        Student s5 = new Student("shatang",18);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

}
