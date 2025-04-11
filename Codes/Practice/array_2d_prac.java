import java.util.Scanner;
public class array_2d_prac{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("What matrix do you want ? ");
    int i =sc.nextInt();
    System.out.println("by ");
    int j=sc.nextInt();
    System.out.println("matrix");
    int[][] m = new int[i][j];
    int c=0,d=0;
    for(int a=1;a<=i;a++){    // declaration of values
      d=0;
      for(int b=1;b<=j;b++){
        System.out.print("Enter the value of A("+a+")("+b+") matrix :");
      m[c][d]= sc.nextInt();
        d++;
      }
      c++;
    }
    System.out.println("So your A Matrix is :");  // display of entered values
         c = 0 ;
         
    for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
              System.out.print(" "+m[c][d]);
        d++;
      }
            System.out.println();
    c++;
    }
                                                                     // declaration of values
    int[][] n = new int[i][j];
     c=0;
     d=0;
    for(int a=1;a<=i;a++){
      d=0;
      for(int b=1;b<=j;b++){
        System.out.print("Enter the value of B("+a+")("+b+") matrix :");
      n[c][d]= sc.nextInt();
        d++;
      }
      c++;
    }
    System.out.println("So your B Matrix is :");              // display of entered values
         c = 0 ;      
    for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
              System.out.print(" "+n[c][d]);
        d++;
      }
            System.out.println();
    c++;
    }
    
    System.out.println("Summation of the two matrix is : ");   //sum
    int[][] sum = new int[i][j];
    
      c=0;
      for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
            sum[c][d]=m[c][d]+n[c][d];  
        d++;
      }

    c++;
    }
           c = 0 ;      
    for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
              System.out.print(" "+sum[c][d]);
        d++;
      }
            System.out.println();
    c++;
    }
    
      System.out.println("Substraction of the two matrix is : ");  //sub
    int[][] sub = new int[i][j];
    
      c=0;
      for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
            sub[c][d]=m[c][d]-n[c][d];  
        d++;
      }

    c++;
    }
           c = 0 ;      
    for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
              System.out.print(" "+sub[c][d]);
        d++;
      }
            System.out.println();
    c++;
    }
    
      System.out.println("Multiplication of the two matrix is : ");  //multi
    int[][] mul = new int[i][j];
      
      c=0;
      for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
            mul[c][d]=m[c][d]*n[c][d];  
        d++;
      }

    c++;
    }
           c = 0 ;      
    for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
              System.out.print(" "+mul[c][d]);
        d++;
      }
            System.out.println();
    c++;
    }
    
      System.out.println("Divsion of the two matrix is : ");  //div
    double[][] div = new double[i][j];
      
      c=0;
      for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
            div[c][d]=(double)m[c][d]/n[c][d];  
        d++;
      }

    c++;
    }
           c = 0 ;      
    for(int a=1;a<=i;a++){
      d = 0 ;
      for(int b=1;b<=j;b++){
              System.out.print(" "+div[c][d]);
        d++;
      }
            System.out.println();
    c++;
    }
    
   }
}