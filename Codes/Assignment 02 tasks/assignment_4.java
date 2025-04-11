public class assignment_4
{
  public static void main(String[] args)
  {
    /*
4. Write a Java code where given an integer we need to print the last 2 digits of that number
     */
    
    int a = 1234 ;
      System.out.println("The number is : " + a );
      int last = a % 100 ;
      System.out.print("The last 2 digit is : " + last  );
  
  }
}