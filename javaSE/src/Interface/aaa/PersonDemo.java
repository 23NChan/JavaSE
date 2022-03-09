package Interface.aaa;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("马龙");
        ppp.setAge(32);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
    }
}
