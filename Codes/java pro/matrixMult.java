import java.util.Arrays;
public class matrixMult{
  public static void main(String [] args){
    int [][] matA = {{1,2,3},{4,5,6}};
    int [][] matB = {{7,8},{9,10},{11,12}};
    if(matA[0].length != matB.length){
      System.out.println("Matrix multiplication is not possible");
    }
    else{
      int [][] res = new int[matA.length][matB[0].length];
      for (int i = 0; i < matA.length; i++){ //matA row index fix
        for (int j = 0; j < matB[0].length; j++){ //matB col index fix
          for(int k = 0; k < matA[0].length; k++){
            res[i][j] += matA[i][k] * matB[k][j];
          }
        }
      }
      for(int i = 0; i < res.length; i++){
        System.out.println(Arrays.toString(res[i]));
      }
    }
  }
}