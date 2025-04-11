public class StringPattern {
    public static void main(String[] args) {
        String input = "HELLO";
        for (int i = 0; i < input.length(); i++) {
          for (int j = 0; j <=i; j++) {  
          System.out.print(input.charAt(j));
        }
          System.out.println();
        }
    }
}
