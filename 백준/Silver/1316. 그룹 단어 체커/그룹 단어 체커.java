import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        
		int test_case = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(test_case-- >0) {
			boolean[] check = new boolean[26];
			boolean isGroup = true;
			
			String word = br.readLine();
			
			char prev = '0';
			
			for(int i = 0; i<word.length();i++) {
							
				char now = word.charAt(i);
				
				if(prev!=now) {
					if(check[now-'a']) {
						isGroup = false;
						break;
					}else {
						check[now-'a'] = true;
					}
				}
				prev = now;
			}
			if(isGroup) {
				count ++;
			}
		}
		
		System.out.println(count);
		
	}
}