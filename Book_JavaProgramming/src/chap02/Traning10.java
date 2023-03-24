package chap02;

import java.util.Scanner;

public class Traning10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 원이 겹치는지 확인
		Scanner sc = new Scanner(System.in);
		
		int aCircleX = sc.nextInt();
		int aCircleY = sc.nextInt();
		int aCircleR = sc.nextInt();

		int bCircleX = sc.nextInt();
		int bCircleY = sc.nextInt();
		int bCircleR = sc.nextInt();
		
		
		double distance = Math.sqrt(Math.pow((aCircleX - bCircleX),2)
				+ Math.pow((aCircleY - bCircleY),2));
		
		if(distance < aCircleR + bCircleR) {
			System.out.println("두 원은 서로 겹친다.");
		}
	}

}
