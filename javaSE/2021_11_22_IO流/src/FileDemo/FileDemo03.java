package FileDemo;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        File f = new File("D:\\mc\\FileDemo\\java.txt");

        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());

        File f2 = new File("D:\\mc\\FileDemo");
        String[] strArray = f2.list();
        for (String str:strArray){
            System.out.println(str);
        }
        System.out.println("----------------");
        File[] fileArray = f2.listFiles();
        for (File file:fileArray){
            System.out.println(file);
        }
    }
}
