import java.util.Scanner;
public class stringTask5{
  public static int toDecimal(String x){  //  to decimal
    int decimal=0;
    for(int i=0;i<x.length();i++){
      decimal+= ((x.charAt(i)-'0')*Math.pow(2,(x.length()-1-i)));
    }
    return decimal;
  }
  public static String toHex(int x){   // to hexa
    String hexa="";
    int quotient=x ,remainder=0;
    String rem="",now="";
    while(quotient!=0){
      remainder=quotient%16;
      quotient=quotient/16 ;
      if(remainder==10){
        now="A";
      }
      else if(remainder==11){
        now="B";
      }
      else if(remainder==12){
        now="C";
      }
      else if(remainder==13){
        now="D";
      }
      else if(remainder==14){
        now="E";
      }
      else if(remainder==15){
        now="F";
      }
      else{
        now=String.valueOf(remainder);
      }
      rem=now+rem;
    }
    hexa=rem;
    return hexa;
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a binary number : ");
    String binary= sc.next();
    int decimal= toDecimal(binary);
    String hexa =toHex(decimal);
    System.out.println(hexa);
  }
}