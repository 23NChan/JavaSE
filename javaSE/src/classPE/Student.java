package classPE;

public class Student {

    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int n){
        age =n;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void study(){
        System.out.println("好好学习天天向上");

    }

    public void doHomework(){
        System.out.println("键盘敲烂，工资过万");
    }

    public void show(){
        System.out.println(name + ',' + age);
    }
}
