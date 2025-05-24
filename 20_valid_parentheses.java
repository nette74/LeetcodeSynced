import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            switch (c){
                case '(', '[', '{':
                    stack.push(c);
                    break;
                case ')' : 
                    if(stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case ']' :
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case '}' :
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}