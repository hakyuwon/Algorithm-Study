import java.util.*; 

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Queue<Integer> Q = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            Q.offer((100-progresses[i]+speeds[i]-1)/speeds[i]);
        }
        
        while(!Q.isEmpty()){
            int day = Q.poll();
            int count = 1;
            
            while(!Q.isEmpty() && Q.peek() <= day){
                Q.poll();
                count ++;
            }
            list.add(count);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}