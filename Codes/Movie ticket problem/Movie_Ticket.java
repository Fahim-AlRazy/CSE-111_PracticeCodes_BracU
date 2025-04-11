import java.util.Scanner;
public class Movie_Ticket
{
  public static void main(String[] args)
  {
  Scanner in= new Scanner(System.in);
  System.out.println("                                Movie Ticket");
  System.out.println("");
  System.out.println("");
  System.out.print("Please Enter your age : ");
  int age= in.nextInt();
  
  if(age<=0 || age >120)
  {
    System.out.println("invalid age!!");
  }
  else
  {
  System.out.println("");
  System.out.println("             What day is it ?");
  System.out.println("1.Sunday");
  System.out.println("2.Monday");
  System.out.println("3.Tuesday");
  System.out.println("4.wednessday");
  System.out.println("5.Thursday");
  System.out.println("6.Friday");
  System.out.println("7.Saturday");
  System.out.print("Please make a selection : ");
  int day= in.nextInt();
    if(day<1 || day >7)
  {
    System.out.println("invalid selection!!");
  }
  else
  {
  System.out.println("");
  if(age<13)      //children
  {
      if(day==6 || day==7)
      {
         System.out.println("Today is a weekend!!!");
         System.out.println("Your Ticket Price is : Rs.120 ");
      }
      else
      {
        System.out.println("Today is a weekday!!!");
        System.out.println("Your Ticket Price is : Rs.100 ");
      }
  }
  else if(age>=13 && age<=64)    //Adults
  {
     if(day==6 || day==7)
      {
         System.out.println("Today is a weekend!!!");
         System.out.println("Your Ticket Price is : Rs.180 ");
      }
      else
      {
        System.out.println("Today is a weekday!!!");
        System.out.println("Your Ticket Price is : Rs.150 ");
      }
  
  }
  else if(age>=65)    //Seniors
  {
        if(day==6 || day==7)
      {
         System.out.println("Today is a weekend!!!");
         System.out.println("Your Ticket Price is : Rs.150 ");
      }
      else
      {
        System.out.println("Today is a weekday!!!");
        System.out.println("Your Ticket Price is : Rs.130 ");
      }
  }
  System.out.println("Thank you ");
  }
  }
  }
}    