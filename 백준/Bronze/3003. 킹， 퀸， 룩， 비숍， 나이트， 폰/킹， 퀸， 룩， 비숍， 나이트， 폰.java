import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[6];
		int base[] = {1, 1, 2, 2, 2, 8};
		int result[] = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < 6; i++) {
			if (arr[i] == base[i]) {
				continue;
			}
			else
				result[i] = base[i] - arr[i];
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		
		
	}
}
