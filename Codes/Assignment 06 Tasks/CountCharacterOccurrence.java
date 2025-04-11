public class CountCharacterOccurrence {
    public static void main(String[] args) {
        String input = "hello world";
        char target = 'l';
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
