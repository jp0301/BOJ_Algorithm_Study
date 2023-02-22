import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n+1];
		
		for (int i = 0; i < n; i++) {
			arr[i+1] = i+1;
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			int temp = 0;
			
			temp = arr[first];
			arr[first] = arr[second];
			arr[second] = temp;
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
