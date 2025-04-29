import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());

        // 두 번째 줄 읽기
        st = new StringTokenizer(br.readLine());

        int[] array = new int[w];
        for(int i=0; i<w; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = 0;
        
        for(int i=1; i <w-1; i++){ // 현재 위치
            int left = 0, right = 0;
            
            for(int j=0; j<i; j++){ //좌측 블럭 최대 높이 구하기
                left = Math.max(left, array[j]);
            }
           
            for(int j=i+1; j<w; j++){  //우측 블럭 최대 높이 구하기
                right = Math.max(right, array[j]);
            }
            
            int minHeight = Math.min(left, right); // 둘 중에 낮은 거

            if (minHeight > array[i]) {
                count += minHeight - array[i];
            }
        }
        System.out.println(count);
    }
}