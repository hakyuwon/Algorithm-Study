class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i = 1; i<= yellow; i++){
            if(yellow%i==0){ // i는 yellow의 약수
                if((i + yellow/i)*2 == brown-4){
                    answer[0] = Math.max(i, yellow/i) + 2;
                    answer[1] = Math.min(i, yellow/i) + 2;    
                }
            }
        }
        return answer;
    }
}