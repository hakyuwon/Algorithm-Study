import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> mon = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            mon.put(nums[i], 1);
        }
        
        if(mon.size()<nums.length/2){
            return mon.size();
        }
        else if(mon.size()>=nums.length/2){
            return nums.length/2;
        }
        return 0;
    }
}