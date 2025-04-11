public class assignment_3
{
  public static void main(String[] args)
  {
      /*
3. Write Java code that calculates and prints the circumference and area of a circle with a
radius of 4 units. 
     */
  
  int radius = 4 ;
    
  System.out.println(" ");
    
  float circumference= 2*3.1416f*radius ;
  float area=3.1416f*radius*radius ;
  
  System.out.print("circumference hoilo : ");
  System.out.printf( "%.4f \n",circumference);
  
  System.out.println(" ");
  
  System.out.print("Area hoilo : ");
  System.out.println(area);
  
  }
}