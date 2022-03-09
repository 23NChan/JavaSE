package CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        //1.根据数据源创建字符输入流对象
        FileReader fr = new FileReader("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\javaDemo.java");
        //2.根据目的地创建字符输出流对象
        FileWriter fw = new FileWriter("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\javaCopy.java");

        //读写数据,复制文件
        int ch;
        char[] chs= new char[1024];
        while((ch = fr.read(chs))!=-1){
            fw.write(chs,0,ch);
        }

        //释放资源
        fw.close();
        fr.close();
    }
}
