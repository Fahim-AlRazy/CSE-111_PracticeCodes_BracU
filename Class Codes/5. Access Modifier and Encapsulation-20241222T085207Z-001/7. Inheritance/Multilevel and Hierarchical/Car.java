public class Car extends Vehicle{
  public boolean ac;
  public Car(){
    super();
  }
  public Car(String br, int wh){
    super();
    brand = br;
    wheels = wh;
//    super();
  }
  public Car(String br, int wh, boolean ac){
    super(br, wh);
    this.ac = ac;
    System.out.println("3 param const of Car.");
  }
  public void showAC(){
    System.out.println("AC status: " + ac);
  }
  public void info(){
//    System.out.println(brand+" has "+wheels+" wheels");
    super.info();
    System.out.println("AC status: " + ac);
//    super.info();
  }
}




