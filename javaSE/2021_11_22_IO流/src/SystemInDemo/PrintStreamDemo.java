package SystemInDemo;

import java.io.IOException;
import java.io.PrintStream;

//PrintStream(String fileName)使用指定的文件名创建新的打印流

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("javaSE\\FileDemo\\java");

        //写数据
        //字节输出流有的方法
        ps.write(97); //a

        //使用特有方法写数据
        ps.print(97); //97

        ps.close();
    }
}
