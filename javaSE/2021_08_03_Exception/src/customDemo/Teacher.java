package customDemo;

public class Teacher {

    public void checkSocre(int score) throws ScoreExcepthion{
        if (score < 0 || score > 100){
            throw new ScoreExcepthion("你给的分数有误，分数应该在0到100之间");
        } else {
            System.out.println("分数正常");
        }
    }
}
