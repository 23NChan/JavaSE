package DateDemo.DateUtils;

import java.text.ParseException;
import java.util.Date;

/*
    测试类
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();

        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日  HH:mm:ss");
        System.out.println(s1);


        String s = "2021-08-01 9:32:35";

        Date dd = DateUtils.StringToDAte(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);

    }
}
