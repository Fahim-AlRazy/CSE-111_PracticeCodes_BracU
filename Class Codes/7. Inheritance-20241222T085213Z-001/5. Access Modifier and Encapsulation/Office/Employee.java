package Office;
public class Employee{
  
  public String name ;   // public access modifier
  private int employeeID ;  // private access modifier
  protected double salary ; // protected access modifier
  String department ;   // default access modifier
  
  public Employee(String n, int id, double sal, String dept){
    name = n;
    employeeID = id;
    salary = sal;
    department = dept;
  }
  public void setID(int id){
    if(id < 0){
      System.out.println("Invalid id");
    }
    else{
      employeeID = id;
    }
  }
  public int getID(){
    return employeeID;
  }
  public void showDetails(){
    System.out.println("Name: " + name);
    System.out.println("ID: " + employeeID);
    System.out.println("Salary: " + salary);
    System.out.println("Department: " + department);
  }
  private void history(){
    System.out.println("History shown");
  }
  public void helperMethod(){
    System.out.println("inside helper method");
    history();    
  }
  public double getSalary(){
    return salary;
  }
}










