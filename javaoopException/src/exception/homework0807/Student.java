package exception.homework0807;

public class Student {
    private int score;
    public void setScore(int score) throws ScoreException {
        if(score>0 &&score<=100){
            this.score = score;
        }else{
            this.score=60;
            throw new ScoreException("分数在0-100之间");
        }
    }
}
