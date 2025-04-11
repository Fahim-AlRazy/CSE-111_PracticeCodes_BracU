public class assignment_8
{
  public static void main(String[] args)
  {
    /*
8. Suppose, you have three integer variables: a, b, c. Your first task is to assign the values 2,
5, 8 in these three variables. Next, you need to calculate and display the value of variable
d using the following formula:
Write a Java program based on this mentioned scenario that prints the value of d after
calculation. [Answer: 27]
     */
    int a=2 , b= 5 , c=8 ,d ;
  System.out.println("The value of a is : " +a );
    System.out.println("The value of b is : " +b );
      System.out.println("The value of c is : " +c );
  
      d=( (2*b)*( (c-a) / 3 )+7);
      System.out.println("The value of d is : " +d );
  }
}