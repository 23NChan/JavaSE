package Extends;

public class c_Dog extends c_Animal{
    public c_Dog(String name, int age) {
        super(name, age);
    }

    public c_Dog() {
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}
