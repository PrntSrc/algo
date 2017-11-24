package hashtable;

/**
 * leetcode no.242
 */
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] letter = new int[26];
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            letter[s.charAt(i) - 97] += 1;
            letter[t.charAt(i) - 97] -= 1;
        }
        for (int i = 0; i < 26; i++)
            if (letter[i] != 0)
                return false;
        return true;
    }
}
