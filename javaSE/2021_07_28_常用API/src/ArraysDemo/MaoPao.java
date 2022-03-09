package ArraysDemo;

public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        arrayout(arr);
        Maopao(arr);
        arrayout(arr);
    }


    public static void arrayout(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println();
    }


    public static void Maopao(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
    }


}
