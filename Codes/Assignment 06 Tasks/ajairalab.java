import java.util.Scanner;
public class ajairalab{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
   System.out.print("Enter anything in your mind : ");
  String st= sc.nextLine();
  for(int i=0;i<st.length();i++){
     int reserve= st.charAt(i);
     if(reserve>=97 && reserve<=122 ){
     reserve=reserve-32;
     }
     char prnt = (char)reserve;
  System.out.print(prnt);
  }
}
}