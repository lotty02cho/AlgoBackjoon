package Recursion;
import java.util.Scanner;
import java.util.Stack;

public class Bj10870 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		System.out.println(fibo(num));

	}
	
	private static int fibo(int num){
		
		if(num == 0){
			return 0;
		}else if(num == 1){
			return 1;
		}
		
		return fibo(num-1) + fibo(num-2);
	}
	
}



