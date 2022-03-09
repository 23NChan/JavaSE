/*
    基本类型包装类

 */

public class IntegerDemo {
    public static void main(String[] args) {
        //需求:我要判断一个数据是否在int范围内

        /*
        public static final int MIN_VALUE
        public static final int MAX_VALUE
         */
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("--------------------");

        /*
        构造方法
            public Integer(int value):根据int 值创造 Integer 对象（过时）
            public Integer(String s):根据String 值创建 Integer 对象(过时)

        静态方法获取对象
            public static Integer valueOf(int i):返回表示指定的int 值的 Integer 实例
            public static Integer valueOf(String i):返回一个保存指定值的 Integer 对象 String
         */
        Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2 = new Integer("100");
        System.out.println(i2);

        System.out.println("--------------------");


        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);
        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);

        System.out.println("--------------------");


        //int 和String 的相互转换
        int number = 100;
        //方式1
        String s1 = "" + number;
        System.out.println(s1);
        //方式2
        String s2 = String.valueOf(number);
        System.out.println(s2);

        System.out.println("--------------------");


        //String -----int
        String s = "1000";
        //方式1
        //String --- Integer --- int
        Integer i = Integer.valueOf(s);
        //public int intValue()
        int x = i.intValue();
        System.out.println(x);

        //方式2
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
