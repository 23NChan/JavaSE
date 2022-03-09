package Lambda.LambdaDemo6;

public class LambdaDemo {
    public static void main(String[] args) {
        useInter(() -> System.out.println("好好学习天天向上"));
    }

    private static void useInter(Inter i) {
        i.show();

    }
}
