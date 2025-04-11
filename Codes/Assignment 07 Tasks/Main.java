public class Main {
    public static void main(String[] args) {
        String input1 = "abcdefgh";
        String input2 = "efghabcd";

        String W1 = "";
        String W2 = "";

        for (int i = 1; i < input1.length(); i++) {
            String W1_part1 = "";
            String W2_part1 = "";

            for (int j = 0; j < i; j++) {
                W1_part1 += input1.charAt(j);
            }
            for (int j = i; j < input1.length(); j++) {
                W2_part1 += input1.charAt(j);
            }

            String W2_part2 = "";
            String W1_part2 = "";

            for (int j = 0; j < W2_part1.length(); j++) {
                W2_part2 += input2.charAt(j);
            }
            for (int j = W2_part1.length(); j < input2.length(); j++) {
                W1_part2 += input2.charAt(j);
            }

            if (W1_part1.equals(W1_part2) && W2_part1.equals(W2_part2)) {
                W1 = W1_part1;
                W2 = W2_part1;
                break;
            }
        }

        if (!W1.equals("") && !W2.equals("")) {
            System.out.println("W1: " + W1 + ", W2: " + W2);
        } else {
            System.out.println("No valid substrings found");
        }

        String common_substring = "";
        for (int i = 0; i < W1.length(); i++) {
            for (int j = 0; j < W2.length(); j++) {
                if (W1.charAt(i) == W2.charAt(j)) {
                    String temp_common = "";
                    int k = 0;
                    while (i + k < W1.length() && j + k < W2.length() && W1.charAt(i + k) == W2.charAt(j + k)) {
                        temp_common += W1.charAt(i + k);
                        k++;
                    }
                    if (temp_common.length() > common_substring.length()) {
                        common_substring = temp_common;
                    }
                }
            }
        }

        if (!common_substring.equals("")) {
            System.out.println("Common substring: " + common_substring);
        } else {
            System.out.println("No common substring found");
        }
    }
}