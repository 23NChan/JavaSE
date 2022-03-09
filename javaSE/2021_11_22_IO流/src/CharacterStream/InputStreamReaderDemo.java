package CharacterStream;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt"));

//        int hc;
//        while((hc=isr.read())!=-1){
//            System.out.print((char) hc);
//        }

        char[] chs=new char[1024];
        int len;
        while((len=isr.read(chs)) !=-1){
            System.out.print(new String(chs));
        }

        isr.close();
    }
}
