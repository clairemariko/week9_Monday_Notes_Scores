
//creating an array. if we dont define the length of an array it will default as one element so we have defined it will have 10.arrays are primitive data type so we dont have to say new. 

public class Score {

int[] scores;

  public Score(){
    scores = new int[3];
    scores[0] =  2;
    scores[1] =  5;
    scores[2] =  7;
    //to set up a default array use {2,3,4,5,6};
  }

  public Score(int[] scores){
    this.scores = new int[scores.length];
    for (int i = 0; i<scores.length; i++) {
      this.scores[i] = scores[i];
    }
  }

  public int findMaxScore() {
    int max = scores[0];
    // for (int i = 0; i<scores.length; i++){
    for( int i: scores){   //an enhanced loop
      if (i > max) {
            max = i;
      }
    }
    return max;
  }


  public int findMaxScore() {
    int max = scores[0];
    for (int i = 0; i<scores.length; i++){

      if (scores[i] > max) {
            max = scores[i];
      }
    }
    return max;
  }

}