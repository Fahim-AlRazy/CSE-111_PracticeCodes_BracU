import java.util.Scanner;   
public class ticket_solve
{    
  public static void main(String[] args)
  {  Scanner sc = new Scanner(System.in);
    int i= 12;
    while(i<13)    {   
      System.out.println("Enter your age please");  
      int age = sc.nextInt(); 
      
      if (age<13 && age>0)
      {  
        System.out.println("Please enter the number of mentioned days:");
        System.out.println("1.Sunday \n 2.Monday \n 3.Tuesday \n 4.Wednesday \n 5.Thursday \n 6.Friday \n 7.Saturday");
        int day = sc.nextInt();
        if(day==7 || day==1 )
        { 
          System.out.println("You need to pay Rs.120.Thank you!!");
          break;
        }
        else{        
          System.out.println("You need to pay Rs.100.Thank you!!");
          break;
        }
        
      }
      else{ 
        System.out.println("Invalid age!!");  
        
        
      }
    }
    
  }
}