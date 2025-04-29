import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 현재 시간과 분 입력 받기
        int h = sc.nextInt();  // 시
        int m = sc.nextInt();  // 분
        
        // 요리 시간 입력 받기
        int cookTime = sc.nextInt();  // 요리 시간 (분)
        
        // 요리 시간 더하기
        m += cookTime;
        
        // 분이 60 이상일 경우 시를 증가시키고, 남은 분 계산
        h += m / 60;
        m = m % 60;
        
        // 시가 24 이상일 경우 24로 나눈 나머지 처리
        h = h % 24;
        
        // 결과 출력
        System.out.println(h + " " + m);
    }
}