package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        //需求1：在当前模块下创建java.txt文件
        File f1 = new File("javaSE\\2021_11_22_IO流\\src\\FileDemo\\java1.txt");
//        System.out.println(f1.createNewFile());

        //需求2：删除当前模块目录下的java.txt文件
//        System.out.println(f1.delete());
        //需求3：在当前模块目录下创建itcast目录
        File f2 = new File("javaSE\\2021_11_22_IO流\\src\\FileDemo\\itcast");
//        System.out.println(f2.mkdir());

        //需求4：删除当前目录下的itcast
//        System.out.println(f2.delete());

        //需求5：在当前模块下创建一个itcast，然后再该目录下创建一个文件java.txt
        File f3=new File("javaSE\\2021_11_22_IO流\\src\\FileDemo\\itcast");
//        System.out.println(f3.mkdir());
        File f4=new File("javaSE\\2021_11_22_IO流\\src\\FileDemo\\itcast\\java.txt");
//        System.out.println(f4.createNewFile());

        //需求6：删除当前模块下的目录itcast
        System.out.println(f4.delete());
        System.out.println(f3.delete()); //只能删除空目录
    }
}
