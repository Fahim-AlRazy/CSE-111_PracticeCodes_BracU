public class assignment_12
{
  public static void main(String[] args)
  {
    /*
Write a Java program that displays the 2 rightmost digits of your student ID in reverse
order. For example, if your student id is 23221454, you need to print 4, and then 5.
[Hint: Use the logic you used in one of the tasks in lab 1]
Output:
4
5 
     */
       System.out.println("Actually my Student id is 24301544 , thus the last two digits are the same . so I am using the example value for this task  ");
    int id = 23221454 , res1 ,res2 ;
  System.out.println("Student ID is : "+id);
  res1= id%10;
   System.out.println(" ");
    System.out.println(" The 2 rightmost digits of the student ID in reverse order is : ");
   System.out.println(res1);
  id=id/10;
  
  res2=id%10;
  System.out.println(res2);
  }
}