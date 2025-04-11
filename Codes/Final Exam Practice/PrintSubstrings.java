public class PrintSubstrings {
    public static void main(String[] args) {
        String input = "abc";

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }
}
