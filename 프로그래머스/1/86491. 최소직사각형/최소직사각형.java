class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i=0; i<sizes.length; i++){
            int temp = 0;
            if(sizes[i][0]<sizes[i][1]){ // 세로가 더 긴 경우
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }// 가로 세로 길이 교환 
        }
        
        int max_width = 0;
        int max_height = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>max_width)
                max_width = sizes[i][0];
            if(sizes[i][1]>max_height)
                max_height = sizes[i][1];
        }
        
        
        answer = max_width * max_height;
        
        return answer;
    }
}