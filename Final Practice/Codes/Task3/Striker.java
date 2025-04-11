public class Striker extends Football{
  public int goal;
  public int shot;
  public Striker(String name , int age , int stamina , int goal , int shot){
    super(name,age,stamina);
    this.goal=goal;
    this.shot=shot;
  }
  public void display(){
    super.display();
    System.out.println("Goals : "+goal+"\nShot on target : "+shot);
  }
  public void calculatePerformance(){
    System.out.println("Performance : "+ (((double)goal/shot)));
  }
}
class Defender extends Football{
  public int tackle;
  public int intercept;
  public Defender(String name , int age , int stamina , int tackle , int intercept){
    super(name,age,stamina);
    this.tackle=tackle;
    this.intercept=intercept;
  }
  public void display(){
    super.display();
    System.out.println("Tackles: "+tackle+"\nInterceptions: "+intercept);
  }
  public void calculatePerformance(){
    System.out.println("Performance : "+ (((double)intercept/tackle)));
  }
}