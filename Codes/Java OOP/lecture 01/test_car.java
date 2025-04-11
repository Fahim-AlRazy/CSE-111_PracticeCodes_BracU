public class test_car{
  public static void main(String[] args){
    car c1=new car(); // object creation 
    
    System.out.println(c1);
    System.out.println(c1.model);
    System.out.println(c1.color);
    System.out.println(c1.year);
    
    c1.model="premio";
    c1.color="white";
    c1.year=2010;
    
    System.out.println(c1.model);
    System.out.println(c1.color);
    System.out.println(c1.year);
    
    // another object
        car c2=new car(); // object creation 
     System.out.println(c2);
    System.out.println(c2.model);
    System.out.println(c2.color);
    System.out.println(c2.year);
    
    c2.model="Tesla Y";
    c2.color="black";
    c2.year=2023;
    System.out.println(c2.model);
    System.out.println(c2.color);
    System.out.println(c2.year);
    c1.year=2015;
        System.out.println(c1.year);
    
    
  }
}