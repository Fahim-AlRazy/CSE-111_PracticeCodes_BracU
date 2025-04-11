import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N : ");
    int n = sc.nextInt();
    int[] arr1= new int[n]; 
    for(int i =0;i<n;i++){
      System.out.print("Enter a number : ");
      arr1[i] = sc.nextInt();
    }
    System.out.print("What do you want to search : ");
    int search= sc.nextInt();
    boolean flag = false;
    int i=0;
    while(i<n){
      if(arr1[i]==search){
        flag=true;
        break;
      }
      i++;
    }
    if(flag){
      System.out.println(search+" is at index "+i);
    }
    else{
      System.out.println("Element not found ");
    }
  }
}