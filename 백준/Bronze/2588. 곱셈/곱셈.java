import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = b%10; // 두번째 자연수의 일의 자리 숫자 (나머지값)
        int d = b%100/10; //두 번째 자연수의 십의 자리 숫자
        int e = b%1000/100;
        
        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*e);
        System.out.println(a*c + a*d*10 + a*e*100);
    }
}