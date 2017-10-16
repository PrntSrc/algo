package string;

import java.util.Stack;

/**
 * Created by Yue on 2017/10/16.
 * leetcode no.345
 */
public class ReverseVowelsOfAString {

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (start < end && !vowels.contains(cs[start] + "")) start++;
            while (start < end && !vowels.contains(cs[end] + "")) end--;
            char temp = cs[start];
            cs[start] = cs[end];
            cs[end] = temp;
            start++;
            end--;
        }
        return new String(cs);
    }
}
