//Task-8
import java.util.Scanner;
public class Task_8_rif
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter string to convert into AlTeRnAtInG caps format.");
    String stringin =scanner.nextLine();
    String reserved ="";
    char temp ='0';
    for(int m = 0;m<=stringin.length()-1; m++)
    {  
       int p=stringin.codePointAt(m);
       if(p>64 && p<91 || p>96 && p<123)
       {
         if(m==0)
         {
          reserved+=(char)(p+32);
          }
         else if(p>64 && p<91)
         {
            if(temp>96 && temp<123)
            {
             reserved+=(char)p;
             }
            else
            {
             reserved+=(char)(p+32);
             }
          }
         else if(p>96 && p<123)
         {
           if(temp>96 && temp<123)
           {
            reserved+=(char)(p-32);
            }
           else
           {
            reserved+=(char)p;
            }
          }
       temp=reserved.charAt(m);
        }
      else
      {
        reserved+=(char)p;
      }
    }
    System.out.println(reserved);
  } 
}