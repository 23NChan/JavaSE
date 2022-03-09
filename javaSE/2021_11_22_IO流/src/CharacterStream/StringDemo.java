package CharacterStream;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";

        byte[] bys=s.getBytes("GBK");
        System.out.println(Arrays.toString(bys)); //[-42, -48, -71, -6]

        String ss = new String(bys,"GBK");
        System.out.println(ss); //中国

    }
}
