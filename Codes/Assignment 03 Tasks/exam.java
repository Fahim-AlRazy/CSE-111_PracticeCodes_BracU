import java.util.Scanner;
public class exam{
  public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  
  System.out.println("Enter x move");
  int move_x= in.nextInt();
   System.out.println("Enter y move");
  int move_y= in.nextInt();
  
  int x= -2 , y= -4;
  int now_x= x+move_x , now_y=y+move_y;
  System.out.println( "Cordinate is : ( " + now_x  + " , " + now_y+ ")" );
  if(now_x>0 && now_y>0){
   System.out.println("1st quardant");
  }
  else if(now_x<0 && now_y<0){
    System.out.println("3rt quardant");
  }
  else if(now_x>0 && now_y<0){
    System.out.println("4th quardant");
  }
  else if(now_x<0 && now_y>0){
    System.out.println("2nd quardant");
  }
  else if(now_x==0 && now_y!=0){
    System.out.println("Y axis");
  }
  else if(now_x!=0 && now_y==0){
    System.out.println("X axis");
  }
  else if(now_x==0 && now_y==0){
    System.out.println("Origin");
  }
  
  }
}