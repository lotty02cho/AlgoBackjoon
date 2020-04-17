package Function;
import java.util.Scanner;

public class Bj4673 {

	public static void main(String[] args) {
//		문제
//		정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
//
//		작성해야 하는 함수는 다음과 같다.
//		
//		Java: long sum(int[] a); (클래스 이름: Test)
//		a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//		리턴값: a에 포함되어 있는 정수 n개의 합
		
//		Scanner sc = new Scanner(System.in);

		boolean[] isNotSelfNum = new boolean[10001];

		for(int i = 1; i<= 10000; ++i){
			int dn = d(i);
			if(dn <= 10000){
				isNotSelfNum[dn] = true;
			}
		}
		for(int i = 1; i <isNotSelfNum.length; ++i){
			if(!isNotSelfNum[i]){
				System.out.println(i);
			}
		}
	}
	
	private static int d(int a){
		int answer = a;
		while(a>0){
			answer += a % 10;
			a/=10;
		}
		return answer;
	}

}
