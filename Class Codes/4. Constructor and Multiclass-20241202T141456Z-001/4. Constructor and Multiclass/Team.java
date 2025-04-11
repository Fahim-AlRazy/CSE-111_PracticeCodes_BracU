import java.util.Arrays;
public class Team{
  public String name;
  public Player [] pList = new Player[4];
  public int count;
  public Team(String name){
    this.name = name;
  }
  public Team(){
  }
  public void addPlayer(Player p){
    //if condition
    pList[count] = p;
    count++;
    
  }
  public void printDetails(){
    //name
    System.out.println("List of players:");
//    System.out.println(Arrays.toString(pList));
    for(int i = 0; i<pList.length; i++){
      //if 
      System.out.println(pList[i].name);
    }
  }
}





