package chap02;

import java.util.Scanner;

public class Traning09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int circleX = sc.nextInt(); //10
		int circleY = sc.nextInt(); //10
		
		double r = sc.nextDouble(); //6.5
		
		int targetX = sc.nextInt(); //13
		int targetY = sc.nextInt(); //13
		
		double distance = Math.sqrt(Math.pow((targetX - circleX),2)
				+ Math.pow((targetY - circleY),2));
		if(distance < r) System.out.println("안");
		
		
	}

}
