package chap05_bearFish;

import java.util.Random;

public class Fish extends GameObject{
	
	int cnt = 1;
	
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {	
		
		Random rd = new Random();
		int key = 0;
		if(cnt <= 3) {
			key = 99;
			cnt++;
		}else {
			key = rd.nextInt(4) + 1;
			cnt++;
			if(cnt >= 6) {
				cnt = 1;
			}
		}
		switch (key) {
		case 1:
			this.y++;
			break;
		case 2:
			this.x--;
			break;
		case 3:
			this.y--;
			break;
		case 4:
			this.x++;
			break;
		case 99:
			
			break;
	}
}

	@Override
	protected char getShape() {
		return '@';
	}
}
