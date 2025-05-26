import java.util.Scanner;

public class Main{
    static long[] memo;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        memo = new long[num +1];
        
        System.out.print(fibonacci(num));
       
    }
    public static long fibonacci(int n){
                if (n <= 1)
                return n;
    
                if (memo[n]!=0)  //메모가 있는지 확인
                return memo[n]; 
    
                memo[n] = fibonacci(n-1) + fibonacci(n-2); //작은 문제로 나눠서 더함

                return memo[n];
        }
}