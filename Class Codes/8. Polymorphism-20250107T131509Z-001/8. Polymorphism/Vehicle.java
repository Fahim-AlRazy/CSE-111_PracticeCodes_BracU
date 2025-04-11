public class Vehicle {
  public void start(){
    System.out.println("Start the vehicle");
  }
  public void accelerate(){
    System.out.println("Vehicle is accelerating");
  }
  public void accelerate(int a){
    System.out.println("Vehicle is accelerating at " + a + "m/s^2");
  }
  public void accelerate(String word){
    System.out.println("Vehicle is accelerating " + word);
  }
}

class Car extends Vehicle {

  public void start(){
    System.out.println("Insert keys and press on brake");
  }
  public void lockDoors(){
    System.out.println("Doors locked");
  }
}

class Bike extends Vehicle{
  public void start(){
    System.out.println("Insert keys and kick to start");
  }
}