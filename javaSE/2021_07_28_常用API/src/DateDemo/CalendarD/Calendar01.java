package DateDemo.CalendarD;

import java.util.Calendar;

/*
    Calender 为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供一些方法

    Calender 提供了一个类方法 getInstance 用于获取 Calendar 对象，七日里字段使用当前日期和时间初始化，
        Calendar rightNow = Calendar.getInstance();

 */
public class Calendar01 {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONDAY) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");


    }
}
