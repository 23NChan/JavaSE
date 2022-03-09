package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\mc\\FileDemo\\java.txt");
        System.out.println(f1.createNewFile());
        //如果文件不存在，就创建文件，并返回true
        //如果文件存在，就不创建文件，并返回false
        //如果存在同名文件夹，不创建文件，并返回false

        File f2 = new File("D:\\mc\\FileDemo\\JavaSe");
        System.out.println(f2.mkdir());
        //如果目录不存在，就创建目录，并返回true
        //如果目录存在，就不创建目录，并返回false
        //如果中间目录不存在,终止创建

        File f3 = new File("D:\\mc\\FileDemo\\java\\javaSE");
        System.out.println(f3.mkdirs());
        //如果目录不存在，就创建目录，并返回true
        //如果目录存在，就不创建目录，并返回false
    }
}
