package String;
import java.util.Scanner;

public class Bj2941 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
//
//		크로아티아 알파벳	변경
//		č	c=
//		ć	c-
//		dž	dz=
//		đ	d-
//		lj	lj
//		nj	nj
//		š	s=
//		ž	z=
//		예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//
//		dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
//
//		입력
//		첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
//		(ljes=njak)
//
//		단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
//
//		출력
//		입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//		(6)
		
		Scanner sc = new Scanner(System.in);
		String croaWord = sc.nextLine();
		int wordCnt = 0;
		for(int i = 0; i < croaWord.length(); i++){
			System.out.println("croaWord.length() "+croaWord.length());
			if(croaWord.length()==1){
				wordCnt++;
				break;
			} else if(croaWord.length()==2){
				if(croaWord.charAt(i)=='c' && i+1<croaWord.length()){
					if(croaWord.charAt(i+1)=='='){
						i++;
						wordCnt++;
					} else if(croaWord.charAt(i+1)=='-'){
						i++;
						wordCnt++;					
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='d' && i+1<croaWord.length()){
					if(croaWord.charAt(i+1)=='-'){
						i++;
						wordCnt++;					
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='l' && i+1<croaWord.length()){
					if(croaWord.charAt(i+1)=='j'){
						i++;
						wordCnt++;
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='n' && i+1<croaWord.length()){
					if(croaWord.charAt(i+1)=='j'){
						i++;
						wordCnt++;
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='s' && i+1<croaWord.length()){
					if(croaWord.charAt(i+1)=='='){
						i++;
						wordCnt++;
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='z' && i+1<croaWord.length()){
					if(croaWord.charAt(i+1)=='='){
						i++;
						wordCnt++;
					} else{
						wordCnt++;
					}
				} else{
					wordCnt++;
				}
			} else {
				if(croaWord.charAt(i)=='c'){
					if(croaWord.charAt(i+1)=='='){
						i++;
						wordCnt++;
					} else if(croaWord.charAt(i+1)=='-'){
						i++;
						wordCnt++;					
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='d'){
					if(croaWord.charAt(i+1)=='z'){
						if(croaWord.charAt(i+2)=='='){
							i+=2;
							wordCnt++;
						}
					} else if(croaWord.charAt(i+1)=='-'){
						i++;
						wordCnt++;					
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='l'){
					if(croaWord.charAt(i+1)=='j'){
						i++;
						wordCnt++;
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='n'){
					if(croaWord.charAt(i+1)=='j'){
						i++;
						wordCnt++;
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='s'){
					if(croaWord.charAt(i+1)=='='){
						i++;
						wordCnt++;
					} else{
						wordCnt++;
					}
				} else if(croaWord.charAt(i)=='z'){
					if(croaWord.charAt(i+1)=='='){
						i++;
						wordCnt++;
					} else{
						wordCnt++;
					}
				} else{
					wordCnt++;
				}
			}
		}
		System.out.println(wordCnt);
		
		sc.close();
	}
}


