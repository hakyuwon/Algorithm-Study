class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=6; i>0 ; i--){
            if(n*i%6==0)
                answer = n*i/6;
        }
        
        return answer;
    }
}