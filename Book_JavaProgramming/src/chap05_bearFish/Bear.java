package chap05_bearFish;

import java.util.Scanner;

public class Bear extends GameObject{

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		switch (key) {
		case "d":
			this.y += distance;
			break;
		case "w":
			this.x -= distance;
			break;
		case "a":
			this.y -= distance;
			break;
		case "s":
			this.x += distance;
			break;
		}
	}

	@Override
	protected char getShape() {
		return 'B';
	}
	
}
