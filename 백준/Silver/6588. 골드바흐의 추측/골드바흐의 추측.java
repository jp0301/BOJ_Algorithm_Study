import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static final int MAX = 1000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		boolean prime[] = new boolean[MAX + 1];

		for (int i = 2; i <= MAX; i++) {
			prime[i] = true;
		}

		for (int i = 2; i <= MAX; i++) {
			for (int j = i * 2; j <= MAX; j+= i) {
				if (!prime[j]) {
					continue;
				}
				prime[j] = false;
			}
		}
		
		while (true) {
			int num = Integer.parseInt(br.readLine());
			boolean flag = false;
			if (num==0) {
				break;
			}
			for (int i = 2; i <= num/2; i++) {
				if (prime[i] && prime[num-i]) {
					System.out.println(num + " = " + i + " + " + (num-i));
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
		}
		
		
		
	}


	
}
