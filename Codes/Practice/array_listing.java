import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class array_listing{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    ArrayList<Integer> number = new ArrayList<Integer>();
    System.out.println("size = "+number.size());
    
    number.add(10);
    number.add(20);
    number.add(30);
    number.add(3,40);
    System.out.println(number);
    System.out.println("size = "+number.size());
    for(int x : number){  // for each loop 
      System.out.print(" "+x);
    }
    System.out.println();
    System.out.println();
    Iterator itr =number.iterator();  // print using iterator 
    while(itr.hasNext()){
      System.out.print(" "+itr.next());
    }
    System.out.println();
    System.out.println();
                                              // normal printing 
    System.out.println("Array list contains"+number);
    System.out.println();
    System.out.println();
                                           //Removing elements using .remove() function
    
    number.remove(2);  // index number should be mentioned 
    System.out.println("After removing "+number);
    System.out.println();
    System.out.println();
                                           //Removing all elements using .removeAll() function  // also number.clear()  method 
    
    number.removeAll(number);  // index number should be mentioned 
    System.out.println("After removing all "+number);
    System.out.println();
    System.out.println();
    
    // .isEmpty() method , either true or false 
    boolean check =number.isEmpty();
    System.out.println("Array List empty : "+check);
    System.out.println();
    System.out.println();
    
    // .contains() diye check kore true or false dey 
    // .set(index,value) diye kono value ke replacce kora hoy prothome index pore value ;
    // .get(index) index er value return korbe 
    // methods- size , add , remove , removeAll , clear , isEmpty , contains , indexOf , set , get , equals , addAll 
    // Collections.sort() diye ascending ba choto theke boro akare sajano jay 
    // Collections.sort(number, Collections.reverseOrder()) diye descending order e sajano jay 
    
  }
}