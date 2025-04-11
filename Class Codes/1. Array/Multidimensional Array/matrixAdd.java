import java.util.Arrays;
public class matrixAdd{
  public static void main(String [] args){
    int [][] matA = {{1,2,3},{4,5,6},{7,8,9}};
    int [][] matB = {{11,12,13},{14,15,16},{17,18,19}};
    if(matA.length != matB.length || matA[0].length != matB[0].length){
      System.out.println("Matrix addition is not possible");
    }
    else{
      int [][] res = new int [matA.length][matA[0].length];
      for(int i = 0; i < matA.length; i++){
        for (int j = 0; j < matA[0].length; j++){
          res[i][j] = matA[i][j] + matB[i][j];
        }
      }
      for(int i = 0; i < res.length; i++){
        System.out.println(Arrays.toString(res[i]));
      }
    }
  }
}