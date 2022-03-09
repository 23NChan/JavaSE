package Case.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber(){
    }

    public static void start(){

        Random r =new Random();
        int number = r.nextInt(100)+1;

        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入你要踩的数字：");
            int guessNumber = sc.nextInt();

            if(guessNumber >number){
                System.out.println("你猜的数字是: "+guessNumber+"大了");
            }else if (guessNumber < number){
                System.out.println("你猜的数字是"+guessNumber+"小了");
            }else{
                System.out.println("猜中了！");
                break;
            }
        }
    }
}
