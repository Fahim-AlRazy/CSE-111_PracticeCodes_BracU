import java.util.Scanner ;
public class Task_1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter first integer number");
    int a = in.nextInt();
    System.out.println(" ");
    System.out.println("Enter second integer number");
    int b = in.nextInt();
    System.out.println(" ");
    System.out.println("Enter third integer number");
    int c = in.nextInt();
    System.out.println(" ");
    
    if(a>b)
    {
      if(a>c){
        System.out.println("largest number is : "+a);
      }
      else
      {
        System.out.println("largest number is : "+c);
      }
    }
    else
    {
      if(b>c)
      {
        System.out.println("largest number is : "+b);
      }
      else
      {
        System.out.println("largest number is : "+c);
      }
    }
    
    
  }
}