package PropertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * | 方法名                                        | 说明                                                         |
 * | --------------------------------------------- | ------------------------------------------------------------ |
 * | void load(InputStream inStream)               | 从输入字节流读取属性列表(键和元素对)                         |
 * | void load(Reader reader)                      | 从输入字节流读取属性列表(键和元素对)                         |
 * | void stroe(OutputStream out, String comments) | 将此属性列表(键和元素对)写入此Properties表中，以适合于使用load(InputStream)方法的格式写入输出字符流 |
 * | void store(Writer writer, String comments)    | 将此属性列表(键和元素对)写入此Properties表中，以适合于使用load(Reader)方法的格式写入输出字符流 |
 */
public class PropretiesDemo03 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();
        //把文件中的数据加载到集合
        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties porp = new Properties();

        FileReader fr = new FileReader("javaSE\\FileDemo\\fw.txt");

        porp.load(fr);
        fr.close();

        System.out.println(porp);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("001", "宵宫");
        prop.setProperty("002", "砂糖");
        prop.setProperty("003", "甘雨");

        FileWriter fw = new FileWriter("javaSE\\FileDemo\\fw.txt");
        prop.store(fw, null);
        fw.close();
    }
}
