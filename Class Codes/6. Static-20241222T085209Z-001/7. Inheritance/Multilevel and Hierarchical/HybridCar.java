public class HybridCar extends Car{
  public int batteryCap;
  
  public HybridCar(String b, int wh, boolean ac, int cap){
    super(b,wh,ac);
    batteryCap = cap;
    System.out.println("4 param const of HybridCar.");
  }
  public void info(){
    super.info();
    System.out.println("Battery Capacity: " + batteryCap);
  }
  
  
  
}