public class SwapCase {
    public static void main(String[] args) {
        String input = "Hello World";
        StringBuilder swapped = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                swapped.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                swapped.append(Character.toUpperCase(ch));
            } else {
                swapped.append(ch);  // if it’s a space or symbol
            }
        }

        System.out.println("Swapped case: " + swapped.toString());
    }
}
