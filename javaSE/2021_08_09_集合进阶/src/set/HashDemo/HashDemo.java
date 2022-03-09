package set.HashDemo;
/*
    哈希值：
        是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
    Object类中有一个方法可以获取对象的哈希值
        public int hashCode():返回对象的哈希码值
 */
public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("宵宫",18);

        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode()); //2129789493
        System.out.println(s1.hashCode()); //2129789493

        Student s2 = new Student("宵宫",18);

        //默认情况下，不同对象的哈希值是不相同的
        //通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode()); //668386784

        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818

        System.out.println("world".hashCode());//113318802

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
