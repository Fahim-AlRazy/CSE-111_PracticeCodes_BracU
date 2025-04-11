import java.util.Scanner;
public class arrayTask11{
  public static int isVowel(String x){    //   isVowel
    int count=0;
    String test=x.toLowerCase();
    for(int i=0;i<x.length();i++){
      if(test.charAt(i)=='a' || test.charAt(i)=='e' ||test.charAt(i)=='i' ||test.charAt(i)=='o' ||test.charAt(i)=='u'){
        count++;
      }
    }
    return count;
  }
  public static int isConsonant(String x){    //   is Consonant
    int count=0;
    String test=x.toLowerCase();
    for(int i=0;i<x.length();i++){
      if(test.charAt(i)=='a' || test.charAt(i)=='e' ||test.charAt(i)=='i' ||test.charAt(i)=='o' ||test.charAt(i)=='u'){
      }
      else if(test.charAt(i)>='a' && test.charAt(i)<='z'){
        count++;
      }
    }
    return count;
    
  }
  public static int vowelSum(String arr[]){  //  vowel sum
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=isVowel(arr[i]);
    }
    return sum;
  }
  public static int consonantSum(String arr[]){   //  consonant sum
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=isConsonant(arr[i]);
    }
    return sum;
  }
  public static void main(String[] args){
    System.out.println("                             Part-A is vowel      ");
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = sc.nextLine();
    int vowel =isVowel(str);
    System.out.println("Number of vowels in the string: "+vowel);
    
    System.out.println(" ");
    System.out.println("                             Part-B is vowel      ");
    System.out.print("Enter a string : ");
    String str1 = sc.nextLine();
    int consonant =isConsonant(str1);
    System.out.println("Number of consonants in the string: "+consonant);
    
    System.out.println(" ");
    System.out.println("                             Part-C sum of vowel or consonant     ");
    String [] names = {"Bob", "Alice", "Max", "Marry","Rosy"};
    System.out.println( "The total number of vowels in the arrayis:" + vowelSum(names));
    System.out.println( "The total number of consonants in thearray is:" + consonantSum(names)); 
    
  }
}