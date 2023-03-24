package chap02;

import java.util.Scanner;

public class Traning11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. if~else문
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		} else if(month == 6 || month == 7 || month == 8){
			System.out.println("여름");
		}else if(month == 9 || month == 10 || month == 11){
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
		
		//2.switch문
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;

		default:
			break;
		}
		
	}

}
