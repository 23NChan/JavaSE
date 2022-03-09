package classPE;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String() ;
        System.out.println(s1);

        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println(s2);

        byte[] bys = {97,98,99};
        String s3 = new String(bys);
        System.out.println(s3);

        String s4 = "abc";
        System.out.println(s4);

        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s4));
    }
}
