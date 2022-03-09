package set;

import java.util.TreeSet;

/*
    + 元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体排序方法取决于构造方法
    + TreeSetDemo()：根据其元素的自然顺序进行排序
    + TreeSetDemo(Comparator comparator): 根据指定的比较器进行排序
    + 没有带索引的方法，所以不能是用普通for循环遍历
    + 由于是Set集合，所以不包含重复的元素
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> ts= new TreeSet<Integer>();

        //添加元素
        ts.add(10);
        ts.add(30);
        ts.add(40);
        ts.add(20);
        //遍历集合
        for (Integer i :ts){
            System.out.println(i);
        }
    }
}
