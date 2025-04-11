public class Course{
  public String name;
  public String code;
  public int credit;
  public void createCourse(String name , String code , int credit){
    this.name=name;
    this.code=code;
    this.credit=credit;
  }
  public void displayCourse(){
    System.out.println("Course Name: "+this.name+"\n Course Code: "+this.code+"\n Course Credit : "+this.credit);  
  }
  public void updateCourse(String name , String code , int credit){
    if(name.equals(this.name) || code.equals(this.code)){
      System.out.println("Course already exists no need to change ");
    }
    else{
      this.name=name;
      this.code=code;
      this.credit=credit;
    }
  }
}