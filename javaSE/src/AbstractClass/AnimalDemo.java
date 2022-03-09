package AbstractClass;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态方式

        Animal a = new Cat();
        a.setAge(5);
        a.setName("加菲");
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

    }
}
