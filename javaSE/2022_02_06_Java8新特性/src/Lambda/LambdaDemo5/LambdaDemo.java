package Lambda.LambdaDemo5;

public class LambdaDemo {
    public static void main(String[] args) {

        useAddable((int a, int b) -> {
            return a + b;
        });
        //参数的类型可以省略
        //但是有多个参数的情况下，不能只省略一个
        useAddable((a, b) -> {
            return a + b;
        });


        useFlyable((s) -> {
            System.out.println(s);
        });
        //如果参数有且仅有一个，那么小括号可以省略
        useFlyable(s -> {
            System.out.println(s);
        });

        //如果代码块的语句只有一条可以省略大括号和分号,如果有return return也可以省掉
        useFlyable(s -> System.out.println(s));
        useAddable((x, y) -> x + y);

    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
