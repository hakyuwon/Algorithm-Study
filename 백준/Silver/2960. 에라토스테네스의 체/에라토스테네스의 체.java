import java.util.*;

public class Main{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] removed = new boolean[n + 1]; // 지워졌는지 확인하는 boolean 배열
        int count = 0;
        
        for(int i=2; i<=n; i++){
            for(int j=i; j<=n ; j += i){
                if (!removed[j]) {
                removed[j] = true;   // j를 통해 i부터 i의 배수까지 true로 설정함
                count++;             // 몇 번째 제거인지 카운트에 더함
                if (count == k) {
                    System.out.println(j); // K번째면 출력
                    return;
                }
            }
            }
        }
    }
}