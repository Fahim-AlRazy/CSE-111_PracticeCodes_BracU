public class assignment_10
{
  public static void main(String[] args)
  {
    /*
10. Write the Java code of a program that finds the sum of the first 100 positive numbers.
[Do NOT use loops, use the mathematical formula for calculating sum of arithmetic
series given below].
Note:
S = n?2 (a + L), where n is the number of terms, a is the first term and L is the last term.
     */
  System.out.println(" sum of the first 100 positive numbers");
  int n= 100 , a= 1 , L=100 , S;
  
  S = n/2 *(a+L);
  System.out.println(" The result is : " + S);
  }
}