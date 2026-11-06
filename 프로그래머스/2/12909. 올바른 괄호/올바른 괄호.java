import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            if(ch[i] == '(')
                stk.push(ch[i]);
            else 
                if(stk.isEmpty())
                    return false;
                else
                    stk.pop();
        }
        
        if(stk.isEmpty())
            return true;
        else
            return false;
        
    }
}