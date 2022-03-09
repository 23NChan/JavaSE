package DateDemo;


/*
    Date类常用方法
        public long getTime():获取的日期对象从1970年1月1日 00:00:00到现在的毫秒值
        public void setTime(long time ):设置时间，给的是毫秒值
 */

import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) {
        //创建对象
        Date d = new Date();

        //public long getTime():获取的日期对象从1970年1月1日 00:00:00到现在的毫秒值
        System.out.println(d.getTime());

        Date d2 = new Date();
        long time =1000 *60 * 60;
        d2.setTime(time);
        System.out.println(d);

    }
}
