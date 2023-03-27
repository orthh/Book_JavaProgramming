package chap03;

import java.util.Scanner;

public class avgUntilInput {

	public static void main(String[] args) {
		//-1이 입력되기 전까지 입력된 모든 수의 평균 구하기
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 "
				+ "-1을 입력하세요");
		
		int n = sc.nextInt();
		while( n != -1 ) {
			sum += n;
			count ++;
			n = sc.nextInt();
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		}else {
			System.out.println(count + "개");
			System.out.println("평균은" + (double)sum / count);
		}
		
		

	}

}
