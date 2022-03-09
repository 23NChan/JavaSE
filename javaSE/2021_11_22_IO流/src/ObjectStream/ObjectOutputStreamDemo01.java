package ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * NotSerializableException
 * 抛出实例需要一个Serializable接口。序列化运行时或实例的类可能会抛出异常。参数应该是类的名称
 * | 方法                                 | 描述                                               |
 * | ------------------------------------ | -------------------------------------------------- |
 * | ObjectOutputStream(OutputStream out) | 创建一个写入指定的OutputStream的ObjectOutputStream |
 * | void writeObject(Object obj)         | 将指定的对象写入ObjectOutputStream                 |
 */
public class ObjectOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("javaSE\\FileDemo\\ObjcetStream.txt"));

        //创建对象
        Student s = new Student("宵宫", 18);

        oos.writeObject(s);

        oos.close();
    }

}
                                                                 