import java.util.Scanner;
public class Task5{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the phrase : ");
    String phrase= sc.nextLine();
    String lower="";
    for(int i =0;i<phrase.length();i++){
      if(phrase.charAt(i)>=65 && phrase.charAt(i)<=90){
        lower+= (char)(phrase.charAt(i)+32);
      }
      else{
        lower+= (char)phrase.charAt(i);
      }
    }
    String vowel = "aeiou";
    int vowel_count=0, consonant_count=0;
    for(int i =0;i<lower.length();i++){
      int vow=0;
      for(int j=0;j<vowel.length();j++){
        if(lower.charAt(i)==vowel.charAt(j)){
          vowel_count++;
          vow=1;
          break;
        }
      }
      if(vow==0 && lower.charAt(i)>=97 && lower.charAt(i)<=122){
        consonant_count++;
      }
    }
    System.out.println(" vowel_count = "+vowel_count+"  and consonant_count = "+consonant_count);
    System.out.println();
    if( vowel_count%3==0 && consonant_count%5==0 && vowel_count>0 && consonant_count>0 ){
      System.out.println("Aaar! Me Plunder!!");
    }
    else{
      System.out.println("Blimey! No Plunder!!");
    }
  }
}