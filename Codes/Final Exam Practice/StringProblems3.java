public class StringProblems3 {

    public static String toTitleCase(String str) {
        String[] words = str.split("\\s+");
        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
            }
        }
        return titleCase.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(toTitleCase("hello world"));  // Output: "Hello World"
    }
}
