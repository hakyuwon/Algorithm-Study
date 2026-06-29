class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        int num = x;
        
        while(num>9){
            sum += num%10; 
            num = num/10; 
        }
        sum += num; 
        
        answer = (x % sum ==0) ? true : false;
        
        return answer;
    }
}