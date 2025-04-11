public class assignment_2
{
  public static void main(String[] args)
  {
    /*
2. Write the Java code for the following:
2.1 Declare an integer variable. Initialize it with some value of your choice and
print it to check the value has been stored properly.
2.2 Declare and initialize another integer variable. Add this to the first one and print
out the result. Verify that the addition has been done correctly.
2.3 Now print the product and division of the two integer numbers.
2.4 Repeat exercises 2.1, 2.2, and 2.3 for variables of data type double. Verify your
answers.
2.5 Repeat exercises 2.1, 2.2, and 2.3 for one double data type and one integer
datatype. Verify your answers.
2.6 Repeat exercises 2.1 and 2.2 for variables of data type String. How does the
addition operator work for Strings? What if the first variable is an integer and the
second is a String and vice versa? 
     
    */
                                                                      System.out.println("                                      Part 2.1");
  System.out.println(" ");
 
  int vugi = 200 ;
  System.out.print("vugi er value hoilo : ");
  System.out.println(vugi);
  
  System.out.println(" ");
  
                                                                      System.out.println("                                     Part 2.2");
  
  System.out.println(" ");
  
  int chugi = 3 ;
  System.out.print("chugi er value hoilo : ");
  System.out.println(chugi);
  
  System.out.println(" ");
  
  int sum = vugi + chugi  ;
  System.out.print("vugi chugi er sum hoilo : ");
  System.out.println(sum);
  
  System.out.println(" ");
  
                                                                     System.out.println("                                    Part 2.3");
  
  System.out.println(" ");
  
  int product = vugi * chugi ;
  System.out.print("vugi chugi er product hoilo : ");
  System.out.println(product);
  
  System.out.println(" ");
  
  int div = vugi / chugi ;
  System.out.print("vugi chugi er division hoilo : ");
  System.out.println(div);
  
  System.out.println(" ");
  
                                                                    System.out.println("                                 Part 2.4");
  
  System.out.println(" ");
  
  double iching = 400.500 ;
  System.out.print("iching er value hoilo : ");
  System.out.println(iching);
  double biching = 30.40 ;
  System.out.print("biching er value hoilo : ");
  System.out.println(biching);
  
  System.out.println(" ");
  
  double sumd = iching + biching ;
  double productd = iching * biching ;
  double divd = iching / biching ;
  
  System.out.print("iching biching er sum hoilo : ");
  System.out.println(sumd);
  System.out.print("iching biching er product hoilo : ");
  System.out.println(productd);
  System.out.print("iching biching er division hoilo : ");
  System.out.println(divd);
  
  System.out.println(" ");
  
                                                                    System.out.println("                               Part 2.5");
  
  System.out.println(" ");
  
  double bd = 45.46 ;
  System.out.print("bd er value hoilo : ");
  System.out.println(bd);
  int harse = 30 ;
  System.out.print("harse er value hoilo : ");
  System.out.println(harse);
  
  System.out.println(" ");
  
  double sum_bd_harse = bd + harse ;
  double prod_bd_harse = bd * harse ;
  double div_bd_harse = bd / harse ;
  
  
  System.out.print("bd harse er sum hoilo : ");
  System.out.println(sum_bd_harse);
  System.out.print("bd harse er product hoilo : ");
  System.out.println(prod_bd_harse);
  System.out.print("bd harse er division hoilo : ");
  System.out.println(div_bd_harse);
  
  System.out.println(" ");
  
                                                                System.out.println("                               Part 2.6");
  
  System.out.println(" ");
  
  String bohut = "baicha asi " ;
  System.out.println("bohut er value hoilo : " + bohut);
  String pera = "eidai onek" ;
  System.out.println("pera er value hoilo : " + pera);
  
  // this is called concatination , in this case the values of string are simply placed side by side through a + sign and this is how string data types are summed
  
  System.out.println(" ");
  
  String sum_bohut_pera = bohut + pera ;
  
  System.out.println("bohut pera er sum hoilo : " + sum_bohut_pera );
  
  // if the first value is integer and other value is string or anything it doesnt matter because those values are stored in a String data type , so the values will be placed side by side 
  // for example 
  
   System.out.println(" ");
  
  String maaf = "maaf kori den vai " ;
  System.out.println("maaf er value hoilo : " + maaf);
  String kori = "100 100 @ # ! $ % & ~ " ;
  System.out.println("kori er value hoilo : " + kori);
  String den = " amar vuul hoi geche " ;
  System.out.println("den er value hoilo : " + den);
  
  System.out.println(" ");
  
  String maaf_kori_den = maaf + kori + den ;
  
  System.out.println("maaf kori den er sum hoilo : " + maaf_kori_den );
  
  }
}