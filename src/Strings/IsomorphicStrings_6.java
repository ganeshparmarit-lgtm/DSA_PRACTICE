package Strings;

/*
 * Problem: Isomorphic Strings
 * Approach: Use HashMap to maintain character mapping from s to t.
 * TC: O(n) | SC: O(n)
 */

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_6 {

    public static boolean isomorphicString(String s, String t) {

        // Length same honi chahiye
        if (s.length() != t.length()) {
            return false;
        }

        // s character → t character mapping store karega
        Map<Character, Character> charMappingMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            // Original ki mapping nahi hai
            if (!charMappingMap.containsKey(original)) {
                // Replacement kisi aur character ko already assigned nahi hona chahiye
                if (!charMappingMap.containsValue(replacement)) {
                    charMappingMap.put(original, replacement);
                } else {
                    return false;
                }

            } else {
                // Original ki mapping already hai
                char mappedCharacter = charMappingMap.get(original);
                // Purani mapping aur current mapping same honi chahiye
                if (mappedCharacter != replacement) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        System.out.println(isomorphicString(s, t));
    }
}
