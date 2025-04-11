import java.util.Scanner;
public class Task_10{
  public static void main(String[] args){
    Scanner i = new Scanner(System.in);
    System.out.print("Please Enter 3 float numbers : ");
    float a =i.nextFloat() , b = i.nextFloat() ,c = i.nextFloat() ;
      float max = a , min = a ;
        if(a>b && b>c){
     max = a  ;
    }
    else if(b>c && c>a){
     max = b  ;
    }
      else {
      max = c  ;
    }
        if(a<b && b<c){
      min = a ;
    }
        else if(b<a && a<c){
      min = b ;
    }
    else {
      min = c ;
      }    
         System.out.println("Maximum number is "+max +" \n Minimum number is " +min); 
  }
}