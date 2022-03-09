package Case;

import java.io.*;

public class mergeMD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\mc\\GitHub\\note\\javaLJ.md"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\mc\\GitHub\\note\\java\\javaLJ.md",true));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();

        File Temp = new File("D:\\mc\\GitHub\\note\\javaLJ.md");
        Temp.delete();
    }
}
