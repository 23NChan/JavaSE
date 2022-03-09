package ArrayLIst01;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {


        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("蟋蟀", 19);
        Student s2 = new Student("北风", 20);
        Student s3 = new Student("禅", 18);
        array.add(s1);
        array.add(s2);
        array.add(s3);

        for(int i= 0; i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.GetName() + "," + s.GetAge());

        }
    }




}
