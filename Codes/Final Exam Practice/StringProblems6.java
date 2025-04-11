import java.util.HashSet;

public class StringProblems6 {

    public static String removeDuplicates(String str) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));  // Output: "progamin"
    }
}
