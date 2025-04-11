import java.util.Scanner;
import java.util.Arrays;
public class hello {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    /** System.out.print(" Enter row : ");
      int row = sc.nextInt();
      System.out.print(" Enter col : ");
      int col = sc.nextInt();  **/
    int arrA[][]= {{1,2,3},{4,5,6},{7,8,9}};
    int arrB[][]= {{10,20,30},{40,50,60},{70,80,90}};
    int res[][]=new int[arrA.length][arrB[0].length];
    for(int i=0;i<arrA.length;i++){
      for(int j=0;j<arrA[i].length;j++){
        for(int k=0;k<arrA.length;k++){
          res[i][j]+=arrA[i][k]*arrB[k][j];
        }
      }
    }
    
    for(int i=0;i<res.length;i++){
      for(int j=0;j<res[0].length;j++){    
        System.out.print(" "+res[i][j]);
      }
      System.out.println();
    }
    
    System.out.println();
    System.out.println();
    System.out.println();

  
  
  for(int i=0;i<res.length;i++){
    System.out.println(Arrays.toString(res[i]));  //Arrays.toString(arr)
  }  
  
//    int arr[][]= new int[row][col]
}
}