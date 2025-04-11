public class Student{
  public String name;
  public String id;
  public double cgpa;
  public String dept;
  
  public void showDetails(){
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("CGPA: " + cgpa);
    System.out.println("Department: " + dept);
  }
  public void deptChange(String dp, String id){
    int x = 0;
    if( dept.equals(dp)){
      System.out.println("Already in " + dept);
    }
    else{
      dept = dp;
      this.id = id;
      System.out.println("this keyword: " + this);
      System.out.println("Department changed to "+dept);
    }
  }
  public double calculateGPA(double g1,double g2,double g3,double g4){
    System.out.println("Calculating GPA: ");
    double gpa = (g1+g2+g3+g4)/4;
    return;
//    return 155/54;
//    System.out.println("method done");
  }
                                                                    
                                                                    
  
  
}








