import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
	
		
		boolean[] arr = new boolean[n+1];
		
		arr[0] = true;
		arr[1] = true; //0과1 은 소수에서 제외
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			for (int j = 2; j <= n/i; j++) {
				if (arr[i*j] == true) {
					continue;
				}
				else
				{
					arr[i*j] = true;
				}
			
			}
		}
		
		for (int i = m; i <= n; i++) {
			if (arr[i] == false) {
				System.out.println(i);
			}
		}
		
	}

}
