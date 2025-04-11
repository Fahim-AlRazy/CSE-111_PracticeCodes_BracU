public class Vehicle{
  public String brand;
  public int wheels;
  public Vehicle(){
    System.out.println("No param const of Vehicle.");
  }
  public Vehicle(String br, int wh){
    brand = br;
    wheels = wh;
    System.out.println("2 param const of Vehicle.");
  }
  public void start(){
    System.out.println(brand + " is starting");
  }
  public void info(){
    System.out.println(brand+" has "+wheels+" wheels");
  }
}