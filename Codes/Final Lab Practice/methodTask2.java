import java.util.Scanner;
public class methodTask2{
  public static double circleArea(int r){  // circle area
    double area= Math.PI*(r*r);
    return area;
  }
  public static double sphereVolume(int r){  // sphere volume
    double volume=(4/3d)*Math.PI*(r*r*r);
    return volume;
  }
  public static void findSpace(int diameter , String str){ //find space
    int r= diameter;            // ekhane diameter kei radius dhore nise question e mone hocche 
    if(str.equals("circle")){
      System.out.println("The area of the "+str+" is "+circleArea(r));
    }
    else if(str.equals("sphere")){
      System.out.println("The area of the "+str+" is "+sphereVolume(r));
    }
    else{
      System.out.println("Wrong parameter");
    }
  } 
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("                        part-A circle area Method  ------");
    System.out.print("Enter the radius of a circle : ");
    int radius= sc.nextInt();
    double area = circleArea(radius);
    System.out.printf("Area of the circle is %.4f",area);
    
    System.out.println(" ");  // line gap nitese na tai arekta disi 
    System.out.println(" ");
    System.out.println("                        part-B sphere volume Method  ------");
    System.out.print("Enter the radius of a sphere : ");
    int radius2= sc.nextInt();
    double volume= sphereVolume(radius2);
    System.out.printf("Volume of the sphere is %.4f",volume);
    
    System.out.println(" ");  // line gap nitese na tai arekta disi 
    System.out.println(" ");
    System.out.println("                        part-C find space Method  ------");
    
    System.out.print("Enter the shape : ");
    String shape= sc.next();
    
    System.out.print("Enter the radius of the "+shape+" : ");
    int radius3= sc.nextInt();
    
    findSpace(radius3,shape); 
  }
}