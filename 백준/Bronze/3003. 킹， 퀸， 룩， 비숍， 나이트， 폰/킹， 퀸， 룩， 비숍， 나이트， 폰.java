import java.util.StringTokenizer;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int look = Integer.parseInt(st.nextToken());
        int bi = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int phone = Integer.parseInt(st.nextToken());
        
        king = 1 - king;
        queen = 1 - queen;
        look = 2 - look;
        bi = 2 - bi;
        knight = 2 - knight;
        phone = 8 - phone;
        
        bw.write(king+" "+queen+" "+look+" "+bi+" "+knight+" "+phone);
        bw.flush(); 
        bw.close();
        br.close();
    }
}