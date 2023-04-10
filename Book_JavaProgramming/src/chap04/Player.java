package chap04;

import java.util.Scanner;

public class Player {
	String name;
	String word;
	
	public Player(String name) {
		this.name = name;
	}
	
	void getWordFromUser() {
		// 사용자로부터 단어를 입력받는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print(name + ">>");
		word = sc.next();
	}
	
	boolean checkSuccess(String str) {
		if(str.charAt(str.length() - 1) == word.charAt(0)) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
