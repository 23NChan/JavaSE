
/*
    装箱：把基本数据类型转换为对应的包装类类型
    拆箱：把包装类类型转换为对应的基本数据类型

 */
public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100); //装箱
        Integer ii = 100; //自动装箱 jdk5后简化

        ii = ii.intValue() + 200;  //ii.intValue()拆箱
        ii = ii + 200;  //自动拆箱 装箱

        Integer iii = null;
        iii += 100; //NullPointerException

    }
}
