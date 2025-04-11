public class Mango extends Fruit{
  public String condition;
  public Mango(){
    super(true, "Mango");
    if(super.hasFormalin()){
      condition="bad";
    }
    else{
      condition="good";
    }
  }
  public String toString(){
    return super.getName()+"s are "+condition+" for you ";
  }
}
class Jackfruit extends Fruit{
  public String condition;
  public Jackfruit(){
    super(false, "Jackfruit");
    if(super.hasFormalin()){
      condition="bad";
    }
    else{
      condition="good";
    }
  }
  public String toString(){
    return super.getName()+"s are "+condition+" for you ";
  }
}