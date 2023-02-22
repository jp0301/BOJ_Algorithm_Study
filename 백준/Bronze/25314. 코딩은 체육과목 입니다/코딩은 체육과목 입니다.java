import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		for (int i = num; i > 0; i-=4) {
			System.out.print("long");
			
			if(i == 0)
				System.out.print("");
			else
				System.out.print(" ");
		}
		System.out.print("int");
		
	}
}
