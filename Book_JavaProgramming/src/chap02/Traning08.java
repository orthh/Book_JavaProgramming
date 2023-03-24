package chap02;

import java.util.Scanner;

public class Traning08 {
	public static boolean inRect(int x, int y, int rectx1
			, int recty1, int rectx2, int recty2 ) {
		if((x>=rectx1 && x<=rectx2)&&(y>=recty1 && y<=recty2)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		if(inRect(x1,y1,100,100,200,200) == true
				|| inRect(x2,y2,100,100,200,200) == true) {
			System.out.println("충돌");
		}
		
		

	}

}
