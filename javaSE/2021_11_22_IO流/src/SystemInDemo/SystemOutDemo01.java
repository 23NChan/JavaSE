package SystemInDemo;

import java.io.PrintStream;

public class SystemOutDemo01 {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        ps.print("hello");
        ps.print(100);
    }
}
