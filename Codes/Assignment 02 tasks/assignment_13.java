public class assignment_13
{
  public static void main(String[] args)
  {
    /*
13. You have been traveling on a bike for 5 hours, 56 minutes, and 23 seconds. Assuming
the distance covered is (Last 4 digits of your student ID) meter. Write a Java code to
display the velocity of your bike in kilometers per hour and miles per hour.
[Hint: 1 mile = 1609 meters]
Test Data:
Input distance in meters: 2500 // Assuming the last 4 digits are 2500
Expected Output:
Your velocity in km/h is 0.4208951
Your velocity in miles/h is 0.2615880
     */
    System.out.println("                                             test data");
     System.out.println(" ");
     
    double test_d=2500d;
      System.out.println("Distance covered is :"+test_d +" meter");
      double hour=5d, min=(56/60d),sec=(23/60/60d);
    double test_t = hour+min+sec ;
      System.out.println("Total travelling time :"+test_t +" hour");
           System.out.println(" ");
      double test_km_hour =(test_d/1000)/test_t;
       System.out.println("velocity in km/h is : "+test_km_hour);        
    double test_miles_hour =(test_d/1609)/test_t;
       System.out.println("velocity in mile/h is : "+test_miles_hour); 
    
        System.out.println(" ");
      
        System.out.println("                                          my data");
         System.out.println(" ");
   
        double d=1544d;
  System.out.println("Distance covered is :"+d +" meter");
  double t = (5+56/60d+23/60/60d) ;
      System.out.println("Total travelling time :"+t +" hour");
          
      System.out.println(" ");
      
      double km_hour =(d/1000)/t;
       System.out.println("velocity in km/h is : "+km_hour);        
    double miles_hour =(d/1609)/t;
       System.out.println("velocity in mile/h is : "+miles_hour); 
  
    
  
  }
}