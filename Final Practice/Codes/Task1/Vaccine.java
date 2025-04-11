public class Vaccine{
  private String vac ;
  private String made ;
  private int interval ;
  public Vaccine(){
  }
  public Vaccine(String nam , String md , int inter){
    vac=nam;
    made=md;
    interval=inter;
  }
  public String getVac(){
    return vac;
  }
  public int getInter(){
    return interval;
  }
}
class Person {
  public String name;
  public int age ;
  public String type ;
  public Vaccine vaccine_name ;
  public String taken;
  public String dose1 ;
  public String dose2 ;
  public int gap ; 
  public Person(String name , int age){
    this.name=name;
    this.age=age;
    type="General Citizen";
  }
  public Person(String name , int age , String type){
    this(name , age);
    this.type=type;
  }
  public void pushVaccine(Vaccine vac_name){
    if(!type.equals("Student") && age<25){
      System.out.println("Sorry "+name+", Minimum age for taking vaccines is 25 years now.");
    }
    else{
      vaccine_name=vac_name;
      taken=vac_name.getVac();
      dose1="Given";
      gap=vac_name.getInter();
      dose2="Please come after "+gap+" days";
      System.out.println("1st dose done for "+name);
    }
  }
  public void pushVaccine(Vaccine vac_name, String dose) {
    if (!type.equals("Student") && age < 25) {
      System.out.println("Sorry " + name + ", Minimum age for taking vaccines is 25 years now.");
    }
    else {
      if (vaccine_name != null && !vaccine_name.getVac().equals(vac_name.getVac())) {
        System.out.println("Sorry " + name + ", you can’t take 2 different vaccines");
      } 
      else if (dose.equals("1st Dose")) {
        if (dose1 != null) {
          System.out.println("Sorry " + name + ", you have already received the 1st dose");
        } 
        else {
          vaccine_name = vac_name;
          taken = vac_name.getVac();
          dose1 = "Given";
          gap = vac_name.getInter();
          dose2 = "Please come after " + gap + " days";
          System.out.println("1st dose done for " + name);
        }
      } 
      else if (dose.equals("2nd Dose")) {
        if (dose1 == null) {
          System.out.println("Sorry " + name + ", invalid dose request. You need to take the 1st dose first.");
        } 
        else if ("Given".equals(dose2)) {
          System.out.println("Sorry " + name + ", you already received both doses.");
        } 
        else {
          dose2 = "Given";
          System.out.println("2nd dose done for " + name);
        }
      }
    }
  }
  
  public void showDetail(){
    System.out.println("Name: "+name+" Age: "+age+" Type: "+type+" Vaccine name: "+taken+" \n1st dose: "+dose1+"\n2nd dose: "+dose2);
  }
}
