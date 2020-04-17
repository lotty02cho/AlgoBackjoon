package InputOutput;
import java.util.Scanner;
import java.util.Stack;

public class Bj2588 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		문제
//		(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//
//		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
//		출력
//		첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
//
//		예제 입력 1
//		472
//		385
//		
//		예제 출력 1
//		2360
//		3776
//		1416
//		181720
		
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		
		char number1[] = new char[num1.length()];
		char number2[] = new char[num2.length()];
		
		for(int i = 0; i < num1.length(); i++){
			number1[i] = num1.charAt(i);
		}
		
		for(int i = 0; i < num2.length(); i++){
			number2[i] = num2.charAt(i);
		}
		
		int totalSum = 0;
		int k = 1;
		
		for(int i  = number2.length-1; i >= 0; i--){
			totalSum+=(multiple(number2[i], number1))*k;
			k*=10;
		}
		System.out.println(totalSum);
		
		
		sc.close();
		
	}
	
	private static int multiple(char number2, char[] number1){
		
		int mul = 0;
		
		//자릿수
		int k = 1;
		
		int x = Character.getNumericValue(number2);
		for(int i = number1.length-1; i >= 0; i--){
			int y = Character.getNumericValue(number1[i]);
			mul+=(x*y)*k;
			k*=10;
		}
		
		System.out.println(mul);
		return mul;
	}
	
}



