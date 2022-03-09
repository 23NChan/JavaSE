package ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javaSE\\FileDemo\\ObjcetStream.txt"));

        Object ob = ois.readObject();
        Student s = (Student) ob;
        System.out.println(s.getName()+","+ s.getAge());

        ois.close();
    }
}
