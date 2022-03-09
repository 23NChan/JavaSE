package Case;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
复制文件加入异常处理
 */
public class CopyFileDemo {
    public static void main(String[] args) {

    }

    //JDK7改进方案
    private static void method2() {
        try (FileReader fr = new FileReader("javaSE\\java");
             FileWriter fw = new FileWriter("javaSE\\java");
        ) {

            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //JDK9改进方案
    private static void method3() throws IOException {
        FileReader fr = new FileReader("javaSE\\java");
        FileWriter fw = new FileWriter("javaSE\\java");
        try (fr; fw) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //try....catch...finally
    private static void method1() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("javaSE\\java");
            fw = new FileWriter("javaSE\\java");

            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }

            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
