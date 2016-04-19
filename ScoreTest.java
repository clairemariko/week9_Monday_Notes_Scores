
public class ScoreTest{

  public static void main(String[] args){
    int[] myScores = {4,5,6,7,8,5,4};
    Score score = new Score(myScores);

    int max = score.findMaxScore();
    System.out.println(max);
  }

}