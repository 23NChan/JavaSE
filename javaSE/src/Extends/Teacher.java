package Extends;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    public void teach(){
        System.out.println("用爱成就每一位学员");
    }


}
