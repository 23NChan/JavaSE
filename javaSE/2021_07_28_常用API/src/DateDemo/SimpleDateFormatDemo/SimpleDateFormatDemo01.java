package DateDemo.SimpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    构造方法：
        public SimpleDateFormat():构造一个SimpleDateFormat,使用默认模式和日期格式
        public SimpleDateFormat(String pattern):构造一个SimpleDateFormat使用给定的模式和默认的日期格式

    格式化：从Date到String
        public final String format(Date date):将日期格式化成日期/时间字符串

    解析：从String 到 Date
        public Date parse(String source):从给定字符串的开始解析文本以生成日期

 */
public class SimpleDateFormatDemo01 {
    public static void main(String[] args) throws ParseException {
        //格式化
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
        System.out.println(sdf2.format(d));

        System.out.println("-------------");

        //解析
        String ss = "2021年07月31日 22：00：00";
        Date d2 = sdf2.parse(ss);
        System.out.println(d2);

    }

}
