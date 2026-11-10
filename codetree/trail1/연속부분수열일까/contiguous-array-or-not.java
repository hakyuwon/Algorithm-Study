import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];

        String answer = "No";

        for(int i = 0; i<n1; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i<n2; i++){
            b[i] = sc.nextInt();
        }

        for(int i = 0; i<=n1-n2; i++){
            if(b[0]==a[i]){
                boolean check = true; 
                for(int j=1;j<n2;j++){
                    if(b[j]!=a[i+j]){
                        check = false;
                        break;
                    }
                }
                if(check){
                    answer = "Yes";
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}