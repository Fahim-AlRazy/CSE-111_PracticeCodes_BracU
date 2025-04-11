import java.util.Scanner;
import java.util.Arrays;
public class twoD_Creation{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
//    int [][] twoD = {{1,2,3},
//                     {4,5,6,10},
//                     {7,8,9}
//    };
//    for(int i = 0; i < twoD.length; i++){
//      for(int j = 0; j < twoD[i].length ; j++){
//        System.out.print(twoD[i][j] + " ");
//      }
//      System.out.println();
//    }
    int row = sc.nextInt();
    int col = sc.nextInt();
    int [][] arr2d = new int [row][col];
    System.out.println("Enter values:" );
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        arr2d[i][j] = sc.nextInt();
      }
    }
    System.out.println(Arrays.toString(arr2d));
    System.out.println(Arrays.toString(arr2d[0]));
    for(int i = 0; i < arr2d.length; i++){
      System.out.println(Arrays.toString(arr2d[i]));
    }
  }
}



