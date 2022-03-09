package SystemInDemo;

import java.io.*;

public class caseCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("javaSE\\FileDemo\\java"));

        //BufferedWriter bw = new BufferedWriter(new FileWriter("javaSE\\FileDemo\\java01"));
        PrintWriter pw = new PrintWriter(new FileWriter("javaSE\\FileDemo\\java01"),true);
        String line;
        while((line=br.readLine())!=null){
            pw.println(line);
        }

        br.close();
        pw.close();
    }
}
