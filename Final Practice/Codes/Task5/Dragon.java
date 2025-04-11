public class Dragon extends MagicalCreature{
  public int lvl;
  public Dragon(String name , int age , int lvl){
    super(name,age);
    this.lvl=lvl;
  }
  public void makeSound(){
    System.out.println(name+" roars with a fiery breath! ");
  }
  public void performMagic(){
    System.out.println(name+" breathes fire with power level: "+lvl);
  }
  public void fly(){
    System.out.println(name+" flies through the sky.");
  }
}
class Phoenix extends MagicalCreature{
  public int rebirth;
  public Phoenix(String name , int age , int rebirth){
    super(name,age);
    this.rebirth=rebirth;
  }
  public void makeSound(){
    System.out.println(name+" sings an enchanting song. ");
  }
  public void performMagic(){
    System.out.println(name+" is reborn with "+rebirth+" rebirth cycles. ");
  }
  public void regenerate(){
    System.out.println(name+" regenerates its body in a burst of flames .");
  }
  
}
