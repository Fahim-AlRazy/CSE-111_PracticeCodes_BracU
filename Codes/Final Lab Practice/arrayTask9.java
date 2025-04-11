public class arrayTask9{
  public static int getScores(char x){
    int score=0;
    if(x=='A'){
      score=100;
    }
    else if(x=='B'){
      score=90;
    }
    else if(x=='C'){
      score=70;
    }
    return score;
  }
  public static void main(String[] args){
    char[] studentGrades = new char[]{'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
    int[] studentScores = new int[studentGrades.length]; 
    for(int i=0;i<studentGrades.length;i++){
      studentScores[i]=getScores(studentGrades[i]);
    }
    
    System.out.println("Output expectation : ");
    for(int i=0;i<studentScores.length;i++){
      System.out.println(studentScores[i]);
    }
  }
}