package chap02;

import java.util.Scanner;

public class Traning12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>> ");
		
		int num1 = sc.nextInt();
		String operator = sc.next();
		int num2 = sc.nextInt();
		
		int result = 0;
		if(operator.equals("+")) {
			result = num1 + num2;
			System.out.println(result);
		}else if(operator.equals("*")){
			
			result = num1 * num2;
			System.out.println(result);
		}else if(operator.equals("/")){
			if(num2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
			}else {
				result = num1 / num2;
				System.out.println(result);
			}

		}else if(operator.equals("=")){
			//????뭔 의도임?
		}

	}

}
