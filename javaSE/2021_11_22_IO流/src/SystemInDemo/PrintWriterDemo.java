package SystemInDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("javaSE\\FileDemo\\java");
        pw.write("hello");
        pw.flush();
        pw.println("hello");
        pw.flush();
        pw.close();
        PrintWriter pw1 = new PrintWriter(new FileWriter("javaSE\\FileDemo\\java"),true);
        pw1.println("hello");
    }
}
