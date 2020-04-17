package String;
import java.util.Scanner;

public class Bj5622 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		문제
//		상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
//
//
//
//		전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
//		숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
//
//		상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
//
//		할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다.(UNUCIC)
//
//		출력
//		첫째 줄에 다이얼을 걸기 위해서 필요한 시간을 출력한다.(36)
//		num1 = 2s		ABC =
//		num2 = 3s		DEF =
//	    num3 = 4s		GHI =
//      num4 = 5s		JKL =
//		num5 = 6s		MNO =
//		num6 = 7s		PQRS
//		num7 = 8s		TUV
//		num8 = 9s		WXYZ
//		...
//      num9 = 10s
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int sec = 0;
		for(int i = 0; i< word.length(); i++){
			if(word.charAt(i)=='A' ||word.charAt(i)=='B' || word.charAt(i)=='C'){
				sec+=3;
			} else if (word.charAt(i)=='D' ||word.charAt(i)=='E' || word.charAt(i)=='F'){
				sec+=4;
			} else if (word.charAt(i)=='G' ||word.charAt(i)=='H' || word.charAt(i)=='I'){
				sec+=5;
			} else if (word.charAt(i)=='J' ||word.charAt(i)=='K' || word.charAt(i)=='L'){
				sec+=6;
			} else if (word.charAt(i)=='M' ||word.charAt(i)=='N' || word.charAt(i)=='O'){
				sec+=7;
			} else if (word.charAt(i)=='P' ||word.charAt(i)=='Q' || word.charAt(i)=='R' || word.charAt(i)=='S'){
				sec+=8;
			} else if (word.charAt(i)=='T' ||word.charAt(i)=='U' || word.charAt(i)=='V'){
				sec+=9;
			} else if (word.charAt(i)=='W' ||word.charAt(i)=='X' || word.charAt(i)=='Y' || word.charAt(i)=='Z'){
				sec+=10;
			} else {
				sec+=11;
			}
		}
		System.out.println(sec);
		
		
		
		
	}
}
