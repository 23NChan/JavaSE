
/*
    需求：有一个字符串"91 27 46 38 50" 输出结果："27 38 46 50 91"

    思路：
        1：定义一个字符串
        2：把字符串中的数字数据存储到一个int类型的数组中
            得到字符串中没一个数字数据
                public string[] split(String regex)
            定义一个int数组，把String[]数组中的每一个元素存储到int 数组中
                public static int parseInt (String s)
        3:对int 数组进行排序
        4:把排序后的int数组中的元素进行拼接到一个字符串，这里拼接采用StringBuilder 来实现
        5:输出结果

 */


import java.util.Arrays;

public class StringSortDemo {
    public static void main(String[] args) {
        //1.定义一个字符串
        String s = "91 27 46 38 50";

        //2：把字符串中的数字数据存储到一个int类型的数组中
        String[] strArray = s.split(" ");
        //定义一个int数组，把String[]数组中的每一个元素存储到int 数组中
        int[] arr = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        //3:对int 数组进行排序
        Arrays.sort(arr);

        //4:把排序后的int数组中的元素进行拼接到一个字符串，这里拼接采用StringBuilder 来实现
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<arr.length;i++){
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }

        //result 结果 [rɪˈzʌlt]
        String result = sb.toString();

        //输出结果
        System.out.println("result = " + result);

    }


}
