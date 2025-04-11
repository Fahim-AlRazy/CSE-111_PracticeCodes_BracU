import java.util.Scanner;
public class examQS{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your student id : ");
    int sid = sc.nextInt();
    System.out.print("Enter item numbers : ");
    int num = sc.nextInt();
    double max =0 ;
    String nam ="0" ;
    String fnam ="0";
    double price ;
    for(int i=1;i<=num;i++){
      System.out.print("Enter the "+i+" item name : ");
      nam= sc.next() ;
      System.out.print("Enter the "+i+"item price : ");
      price = sc.nextDouble() ;
      if(max<price){
        max = price;
        fnam = nam;
      }
    }  //  maximum priced item and price done
    
    int rem_sid =0 , now_sid =sid , sum_sqr=0;       //discount part from sid 
    for(int i =1; true ; i++){
      rem_sid=now_sid%10;
      sum_sqr=sum_sqr+(rem_sid*rem_sid);
      now_sid=now_sid/10;
      if(now_sid==0){
        break;
      }
    }
    double discount = sum_sqr/100 * (1/100) ;
    double now_price=max-max*discount;
    System.out.println( fnam +" is the maximum priced item");
    System.out.println("Discount is : "+discount);
    System.out.println("Previous  price is : "+max);
    System.out.println("After discount : "+now_price);
    
    
  }
}