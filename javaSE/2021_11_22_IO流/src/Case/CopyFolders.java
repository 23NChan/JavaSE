package Case;

import java.io.*;
import java.util.function.BiFunction;

/*\
1. 创建数据源File对象
2. 创建目的地File对象
3. 写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
4. 判断数据源File是否为目录
   1. 是
      1. 在目的地下创建和数据源File同名目录
      2. 获取数据源File下所有文件或者目录的File数组
      3. 遍历该File数组，得到每一个File对象
      4.  把该File作为数据源File对象，递归调用复制文件夹的方法
   2. 不是：说明是文件，直接复制
 */
public class CopyFolders {
    public static void main(String[] args) throws IOException{
        //创建数据源对象
        File srcFile = new File("javaSE\\FileDemo");
        //创建目的地对象
        File destFile = new File("javaSE\\FileDemo01\\");

        //写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
        copyFolder(srcFile, destFile);
    }

    //复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        //判断数据源File是否是目录
        if (srcFile.isDirectory()){
            //在目的地创建和数据源File同名目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile,srcFileName);
            if (!newFolder.exists()){
                newFolder.mkdir();
            }
            //获取数据源File下所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();

            //遍历该File数组，得到每一个File对象
            for (File file :fileArray){
                //把该File作为数据源File对象，递归调用复制文件夹的方法
                copyFolder(file,newFolder);
            }
        }else {
            File newFile =new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }

    //字节缓冲流复制文件
    private static void copyFile(File srcFile, File desFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bos.close();
        bis.close();
    }
}
