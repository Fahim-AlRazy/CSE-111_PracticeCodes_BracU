public class Player{
  public String name;
  public int age;
  public int matches;
  public Player rival;
  public Player(){
//    System.out.println("No param constructor");
  }
  public Player(String name, int age, int match){
    this.name = name;
    this.age = age;
    this.matches = match;
//    System.out.println("3 param constructor");
  }
  public void showDetails(){
    System.out.println(name+" " + age + " " + matches);
    //needs to change
  }
  public void addRival(Player rival){
    this.rival = rival;
  } 
  public void showRival(){
//    System.out.println("Rival's name: " + rival.name);
//    System.out.println("Rival's age: " + rival.age);
//    System.out.println("Rival's matches: " + rival.matches);
    System.out.println("Rival's info:");
    rival.showDetails();//needs to change
  }
  
}






