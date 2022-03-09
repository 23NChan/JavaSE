package customDemo;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkSocre(score);
        } catch (ScoreExcepthion scoreExcepthion) {
            scoreExcepthion.printStackTrace();
        }
    }
}
