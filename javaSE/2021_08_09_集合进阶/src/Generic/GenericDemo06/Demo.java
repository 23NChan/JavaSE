package Generic.GenericDemo06;

public class Demo {
    public static void main(String[] args) {
        System.out.println(sum(10,20,30));
    }

    public static int sum(int... a){
        int sum = 0;
        for (int i:a){
            sum +=i;
        }
        return sum;
    }

    /*
    可变参数后面不可以再有参数
    可变参数要放到最后
     */
}
