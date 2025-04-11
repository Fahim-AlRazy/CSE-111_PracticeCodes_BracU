import java.util.Scanner;
public class methodTask5{
  public static double calcTax(int age , int salary){  //  calcTax
    double tax=0.0;
    if(age>=18){
      if(salary>=10000){
        if(salary>20000){
          tax=salary*(14/100d);
        }
        else{
          tax=salary*(7/100d);
        }
      }
    }
    return tax;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your age :");
    int age=sc.nextInt();
    System.out.print("Enter your salary :");
    int salary=sc.nextInt();
    double t=calcTax(age,salary);
    System.out.printf("Your tax amount is : %.0f",t);
  }
}