import java.util.LinkedHashMap;
import java.util.Map;

public class StringProblems2 {

    public static Character firstNonRepeatingCharacter(String str) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("swiss"));  // Output: "w"
        System.out.println(firstNonRepeatingCharacter("aabbcc"));  // Output: null
    }
}
