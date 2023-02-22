import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int searchNum = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == searchNum) {
				count += 1;
			}
		}
		
		System.out.println(count);
		

	}

}