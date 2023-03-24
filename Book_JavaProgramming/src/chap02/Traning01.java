package chap02;

import java.util.Scanner;

public class Traning01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1번문제
//		int won = sc.nextInt();
//		System.out.printf("%.1f$",won / 1100.0);
		
		//2번문제
//		int num = sc.nextInt();
//		System.out.println(num / 10 == num % 10 ? 
//				"Yes! 10의 자리와 1의 자리가 같습니다." : "다릅니다"
//		);
		
		//3번문제
//		int num = sc.nextInt();
//		if(num / 50000 >= 1) {
//			System.out.println("5만원권 " + num/50000 + "매" );
//			num -= (50000 * (num / 50000));
//		}
//		if(num / 10000 >= 1) {
//			System.out.println("만원권 " + num/10000 + "매" );
//			num -= (10000 * (num / 10000));
//		}
//		if(num / 1000 >= 1) {
//			System.out.println("천원권 " + num/1000 + "매" );
//			num -= (1000 * (num / 1000));
//		}
//		if(num / 100 >= 1) {
//			System.out.println("백원 " + num/100 + "개" );
//			num -= (100 * (num / 100));
//		}
//		if(num / 50 >= 1) {
//			System.out.println("오십원 " + num/50 + "개" );
//			num -= (50 * (num / 50));
//		}
//		if(num / 10 >= 1) {
//			System.out.println("십원 " + num/10 + "개" );
//			num -= (10 * (num / 10));
//		}
//		if(num / 1 >= 1) {
//			System.out.println("일원 " + num/1 + "개" );
//			num -= (1 * (num / 1));
//		}
		
		//4번문제  -  리팩토링 필요
//		int num1 = sc.nextInt(); //20
//		int num2 = sc.nextInt(); //100
//		int num3 = sc.nextInt(); //33
//		
//		int middle = 0;
//
//		if(num1 < num2 && num2 < num3) {
//			middle = num2;
//		}
//		if(num1 < num2 && num2 > num3) {
//			if(num1 < num3) {
//				middle = num3;
//			}else {
//				middle = num1;
//			}
//		}
//		if(num1 > num2 && num2 > num3) {
//			middle = num2;
//		}
//		if(num1 > num2 && num2 < num3) {
//			if(num1 > num3) {
//				middle = num3;
//			}else {
//				middle = num1;
//			}
//		}
//		System.out.println(middle);

		//5번문제 
//		int a = sc.nextInt(); 
//		int b = sc.nextInt(); 
//		int c = sc.nextInt();
//		
//		if(a+b > c && b+c > a && a+c > b) {
//			System.err.println("가능");
//		}else {
//			System.out.println("불가능");
//		}
		
		//6번문제
//		int num = sc.nextInt();
//		
//		int num1 = num % 10;
//		int num10 = num / 10 ;
//		
//		boolean isIn1 = num1 == 3 || num1 ==6 || num1 == 9 ;
//		boolean isIn10 = num10 == 3 || num10 ==6 || num10 == 9 ;
//		
//		if(isIn1) {
//			if(isIn10) {
//				System.out.println("박수짝짝");
//			}else {
//				System.out.println("박수짝");
//			}
//		}else {
//			if(isIn10) {
//				System.out.println("박수짝");
//			}
//		}
		
		//7번문제
//		int rectangleACoordX = 100;
//		int rectangleACoordY = 100;
//		
//		int rectangleBCoordX = 200;
//		int rectangleBCoordY = 200;
//		
//		int inputX = sc.nextInt();
//		int inputY = sc.nextInt();
//		
//		if(inputX >= rectangleACoordX 
//				&& inputX <= rectangleBCoordX
//				&& inputY >= rectangleACoordY 
//				&& inputY <= rectangleBCoordY) {
//			System.out.println("(" + inputX + "," + inputY + ") 는 사각형 안에 있습니다.");
//		}
//			
		//8번문제
		
		
	}

}
