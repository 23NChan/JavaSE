package Case.ArrayListToTxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxt {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("001", "温迪", 16, "蒙德");
        Student s2 = new Student("002", "钟离", 20, "璃月");
        Student s3 = new Student("003", "新海", 15, "稻妻");
        Student s4 = new Student("004", "甘雨", 18, "璃月");

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        BufferedWriter bw = new BufferedWriter(new FileWriter("javaSE\\FileDemo\\ArrayListToTxt.txt"));
        for (Student s : array) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
