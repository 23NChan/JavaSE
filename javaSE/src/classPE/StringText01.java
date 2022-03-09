package classPE;

import java.util.Scanner;

public class StringText01 {
    public static void main(String[] args) {
        String username = "23NChan";
        String password = "23nianchan";

        Scanner sc = new Scanner(System.in);

        for(int i = 2;i>=0;i--) {
            System.out.println("请输入用户名");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String pwd = sc.nextLine();


            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功");

            } else {
                System.out.println("登录失败，你还有" + i + "次机会");

            }
        }
    }
}
