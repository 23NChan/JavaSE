/*
    public String getMessage() 返回此throwable的详细信息字符串
    public String toString90   返回此可抛出的简短描述
    public void printStackTrace() 把异常的错误信息输出在控制台

 */
public class Throwable01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {

            //public void printStackTrace() 把异常的错误信息输出在控制台
            e.printStackTrace();

            //public String getMessage() 返回此throwable的详细信息字符串
            System.out.println(e.getMessage());  //Index 3 out of bounds for length 3

            //public String toString90   返回此可抛出的简短描述
            System.out.println(e.toString());
        }
    }

}


/*
    public class Throwable{
        private String detailMessage;

        public Throwable(String message){
            detailMessage = message;
        }

        public String getMessage() {
            return detailMessage;
        }
    }

 */