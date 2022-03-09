package Case.TxtToArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("javaSE\\FileDemo\\ArrayListToTxt.txt"));

        ArrayList<Student> array = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] strarray = line.split(",");

            Student s = new Student(strarray[0], strarray[1], Integer.parseInt(strarray[2]), strarray[3]);

            array.add(s);

        }

        br.close();

        for (Student s : array) {
            System.out.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());

        }
    }
}
