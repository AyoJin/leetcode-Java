package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private Stack<Character> stack = new Stack<>();

    private Map<Character, Character> map;

    public ValidParentheses() {
        map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
    }

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                char top = stack.empty() ? '#' : stack.pop();
                if (top != map.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}