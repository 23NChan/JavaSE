package Generic.GenericDemo04;

public class Demo {
    public static void main(String[] args) {
        Generic<String> g1 = new Genericimpl<String>();
        g1.show("甘雨");

        Generic<Integer> g2 = new Genericimpl<Integer>();
        g2.show(30);
    }
}
