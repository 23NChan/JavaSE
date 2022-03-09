package Extends;

public class Fu {
    //年龄
    public int age = 40;

    public Fu(){
        System.out.println("Fu中无参构造方法被调用");
    }

    public Fu(int age){
        System.out.println("Fu中带参构造方法别调用");
    }

    public void ff(){
        System.out.println("父类方法被调用");
    }
    void aa(){
        System.out.println();
    }

}
