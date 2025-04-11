import java.util.Scanner;
public class quiz_1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println(" ");
    
    System.out.println("    Welcome to the GAME");
    
    System.out.println(" ");
    
    System.out.println("Here are some attractive offers : \n 1. 16 Coins for 500 taka \n 2. 40 Coins for 1000 taka  ");
    
    System.out.println(" ");
    System.out.print("Please make a selection : ");
    int offer =0;
    while(true){
      offer = sc.nextInt();
      System.out.println(" ");
      if(offer==1 || offer ==2){
        break;
      }
      System.out.print("Invalid Selection !!! \n Please Enter your selection carefully :  ");
    }
    int balance = 0 , coin = 0 ;
    System.out.println(" You have selected offer "+offer);
    if(offer==1){
      System.out.println("Please Insert 500 taka ");
      balance = sc.nextInt();
      while(balance!=500){
        System.out.println("Please pay exact 500 taka . Other notes are not accepted !");
        balance = sc.nextInt();
      }
      System.out.println("Thank you ! You have paid "+balance+" taka \n You will receive 16 Coins ");
      coin = 16 ;
    }
    else{
      System.out.println("Please Insert 1000 taka ");
      balance = sc.nextInt();
      while(balance!=1000){
        System.out.println("Please pay exact 1000 taka . Other notes are not accepted !");
        balance = sc.nextInt();
      }
      System.out.println("Thank you ! You have paid "+balance+" taka \n You will receive 40 Coins ");
      coin = 40 ;
    }
    int taka =0;                   //for advertisement
    int sel = 0 ;
    System.out.println("For advertisement purpose we are providing 12% additional coins and 18% cashback ");
    coin+=(coin*12/100);
    taka+=(balance*18/100);
    System.out.println("So you have got a total "+coin+" coins and "+taka+" taka cashback");
    System.out.println(" ");
    while(coin != 0 && sel != 2){
      System.out.print("Insert a coin : ");
      System.out.println("[_]");
      int cn = sc.nextInt();
      while( cn != 0 ){
        System.out.print("Please insert a real coin !");
        System.out.println("[_]");
        cn=sc.nextInt();
      }
      coin-=1 ;
      System.out.println(" ");
      System.out.println("Enjoy your game !!");
      System.out.println(" ");
      System.out.println("Enter any number when you are done ");
      sc.next();
      System.out.println("You have "+coin+" coins left");
      System.out.println("Do you want to ___ \n 1. Insert another Coin \n 2. Exit ");
      sel = sc.nextInt();
      if(coin==0){
        System.out.println("Oops! You have ran out of coins");
      }
    }    
    System.out.println("How many Dolls did you win ?  ");
    int doll = sc.nextInt();
    
    if(doll>2){
      System.out.println(" You have won "+doll+" dolls , You will receive 10 coins and extra 20 taka back for your first two dolls ");
      coin+=10;
      taka=20;
    }
    if(doll>4){
      System.out.println("You have won more than 4 dolls so You will receive an additional 20 coins and extra 40 taka back");
      coin+=20;
      taka=20;
    }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Please collect your "+coin+" coins , "+doll+" dolls and "+taka+" taka back before leaving .\n Thank you and Goodbye ");
    
  }
}