import java.util.Scanner;
public class task7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the height of an isosceles triangle : ");
    int line= sc.nextInt();
    
    for(int row=1;row<=line;row++){ // rows declared  
      
      for(int gap=line-1;gap>=row;gap-- ){ // printing gaps
        System.out.print("    ");     //  4 ta space disi naile allignment mile na baka hoye jay 
      }
      for(int col=1;col<=(row+row-1);col++){
        System.out.print(" "+col+" ");   // qs e dekhsi duita number er majhe gap ase tai aage pore gap disi 
      } 
      System.out.println(); //   qs e kono extra line gap nai amar chokher dekha onujaye 
    } // outer close
  }
}