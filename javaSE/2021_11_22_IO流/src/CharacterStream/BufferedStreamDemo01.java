package CharacterStream;

import java.io.*;

public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new  FileWriter("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt"));
        bw.write("hello\r\nworld");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt"));

        int len;
        char[] chs = new char[1024];
        while ((len=br.read(chs)) != -1){
            System.out.print(new String(chs,0,len));
        }


        br.close();
    }
}
