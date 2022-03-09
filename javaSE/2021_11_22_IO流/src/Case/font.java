package Case;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class font {
    public static void main(String[] args) throws IOException {
        zj();
    }

    public static void zj() throws IOException {
        FileInputStream fis = new FileInputStream("javaSE\\FileDemo\\font");

        byte[] b = new byte[10];
        int len;
        while ((len = fis.read(b)) != -1) {
            for (int i = 0; i < len; i++) {
//                String s = (char) b[i];
//                System.out.println(s);
                if (((char) b[i])=='<'){
                    System.out.print((char) b[i]);
                    System.out.print("  ");
                } else if (((char) b[i])=='>'){
                    System.out.println((char) b[i]);
                } else {
                    System.out.print(b[i]);
                    System.out.print("  ");
                }


            }
        }
        fis.close();
    }


    public static void zf() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("javaSE\\FileDemo\\font"), "UTF-8");

        int len;
        char[] i = new char[1024];
//        while((len=isr.read(i))!=-1){
//            System.out.print(new String(i,0,len));
//        }
        while ((len = isr.read()) != -1) {
            System.out.print(len);
        }
        isr.close();
    }
}
