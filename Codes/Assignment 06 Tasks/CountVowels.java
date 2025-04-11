public class CountVowels {
    public static void main(String[] args) {
        String input = "abcd";
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
          for(int j =0 ; j<vowels.length();j++){
            if(input.charAt(i) == vowels.charAt(j)){
                            vowelCount++;
            }
          }  
        }
        System.out.println("Number of vowels: " + vowelCount);
    }
}
