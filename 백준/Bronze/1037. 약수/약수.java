import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		
		int arr[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		int result = 0;
		
		if (arr[0] == arr[num-1]) {
			result = arr[0] * arr[0];
		}
		else
		{
			result = arr[0] * arr[num-1];
		}
			
		
		System.out.println(result);

		
	}
}
