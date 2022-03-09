package Lambda.LambdaDemo2;

public class EatableDemo {
    public static void main(String[] args) {
        useEatable(() -> {
            System.out.println("hello");
        });
    }

    public static void useEatable(Eatable e) {
        e.eat();
    }
}
