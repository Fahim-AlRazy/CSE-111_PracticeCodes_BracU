import java.util.Scanner;
public class wrapper_class{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    /** Wrapper class is used to convert primitive into object and object into primitive
      *
      *  Autoboxing = converting primitive to object 
      *  Unboxing = converting object to primitive 
      * 
      * 
      * **/
    
    // Autoboxing -- primitive -> object 
    int x=20;
    Integer y=Integer.valueOf(x);
    System.out.println(y);
    
    //Unboxing -- object -> primitive 
    Double d = new Double(10.25);
    System.out.println("d = "+d);
    
    double e = d.doubleValue(); // ekhane .doubleValue() na likhleo hoy compiler auto detect kore ney 
    System.out.println("e = "+e);
    
    // double theke string convert 
    
    double i = 100.25;
    String s = Double.toString(i);
    System.out.println("s = "+s);
    
    // boolean theke string nite same kaaj 
    // String s = Boolean.toString(boolean variable name);
    //
    
    // string theke integer e nite hoile 
    // int i = Integer.parseInt(string variable name)  // parse integer ba double ba onno kicho deoa jabe 
    
    // Integer.valueOf(s)   evabeo string ke integer e neoa jay 
    
  }
}