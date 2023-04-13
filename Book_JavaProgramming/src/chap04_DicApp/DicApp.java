package chap04_DicApp;

import java.util.Scanner;

public class DicApp {
	

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");

		while(true) {
			System.out.print("한글 단어?");
			String input = sc.next();
			if(input.equals("그만")) break;
			if(Dictionary.kor2Eng(input).equals("false")) {
				System.out.println(input + "은 저희 사전에 없습니다.");
			}else {
				System.out.println(Dictionary.kor2Eng(input));
			}
			
			
		}
	}

	public static void main(String[] args) {
		DicApp da = new DicApp();
		
		da.run();

	}

}
