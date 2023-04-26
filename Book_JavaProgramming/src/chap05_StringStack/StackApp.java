package chap05_StringStack;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringStack ss;

		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int le = sc.nextInt();
		ss = new StringStack(le);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.next();
			if(!ss.push(str)) break;
		}
		
	}

}
