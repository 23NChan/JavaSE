package CharacterStream;

import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt"),"GBK");
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt"),"GBK");
        //一次读一个字符数据
        int ch;
        while((ch=isr.read())!=-1){
            System.out.println((char) ch);
        }
        isr.close();
    }
}
