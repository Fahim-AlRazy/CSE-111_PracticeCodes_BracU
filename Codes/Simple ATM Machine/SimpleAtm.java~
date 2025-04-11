import java.util.Scanner;
public class SimpleAtm{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("                                        !! Welcome to Simple Banking System!! ");
    int balance = 0, deposit = 0 , withdraw = 0 ;
    while(true){
      System.out.print("What do you want to do ? \n 1.Deposit \n 2.Withdraw \n 3.Check balance \n 4.Exit \n Please make selection : ");
      int selection = sc.nextInt();
      
      
      while(selection<1 || selection >4){
        System.out.println("Invalid selection ! Please make your selection carefully");
        selection = sc.nextInt();
      }
      if(selection==1){   //deposit
        System.out.print("Enter the amount you want to deposit : ");
        deposit = sc.nextInt();
        while(deposit<0){
          System.out.print("Invalid input !! input cannot be negative . \n Please input again : ");
          deposit=sc.nextInt();
        }
        balance = balance + deposit;
        System.out.print(" Your deposit is successfull !!!! ");
      }
      else if(selection==2){   //withdraw
        System.out.print("Enter the amount you want to withdraw : ");
        withdraw = sc.nextInt();
        while(withdraw<0){
          System.out.print("Invalid input !! input cannot be negative . \n Please input again : ");
          withdraw=sc.nextInt();
        }
        if(withdraw>balance){
          System.out.println("Insufficient balance");
        }
        else{
          balance=balance-withdraw;
          System.out.println(withdraw+" has been withdrawn successfully!!!");
        }
      }
      else if(selection==3){    // check balance
        System.out.println("Your current balance is : "+balance);
      }
      else if(selection==4){     //exit
        System.out.println("System closed .Thank you !!");
        break;
      }
      
    }
  }
}