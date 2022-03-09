package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();

        //用循环完成再次回到主界面
        while (true) {

            //用输出语句完成主界面的编写
            System.out.println("欢迎来到学学生管理系统");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所以学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择");

            //使用Scanner实现键盘录入
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //使用switch语句完成操作的选择
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    //System.out.println("删除学生");
                    break;
                case "3":
                    updateStudent(array);
                    //System.out.println("修改学生");
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0); //jvm退出

            }
        }
    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生学号");
        String sid = sc.nextLine();

        //判断学号是否重复
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                System.out.println("学号以存在");
                return;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中
        array.add(s);

        //给出添加成功提示
        System.out.println("添加学生成功");
    }

    //定义一个方法，用于查看所有学生
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息请先添加信息再查询");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");

        //将集合中数据取出按照对应格式显示出学生信息，年龄显示补充“岁
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }

    //定义一个方法，用于删除学生
    public static void deleteStudent(ArrayList<Student> array) {
        int index = -1;
        //键盘录入要删除的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的学生的学号");
        String sid = sc.nextLine();

        //便利集合将对应学生对象从集合中删除
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                //array.remove(i);
                break;
            }

        }

        if (index == -1) {
            System.out.println("该信息不存在");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }
        //给出删除成功提示
        //System.out.println("删除学生成功");


    }

    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        int index = -1;
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改的学生学号");
        String sid = sc.nextLine();

        //遍历学生信息查看学号是否存在
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            //键盘录入要修改的学生信息
            System.out.println("请输入学生新姓名");
            String name = sc.nextLine();
            System.out.println("请输入学生新年龄");
            String age = sc.nextLine();
            System.out.println("请输入学生新居住地");
            String address = sc.nextLine();

            //创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAddress(address);
            s.setAge(age);

            array.set(index, s);

            //给出修改成功的提示
            System.out.println("修改学生成功");
        } else {
            System.out.println("学号不存在");
        }
    }
}
