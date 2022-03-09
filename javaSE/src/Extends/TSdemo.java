package Extends;

public class TSdemo {
    public static void main(String[] args) {
        //创建老师对象进行测试
        Teacher t1 = new Teacher();
        t1.setAge(30);
        t1.setName("林青霞");
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("风清扬",33);

        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();



    }
}
