package ArrayLIst01;

public class Student {
    private String name;
    private int age;

//    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void SetName(String name){
        this.name = name;

    }

    public String GetName(){
        return name;

    }

    public void SetAge(int age){
        this.age = age;

    }

    public int GetAge(){
        return age;

    }


}
