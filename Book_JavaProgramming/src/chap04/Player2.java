package chap04;

import java.util.Scanner;

public class Player2 {
	
	String name;
	String word;
	
	public Player2(String name){
		this.name = name;
	}
	
	public void getWordFromUser(String input) {
		Scanner sc = new Scanner(System.in);
		System.out.println(name + ">>");
		this.word = sc.next();
	}
	
	public boolean checkSuccess(String start) {
		int lastIdx = start.length() - 1;
		char lastChar = start.charAt(lastIdx);
		char firstChar = word.charAt(0);
		
		if(lastChar == firstChar) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
