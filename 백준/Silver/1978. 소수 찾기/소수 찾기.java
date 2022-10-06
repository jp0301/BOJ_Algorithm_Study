import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		int arr[] = new int[count];
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(isPrime(arr[i]))
			{
				result++;
			}
		}
		System.out.println(result);
		
	}
	public static boolean isPrime(int num)
	{
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	
}
