package polymorphism;
/*
    多态：同一个对象，在不同时刻表现出来的不同状态

   举例：猫
    我们可以说猫： 猫 cat = new 猫（）；
    我们也可以说： 动物 animal = new 猫（）；
    这里猫在不同的时刻表现出来了不同的形态，这就是多态

   多态的前提和实现
    有继承/实现关系
    有方法重写
    有父类引用指向子类对象

 */

/*
    向上转型
        从子到父
        父类引用指向子类对象

    向下转型
        从父到子
        父类引用转为子类对象

 */


public class A_Demo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        A_Animal a = new A_Cat();

        System.out.println(a.age);
//        System.out.println(a.weithgt);
        a.eat();

        //创建动物操作类对象，调用方法
        A_Cat c = new A_Cat();
        A_AnimalOperator ao = new A_AnimalOperator();
        ao.useAnimal(c);

        A_Dog d = new A_Dog();
        ao.useAnimal(d);

        //多态
        A_Animal aa = new A_Cat();//向上转型
        aa.eat();
/*
        //创建cat类对象
        A_Cat cc = new A_Cat();
        c.eat();
        c.playGame();

*/
        //向下转型
        A_Cat cc = (A_Cat)aa;
        cc.eat();
        cc.playGame();



    }


}
