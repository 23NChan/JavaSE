package FuntionalInterface.Supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        //定义一个int数组
        int[] arr = {19,20,10,30,40};

        int maxvalue =getMax(()->{
            int Max = arr[0];
            for (int i = 1 ;i<arr.length;i++){
                if (Max<arr[i]){
                    Max=arr[i];
                }
            }
            return Max;
        });
        System.out.println(maxvalue);
    }

    private static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
