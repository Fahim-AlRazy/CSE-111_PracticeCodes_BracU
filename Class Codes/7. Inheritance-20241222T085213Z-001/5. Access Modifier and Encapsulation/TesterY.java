import Office.*;
public class TesterY{
  public static void main(String [] args) {
    Employee emp = new Employee("Cris", 7,200.6, "Accounting");
//    System.out.println(emp.name);
//    System.out.println(emp.employeeID);
    System.out.println(emp.salary);
//    System.out.println(emp.department);
    
//    emp.showDetails();
    double tax = emp.getSalary() * 0.1;
  }
}
