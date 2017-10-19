package string;

import java.util.Stack;

/**
 * Created by Yue on 2017/10/19.
 * leetcode no.557
 */
public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        char[] cs = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < cs.length;  i++) {
            if (cs[i] != ' ')
                stack.push(cs[i]);
            if (cs[i] == ' ' || i == cs.length - 1) {
                while (!stack.empty())
                    res.append(stack.pop());
                if (i != cs.length - 1)
                    res.append(' ');
            }
        }
        return res.toString();
    }
}
