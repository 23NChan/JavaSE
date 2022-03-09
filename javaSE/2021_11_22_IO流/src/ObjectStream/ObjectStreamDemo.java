package ObjectStream;
/*
    用对象序列化流序列化一个对象后，加入我们修改了对象所属的类文件，读取数据会不会出问题呢
    java.io.InvalidClassException: ObjectStream.Student; local class incompatible:
    stream classdesc serialVersionUID = 36513902446832796,
    local class serialVersionUID = 6901015053234780122

    如果出问题了，如何解决
    给对象所属的类加一个值： private  static final long serialVersionUID= 42L;

    如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢



 */

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        write();
        read();
    }

    //反序列化
    private static void read() throws IOException,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javaSE\\FileDemo\\oos.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();

    }
    private static void write() throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("javaSE\\FileDemo\\oos.txt"));
        Student s = new Student("安妮",15);
        oos.writeObject(s);
        oos.close();

    }
}
