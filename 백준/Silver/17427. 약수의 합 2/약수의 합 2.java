import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		long sum = 0;
		
		for (int j = 1; j <= num; j++) {
			sum += (num/j)*j;
		}
		
		System.out.println(sum);
		
	}
}
