package chap04;

import java.util.Scanner;

public class RectangleSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		System.out.print(">>");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println(rect.getArea());
		

	}

}
