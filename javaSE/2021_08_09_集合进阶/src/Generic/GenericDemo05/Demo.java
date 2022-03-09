package Generic.GenericDemo05;

import com.sun.jdi.ArrayReference;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //类型通配符：<?>
        List<?> list1 = new ArrayList<String>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        System.out.println("-----------------");
        //类型通配符的上限
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();

        System.out.println("-----------------");
        //类型通配符的下限
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
    }

}
