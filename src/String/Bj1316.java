package String;
import java.util.Scanner;
import java.util.Stack;

public class Bj1316 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		문제
//		그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//
//		단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//
//		출력
//		첫째 줄에 그룹 단어의 개수를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		//a = 97 / z =122
		
		int cnt = 0;

		int laps = sc.nextInt();
		sc.nextLine();

		for(int i = 0; i< laps; i++){
			String word = sc.nextLine();
			if(check(word)){
				cnt++;
			};	
		}
		System.out.println(cnt);
		
		
		sc.close();
	}

	private static boolean check(String word) {
		boolean[] chk = new boolean[26]; //chk[0] = a;
		
		for (int i = 0; i< word.length(); i++){
			if(chk[word.charAt(i)-'a']){
				return false;
			} else {
				char tmp = word.charAt(i);
				chk[word.charAt(i)-'a']=true;
				while(true){
					if(i+1 >= word.length()){
						break;
					}
					if(tmp != word.charAt(++i)){
						i--;
						break;
					}
				}
			}
		}
		return true;
	}
}


