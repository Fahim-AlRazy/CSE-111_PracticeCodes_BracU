public class Train extends Vehicle{
  public int coach;
  public Train(String b, int wh, int coach){
    super(b, wh);
    this.coach = coach;
    System.out.println("3 param const of Train.");
  }
  public void addCoach(int c){
    coach += c;
  }
  public void info(){
    super.info();
    System.out.println("Number of coaches: "+ coach);
  }
  
}