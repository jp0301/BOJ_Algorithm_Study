
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] arr = br.readLine().split(" ");
		int [] num = new int[3];
		
		for (int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		int temp = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 3; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
