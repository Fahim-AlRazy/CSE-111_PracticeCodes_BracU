public class playerTest{
  public static void main(String [] args){
    Player p1 = new Player("Sakep", 37, 200);
    p1.showDetails();
    System.out.println(p1);
//    Player p2 = new Player();
//    p2.showDetails();
//    Player p3 = new Player("ABC", 20);
//    p3.showDetails();
    p1 = new Player();
    p1.showDetails();
    System.out.println(p1);
    
  }
}