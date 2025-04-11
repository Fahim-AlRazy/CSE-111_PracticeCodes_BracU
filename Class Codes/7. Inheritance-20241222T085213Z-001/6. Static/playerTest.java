public class playerTest{
  public static void main(String [] args){
    System.out.println(Player.teamPoints);
    Player p1 = new Player("Harry");

    p1.addPoints(6);
    
    Player p2 = new Player("Hermione");
//    p2.addPoints(10);
    System.out.println(p1.points);
    System.out.println(p1.teamPoints);
    
    p2.addPoints(10);
    System.out.println(p2.points);
    System.out.println(Player.teamPoints);
    System.out.println(Player.count);
    Player p3 = new Player("Ron");
    System.out.println(Player.count);
    Player.showCount();
    
  }
}

