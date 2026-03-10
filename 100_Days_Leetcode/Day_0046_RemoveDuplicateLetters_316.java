import java.util.*;

class Day_0046_RemoveDuplicateLetters_316 {
    public String removeDuplicateLetters(String s) {

        int[] last = new int[26];
        for(int i = 0; i < s.length(); i++){
            last[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        boolean[] seen = new boolean[26];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(seen[c - 'a']) continue;

            while(!stack.isEmpty() && 
                  stack.peek() > c && 
                  last[stack.peek() - 'a'] > i){
                seen[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            seen[c - 'a'] = true;
        }

        StringBuilder res = new StringBuilder();
        for(char c : stack){
            res.append(c);
        }

        return res.toString();
    }
}
