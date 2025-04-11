public class testerStudent{
  public static void main(String [] args){
    Student s1 = new Student();
    s1.name = "Bob";
    s1.id = "1001";
    s1.cgpa = 3.5;
    s1.dept = "CSE";
    s1.showDetails();
//    System.out.println("Name: " + s1.name);
//    System.out.println("ID: " + s1.id);
//    System.out.println("CGPA: " + s1.cgpa);
//    System.out.println("Department: " + s1.dept);
    s1.cgpa = 3.6;
    s1.dept = "CS";
    s1.id = "2001";
//    System.out.println("Name: " + s1.name);
//    System.out.println("ID: " + s1.id);
//    System.out.println("CGPA: " + s1.cgpa);
//    System.out.println("Department: " + s1.dept);
  }
}
    