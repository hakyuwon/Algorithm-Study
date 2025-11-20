import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arrayA = new int[n][m];
		int[][] arrayB = new int[n][m];
		
		for(int i = 0; i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<m;j++) {
				arrayA[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<m;j++) {
				arrayB[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n ; i++) {
			for(int j = 0;j<m;j++) {
				int a = arrayA[i][j];
				int b = arrayB[i][j];
				sb.append(a+b);
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
