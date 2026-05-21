import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = ""; 
        HashMap<String, Integer> parts = new HashMap<>();
    
        for(String x: participant) parts.put(x, parts.getOrDefault(x,0) + 1);
        
        for(String x: completion) parts.put(x, parts.get(x)-1);
        
        for(String key: parts.keySet()) {
            if(parts.get(key) !=0){
            answer = key;
            break;
            }
        }    
            
        return answer;
    }
}