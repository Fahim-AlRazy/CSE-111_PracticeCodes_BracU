public class StringProblems7 {

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(findLongestWord("I love programming"));  // Output: "programming"
    }
}
