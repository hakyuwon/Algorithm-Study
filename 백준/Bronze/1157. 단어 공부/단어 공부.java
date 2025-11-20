import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        
		int[] count = new int[26];
		String input = br.readLine().toUpperCase();
		
		for(int i = 0; i< input.length();i++) {
			char a = input.charAt(i);
			count[a-'A']++;
		}
		
		int max=-1;
		char result='?';
		
		for(int i = 0; i<26;i++) {
			if(max < count[i]) {
				max = count[i];
				result = (char)(i+'A');
			}else if(max == count[i]) {
				result = '?';
			}
		}
		
		System.out.println(result);
		
	}
}