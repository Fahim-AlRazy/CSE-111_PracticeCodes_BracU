public class assignment_7
{
  public static void main(String[] args)
  {
    /*
7. Write a Java program to convert minutes into years and days. For simplicity, assume each
year consists of 365 days.
Test Data:
Given the number of minutes: 3456789
Expected Output:
3456789 minutes is approximately 6 years and 210 days
     */
   int m= 3456789 ;
  System.out.println("The given number of minutes is : " +m );
  int year =  m / 60 / 24 / 365  , day =  m / 60 / 24  ;
    System.out.println("The number of year is : " + year );
        System.out.println("The number of day is : " + day );
  
  }
}