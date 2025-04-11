import java.util.HashMap;

public class StringProblems5 {

    public static HashMap<Character, Integer> countCharacterOccurrences(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        return charCount;
    }

    public static void main(String[] args) {
        System.out.println(countCharacterOccurrences("hello"));  // Output: {h=1, e=1, l=2, o=1}
    }
}
