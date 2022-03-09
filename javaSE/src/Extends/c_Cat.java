package Extends;

public class c_Cat extends c_Animal{
    public c_Cat(String name, int age) {
        super(name, age);
    }

    public c_Cat() {
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
