package FileDemo;

import java.io.File;

public class Case_TraverseDirectory {
    public static void main(String[] args) {
        File file=new File("D:\\mc\\FileDemo");
        getAllFilePath(file);
    }
    public static void getAllFilePath(File srcFile){
        File[] fileArray = srcFile.listFiles();
        if (fileArray !=null){
            for (File file:fileArray){
                if (file.isDirectory()){
                    getAllFilePath(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
