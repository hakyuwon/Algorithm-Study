import java.io.*;

class Main{
    	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        String[] letter = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String word = br.readLine();
        
        for(String val : letter) {
        	if(word.contains(val)) {
        		word = word.replace(val, "!");
        	}
        }
        System.out.println(word.length());
        
	}
}