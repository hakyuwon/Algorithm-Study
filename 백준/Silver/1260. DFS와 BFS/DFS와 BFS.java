
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
	static int[][] map;
	static boolean[] isVisited;
	static int N, M, V;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][N+1];
		isVisited = new boolean[N+1];
		
		for(int i = 0 ; i<M;i++) { // 간선 연결 
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a][b] = 1;
			map[b][a] = 1;
		}
		
		dfs(V); // 깊이 우선 탐색
		sb.append("\n");
		
		isVisited = new boolean[N+1];
		bfs(V);
		
		System.out.println(sb);
	}
	
	public static void dfs(int start) {
		// 시작 부분 방문 처리
		isVisited[start] = true;
		sb.append(start).append(" ");
		// 간선 관계 조사해서 연결되어있고, 방문하지 않았다면!!!
		for(int i = 1; i<=N ; i++) {
			if(map[start][i]==1 && !isVisited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		// 시작 부분 삽입
		q.add(start);
		isVisited[start] = true; // 방문
		
		// 다음 큐에 넣을 것들.. 
		while(!q.isEmpty()) { // 큐가 비어있지 않을 동안에,
			// 큐에서 하나 꺼냄
			int now = q.poll();
			sb.append(now).append(" ");
			
			// 큐에 가능 좌표 삽입 (숫자 작은 것부터)
			for(int i = 1; i<=N ; i++) {
				if(map[now][i]==1 && !isVisited[i]) {
					q.add(i);
					isVisited[i] = true;
				}
			}
		}
		
	}
}
