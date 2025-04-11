public class Player{
  public String name;
  public int id;
  public int points;
  
  public static int teamPoints;
  public static int count;
  
  public Player(String n){
    name = n;
    Player.count++;
    this.id  = Player.count;
  }
  public void addPoints(int points){
    int x = 0;
    this.points += points;
    Player.teamPoints += points;
    this.teamPoints += points;
  }
  public static void showCount(){
    int x = 0;
//    System.out.println(id);
    System.out.println(count);
  }
}




