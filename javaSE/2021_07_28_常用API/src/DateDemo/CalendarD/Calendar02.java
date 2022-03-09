package DateDemo.CalendarD;

import java.util.Calendar;

/*
    public abstract void add(int field, int amount): 根据日立的规则，将指定的时间量添加货减去给定的日历字段
    public final void set(int year, int month, int date): 设置当前日历的年月日

 */
public class Calendar02 {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();

        //public int get(int field): 返回给定日历字段的值
        c.add(Calendar.DATE,-2704);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONDAY) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        //public abstract void add(int field, int amount): 根据日立的规则，将指定的时间量添加货减去给定的日历字段
        c.add(Calendar.DATE,-3);

        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONDAY) + 1;
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONDAY) + 1;
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        System.out.println("-----------------------------------");
        //public final void set(int year, int month, int date): 设置当前日历的年月日

        c.set(2021,8,2);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONDAY);
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

    }
}
