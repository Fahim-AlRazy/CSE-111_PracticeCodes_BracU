import java.util.Scanner;
public class arrayTask10{
  public static double convertToCm(double inch){ // convert to inch 
    double cm=inch*2.54;
    return cm;
  }
  public static double findAvgCm(double x[]){   //   findAvgCm
    double sum=0.0;
    for(int i=0;i<5;i++){
      sum+=convertToCm(x[i]);
    }
    double avg=sum/5d;
    return avg;
  }
  public static void main(String[] args){
    System.out.println("                            part-A  convertToCm  ");
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter inch : ");
    double inch = sc.nextDouble();
    double t = convertToCm(inch);
    System.out.println(t+" cm");
    
    System.out.print(" ");
    System.out.println("                            part-B  findAvgCm  ");
    double [] cheetos_inches = new double[5];
    System.out.print("Enter the length of the cheetos : ");
    for(int i=0;i<5;i++){
      cheetos_inches[i]=sc.nextDouble();
    }
    double averageLength = findAvgCm(cheetos_inches); 
    System.out.printf("The average Cheeto length is %.2f",averageLength," cm"); 
    System.out.print(" ");
    
  }
}