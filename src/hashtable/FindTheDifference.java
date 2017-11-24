package hashtable;

/**
 * leetcode no.389
 */
public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int[] letter = new int[26];
        for (char c : s.toCharArray())
            letter[c - 97] += 1;
        for (char c : t.toCharArray())
            letter[c - 97] -= 1;
        for (int i = 0; i < 26; i++)
            if (letter[i] != 0)
                return (char)(i + 97);
        return 96;
    }
}
