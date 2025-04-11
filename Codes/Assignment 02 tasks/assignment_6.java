public class assignment_6
{
  public static void main(String[] args)
  {
    /*
6. Write a Java program declaring two integer variables and initializing them. Your task is to
swap the values of these two variables. You must complete it using two different
approaches.
a. By Creating a third variable.
b. Without creating any other variables.
     */
  System.out.println("                                    part a // By Creating a third variable ");
  System.out.println(" ");
    int a =5 , b=10 , c ;
    System.out.println(" value of a is : "+ a);
    System.out.println(" value of b is : "+ b);
    System.out.println(" ");
    c=a;
  a=b;
  b=c;
  
   System.out.println("now the value of a is : "+ a);
   
   System.out.println("now the value of b is : "+ b);
 
   System.out.println(" ");
 
     System.out.println("                                    part b // Without creating any other variables. ");
 
   System.out.println(" ");
    
     int _a = 5 , _b = 10 ;
     System.out.println(" value of a is : "+ _a);
    System.out.println(" value of b is : "+ _b);
    System.out.println(" ");
     
    _a= _a + _b;
    _b= _a - _b;
    _a= _a - _b;
     
      System.out.println("now the value of a is : "+ _a);
   
   System.out.println("now the value of b is : "+ _b);
   
  }
}