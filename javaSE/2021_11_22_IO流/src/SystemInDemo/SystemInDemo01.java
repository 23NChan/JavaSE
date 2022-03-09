package SystemInDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
public static final InputStream in：

标准输入流。通常该流对应于键盘输入或由主机环境或用户指定的另一个输入源
 */
public class SystemInDemo01 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        /**
        int len;
        byte chs[] = new byte[1024];
        while((len=is.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }
         */

        /**
        int by;
        while((by=is.read())!=-1){
            System.out.println((char) by);
        }

        //如何把字节流转换为字符流？用转换流
        InputStreamReader isr = new InputStreamReader(is);
        //使用字符流能不能够实现一次读取一行数据呢？可以
        //但是，一次读取一行数据的方式是字符缓冲输入流的特有方法
        BufferedReader br =new BufferedReader(isr);
         */

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串：");
        String line = br.readLine();
        System.out.println("你输入的字符串是："+line);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是："+i);

        //自己实现键盘录入数据太麻烦了，所以java提供了一个类提供使用
        Scanner sc = new Scanner(System.in);
    }
}

