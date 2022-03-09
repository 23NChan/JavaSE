package classPE;

public class StringBuilderDemo {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("hello");
        System.out.println(sb);

        //链式编程
        sb.append("world").append("java").append(100);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }

}
