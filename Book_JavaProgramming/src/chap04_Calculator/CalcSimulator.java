package chap04_Calculator;

import java.util.Scanner;

public class CalcSimulator {
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a= sc.nextInt();
		int b = sc.nextInt();
		String oper = sc.next();
		
		if(oper.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		}else if(oper.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		}else if(oper.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		}else if(oper.equals("/")) {
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		}
	}

	public static void main(String[] args) {
		
		CalcSimulator calc = new CalcSimulator();
		calc.run();

	}

}
