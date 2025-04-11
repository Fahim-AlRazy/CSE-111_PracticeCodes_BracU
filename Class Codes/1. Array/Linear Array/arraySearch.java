import java.util.Scanner;
public class arraySearch{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int [] arr = {24,55,31,6,10,31};
    //swapping
//    arr[0] -> arr[2], arr[2] -> arr[0]
    int temp = arr[0];
    arr[0] = arr[2];
    arr[2] = temp;
    
    
    int value = sc.nextInt();
    boolean found = false;
    for(int i = 0; i < arr.length; i++){
      if(value == arr[i]){
        found = true;
      }
    }
    if(found == true){
      System.out.println("Found");
    }
    else{
      System.out.println("Not Found");
    }
    
  }
}