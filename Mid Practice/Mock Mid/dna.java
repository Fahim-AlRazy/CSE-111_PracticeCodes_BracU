import java.util.Scanner;
public class dna{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the DNA Sequence");
    String inpt=sc.nextLine();
    boolean error=true;
    for(int i=0;i<inpt.length();i++){
      if(inpt.charAt(0)!='-'){
        continue;
      }
      if(inpt.charAt(0)=='A' || inpt.charAt(0)=='T' || inpt.charAt(0)=='C' || inpt.charAt(0)=='G'){
        error=false;
      }
      else{
        error=true;
        break;
      }
    }
    if(error){
      System.out.println("Error in input");
    }
    else{
      // total alphabet
      int total=0;
      for(int i=0;i<inpt.length();i++){
        if(inpt.charAt(i)!='-'){
          total++;
        }
      }
      String test ="ATGC";
      int[] occur=new int[test.length()];
      for(int i=0;i<test.length();i++){
        for(int j=0;j<inpt.length();j++){
          if(test.charAt(i)==inpt.charAt(j)){
            occur[i]++;
          }
        }
      }
      int min=occur[0];
      for(int i=1;i<occur.length;i++){
        if(occur[i]<min){
          min=occur[i];
        }
      }
      String protin ="";
      for(int i=0;i<occur.length;i++){
        if(min==occur[i]){
          protin+=test.charAt(i);
        }
      }
      System.out.println("Least Occuring protein : \n"+protin+"  ("+min+" out of "+total+" )");
    }
  }
}