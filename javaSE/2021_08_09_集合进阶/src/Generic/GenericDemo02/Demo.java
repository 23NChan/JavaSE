package Generic.GenericDemo02;

public class Demo  {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("宵宫");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(30);
        System.out.println(t.getAge());
        System.out.println("--------------------");

        Generic<String> g1 = new Generic<String>();
        g1.setT("新海");
        System.out.println(g1.getT());

        Generic<Integer> g2 =new Generic<Integer>();
        g2.setT(30);
        System.out.println(g2.getT());


    }
}
