package Office;
public class TesterX{
  public static void main(String [] args) {
    Employee emp = new Employee("Leo", 10,5000.5, "HR");
//    System.out.println(emp.name);
//    System.out.println(emp.employeeID);
//    System.out.println(emp.salary);
//    System.out.println(emp.department);
//    emp.employeeID = -55;
    emp.showDetails();
    emp.setID(20);
//    emp.showDetails();
    System.out.println(emp.getID());
//    emp.history();
    emp.helperMethod();
  }
}
