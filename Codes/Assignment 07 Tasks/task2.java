import java.util.Scanner;
public class task2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr [] = {9, -5, 7, 9, -5, 5, 7};  // given array
    System.out.println("Before resolving the duplicates : ");
    for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    int count =0;
    for(int i =0;i<arr.length;i++){
      for(int j =0;j<arr.length;j++){
        if(arr[i]==arr[j]){
          count++;
          if(count>1){
            arr[j]=0;
          }
        }
      }
      count=0;
    }
    System.out.println();
    System.out.println("After resolving the duplicates with 0 ");
    for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    
  }
}