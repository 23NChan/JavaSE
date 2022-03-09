package FileOutputStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\FileOutputStreamDemo\\fos.txt");

        byte[] bys={97,98,99,100,101};
//        fos.write(bys); //abcde
        //byte[] getBytes():返回字符串对应的字节数组
        byte[] bytes = "abcde".getBytes(StandardCharsets.UTF_8);
//        fos.write(bytes); //abcde

        fos.write(bys,1,3); //bcd
        fos.close();
    }
}
