public class assignment_14
{
  public static void main(String[] args)
  {
    /*
14. Assume a Hexagon where each of the sides are of the same length. From the
visualization, we can see the values of a and b are given. Your task is to write a Java code
to find the area and the circumference of the Hexagon.
     */
  System.out.println("                                       Area and Circumference of the Hexagon");
  System.out.println(" ");
  int a=8/2, b=3;
  double c=Math.sqrt((a*a)+(b*b));
      System.out.println("So the length of each sides are :"+c);
      double circumference=6*c;
       
      System.out.println(" ");
       System.out.println("The circumference of the hexagon is :"+circumference);
       System.out.println(" ");
       
       System.out.println("For the area we will use the formula (3?3)/2*(c*c)");
       double area=(3*Math.sqrt(3))/2*(c*c);
                System.out.println("The area of the hexagon is :"+area);
                
                
                /*
                 another way 
                 
                 by dividing the hexagon into 4 triangles and 1 rectangle
                 so area = 4*triangle_area + rectangle_area
                 = 4*(1/2 * 3 * 4) + 8 *5 = 64 
                 
                 but the answers are not same 
                 
                 */
         
       
  
  }
}