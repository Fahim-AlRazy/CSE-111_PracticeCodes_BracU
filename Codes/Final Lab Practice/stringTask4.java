import java.util.Scanner;
public class stringTask4{
  public static int squareOfDigits(int x){
    int sqr_sum=0;
    while(x>0){
      sqr_sum+=(x%10)*(x%10);
      x=x/10;
    }
    return sqr_sum;
  }
  public static boolean isHappyNumber(int x){
    boolean happy=false;
    while(x!=1){
      if(((x*x)==squareOfDigits(x)) && squareOfDigits(x)!=1 && x!=1 ){
        break;
      }
      x=squareOfDigits(x);
      
    }
    if(x==1){
      happy=true;
    }
    else{
      happy=false;
    }
    return happy;
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number : ");
    int input=sc.nextInt();
    boolean check = isHappyNumber(input);
    System.out.println(check);
  }
}