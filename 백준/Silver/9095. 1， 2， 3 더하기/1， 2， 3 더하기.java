import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			count = 0;
			dfs(n, 0);
			sb.append(count + "\n");
		}
		System.out.println(sb);
	}
	
	private static void dfs(int target, int value) {
		if(target < value) {
			return;
		}
		if(target == value) {
			count++;
			return;
		}
		else {
			dfs(target, value + 1);
			dfs(target, value + 2);
			dfs(target, value + 3);
		}
	}
	
}

