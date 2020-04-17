package Recursion;
import java.util.Scanner;
import java.util.Stack;

public class Bj10872 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(facto(num));
		
		
		sc.close();
		
	}
	
	private static int facto(int num){
		
		if(num < 1) return 1;
		
		return num*facto(num-1);
	}
}



