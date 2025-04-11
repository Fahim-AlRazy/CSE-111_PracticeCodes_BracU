public class PolyTester {
  public static void main(String[] args) {
    //compile time
//    Vehicle v1 = new Vehicle();
//    v1.accelerate();
//    v1.accelerate(10);
//    v1.accelerate("slowly");
    Vehicle v3 = new Vehicle();
    Car c3 = new Car();
    Bike b3 = new Bike();
//    v3.start();
//    c3.start();
//    b3.start();
//    System.out.println(v3 instanceof Vehicle);
//    System.out.println(b3 instanceof Car);
//    System.out.println(b3 instanceof Bike);
    int x = 50;
    double d = x; //50.0, implicit type casting
    double d1 = 5.5;
    int x1 = (int)d1;
 //reference_type var = new Object();
    Vehicle v5 = new Car(); //upcasting
//    System.out.println(v5);
//    v5.start();
//    new Car();
//    Vehicle v6 = new Bike();
//    v6.start();
//    Car c8 = new Vehicle();
//    display(v3);
//    display(c3);
    display(b3);
    
  }
  public static void display(Vehicle v){ //Vehicle v = c3;   
    if(v instanceof Car){ 
      Car temp = (Car) v;
      temp.start();
      temp.lockDoors();
    }else if (v instanceof Bike){
      v.start();
    }
  }
}


