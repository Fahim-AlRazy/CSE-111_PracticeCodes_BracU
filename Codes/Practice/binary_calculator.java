import java.util.Scanner;
public class binary_calculator{

  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("                                    Welcome to simple binary calculator \n [ here you can convert your number type into decimal, binary, hexadecimal or octal ] ");
    int exit=0;
    String input="";
    int selection=0;
    while(true){
      System.out.print("What is your input type : \n1.Decimal \n2.Binary \n3.Hexa Decimal \n4.Octal  \nPlease make a selection :");
       selection = sc.nextInt();
      while(selection<1 || selection>4){
        System.out.print("Please Select carefully!!!  "+selection+" is not a valid selection \nPlease make a selection :");
        selection = sc.nextInt();
      }
      System.out.print("Enter your number : ");
      input = sc.nextLine();
      switch(selection){
        case 1: // decimal input 
          System.out.print("What do you want to convert into : \n1.Binary \n2.Hexa Decimal \n3.Octal  \nPlease make a selection :");
       selection = sc.nextInt();
      while(selection<1 || selection>3){
        System.out.print("Please Select carefully!!!  "+selection+" is not a valid selection \nPlease make a selection :");
        selection = sc.nextInt();
      }
      switch(selection){
      case 1: // to Binary 
          
          break;
        case 2:  // to Hexa Decimal 
          
          break;
        case 3:  // to Octal 
          
          break;
      
      }
      
      
          break;
        case 2: // binary input 
          
          break;
        case 3:  // hexadecimal input 
          
          break;
        case 4:  // octal input 
          
          break;
      }
      System.out.print("Do you want to close the calculator ? \n1.Yes      2.No \n Make a choice : ");
      exit=sc.nextInt();
      if(exit==1){
        System.out.println("       ________ Thank You !!! _______");
        break;
      }
      System.out.println();
      System.out.println();
    }
  }
}
