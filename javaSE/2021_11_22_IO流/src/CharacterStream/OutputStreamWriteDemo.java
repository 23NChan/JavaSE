package CharacterStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriteDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt"));

        osw.write(97);

        char[] chs = {'a','b','c'};
        osw.write(chs,0,chs.length);
        osw.write("abcde");
        osw.close();
    }
}
