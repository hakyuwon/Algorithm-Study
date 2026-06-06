import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int tmp = -1;
        
        for(int x: arr){
            if(tmp != x){
                tmp = x;
                answer.add(x);
            }
        }

        return answer;
    }
}