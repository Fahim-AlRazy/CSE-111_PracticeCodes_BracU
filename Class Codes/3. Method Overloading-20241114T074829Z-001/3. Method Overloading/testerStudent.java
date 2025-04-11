import java.util.Arrays;
public class testerStudent{
  public static void main(String [] args){
//    System.out.println(Arrays.toString(args));
    Student s1 = new Student();
    s1.name = "Bob";
    s1.id = "1001";
    s1.cgpa = 3.5;
    s1.dept = "CSE";
    s1.showDetails();
    System.out.println("==============");
//    s1.newDept = "EEE";
    System.out.println("s1 var: " + s1);
    s1.deptChange("MNS", "3001");

    System.out.println("==============");
    s1.showDetails();
//    int x = s1.calculateGPA(3.3, 3.7, 3.0, 4.0);
//    System.out.println();
    System.out.println(s1.calculateGPA(3.3, 3.7, 3.0, 4.0));
    s1.updateDetails("Alice");
    s1.updateDetails(3.7);
    s1.updateDetails("Trudy", 3.2);
    s1.updateDetails("Messi", 3.1);
    s1.showDetails();

  }
}
    