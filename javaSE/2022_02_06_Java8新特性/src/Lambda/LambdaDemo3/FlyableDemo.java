package Lambda.LambdaDemo3;

public class FlyableDemo {
    public static void main(String[] args) {
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("java");
        });

    }
    private static void useFlyable(Flyable flyable){
        flyable.fly("hello");
    }
}
