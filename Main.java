import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String string = "GEEKSFORGEEKS";
        int response = longestSubstring(string);
        System.out.println("Longest Substring: " + response);
    }
    public static int longestSubstring(String s) {
        int sizeString = s.length();
        int response = 0;
        for (int i = 0; i < sizeString; i++) {
            for (int j = i + 1; j <= sizeString; j++) {
                if (isUnique(s, i, j)) {
                    response = Math.max(response, j - i);
                }
            }
        }
        return response;
    }

    public static boolean isUnique(String s, int startString, int endString) {
        Set<Character> set = new HashSet<>();
        for (int i = startString; i < endString; i++) {
            char character = s.charAt(i);
            if (set.contains(character)) {
                return false;
            }
            set.add(character);
        }
        return true;
    }
}