package Extends;

public class Zi extends Fu{
    //身高

    public int height = 175;
    public int age = 10;

    public Zi(){
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi(int age){
        System.out.println("Zi中带参构造方法被调用");
    }

    public  void shouw(){
        int age = 18;
        System.out.println(age);
        System.out.println(height);
        System.out.println(this.age);
        System.out.println(super.age);

    }

    public void ff(){
        System.out.println("子类方法被调用");
    }

    @Override
    public void aa(){

    }
}
