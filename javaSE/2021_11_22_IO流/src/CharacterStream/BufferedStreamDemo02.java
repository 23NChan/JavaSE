package CharacterStream;

import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt"));

        for (int i=0;i<10;i++){
            bw.write("hello");
            bw.newLine();
            bw.flush();
        }
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("javaSE\\2021_11_22_IO流\\src\\CharacterStream\\fos.txt"));

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }


        br.close();
    }
}
