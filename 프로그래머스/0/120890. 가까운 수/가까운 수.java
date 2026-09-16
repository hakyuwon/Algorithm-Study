class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        for(int x : array){
            if(Math.abs(x-n) < min){
                min = Math.abs(x-n);
                answer = x;
            } else if(Math.abs(x-n) == min){
                answer = Math.min(answer, x);
            }
        }
        return answer;
    }
}