package set;

import java.util.HashSet;
import java.util.Set;

/*
Set集合特点
    不包含重复的元素
    没有带索引的方法，所以不能使用普通for循环遍历

HashSet:对集合的迭代顺序不作任何保证
 */
public class SetDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java");

        //遍历
        for(String s :set){
            System.out.println(s);
        }
        System.out.println(set);
    }
}
