package FileOutputStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\FileOutputStreamDemo\\fos.txt",true);

        //写数据
        for (int i=0;i<10;i++){
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
            fos.write("\n".getBytes(StandardCharsets.UTF_8));
        }
        fos.close();

    }
}
