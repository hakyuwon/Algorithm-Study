class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer = 0, denom = 0;
        numer = numer1 * denom2 + numer2 * denom1;
        denom = denom1 * denom2;
        
        int a = numer;
        int b = denom;
        
        while(b!=0){
            int rest = a%b;
            a = b;
            b = rest;
        }
        
        answer[0] = numer/a;
        answer[1] = denom/a;
        
        return answer;
    }
}