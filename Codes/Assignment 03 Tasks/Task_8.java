import java.util.Scanner;
public class Task_8{
  public static void main(String[] args){
    Scanner i = new Scanner(System.in);
    System.out.print("Please Enter your 8 digit BRACU student id : ");
    int id = i.nextInt();
    int first_three,first_two , third ;
    first_three=id/100000;
    //year
    first_two=first_three/10;
    int year=first_two;
    
    //session
    third=first_three%10;
    String session="a";
    if(third == 1){
      session="Spring";
    }
    else if(third == 2){
      session="Fall";
    }
    else if(third == 3){
      session="Summer";
    }
    System.out.println("Student joined BRAC in "+session+" "+year);
  }
}