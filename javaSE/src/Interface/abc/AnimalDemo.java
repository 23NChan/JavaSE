package Interface.abc;

public class AnimalDemo {
    public static void main(String[] args) {

        Jumpping j = new Cat();
        j.jump();

        Animal a = new Cat();

        a.setName("加菲");
        a.setAge(5);
        a.eat();

        

    }
}
