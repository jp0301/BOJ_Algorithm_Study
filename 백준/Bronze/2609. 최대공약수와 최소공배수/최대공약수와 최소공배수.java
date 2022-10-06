import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		int n1 = Integer.parseInt(str[0]);
		int n2 = Integer.parseInt(str[1]);
		
		
		System.out.println(GCD(n1, n2));
		System.out.println(n1 * n2 / GCD(n1, n2));
		
	}

	public static int GCD(int n1, int n2)
	{
		while (n2 != 0) {
			int r = n1 % n2;
			n1 = n2;
			n2 = r;
		}
		
		return n1;
	
	}
}
