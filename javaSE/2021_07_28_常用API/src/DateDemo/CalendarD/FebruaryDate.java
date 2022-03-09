package DateDemo.CalendarD;

/*
    需求：
        获取任意一年的二月有多少天

    思路：
        1：键盘录入任意的年份
        2：设置日历对象的年、月、日
            年：来自于键盘录取
            月：设置为3月，月份是从0开始的，所以设置的值时2
            日；设置为1日
        3：3月1日往前推一天，就是2月的最后一天
        4：获取这一天输出即可

 */

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FebruaryDate {
    public static void main(String[] args) {
        //1：键盘录入任意的年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        //2：设置日历对象的年、月、日
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);

        //3：3月1日往前推一天，就是2月的最后一天
        c.add(Calendar.DATE, -1);

        //4：获取这一天输出即可
        int date = c.get(Calendar.DATE);

        System.out.println(year + "年二月份有" + date + "天");

    }
}
