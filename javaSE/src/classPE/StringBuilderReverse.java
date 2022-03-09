package classPE;

import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Sreverse(s));

    }
    public static String Sreverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

}
