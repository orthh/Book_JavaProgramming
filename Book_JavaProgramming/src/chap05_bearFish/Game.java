package chap05_bearFish;

import java.util.Scanner;

public class Game {
	
	private char[][] arr;
	public Game() {
		arr = new char[10][20];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = '-';
			}
		}
	}
	
	public void printArr(GameObject bear, GameObject fish) {
		char b = bear.getShape();
		char f = fish.getShape();
		arr[bear.getX()][bear.getY()] = b;
		arr[fish.getX()][fish.getY()] = f;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		arr[bear.getX()][bear.getY()] = '-';
		arr[fish.getX()][fish.getY()] = '-';
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		GameObject bear = new Bear(0,0,1);
		GameObject fish = new Fish(5,4,1);
		
		System.out.println("** Bear의 Fish먹기 게임을 시작합니다.**");
		printArr(bear, fish);
		while(true) {
			System.out.print("Bear : wasd >> ");
			bear.move();
			fish.move();
			printArr(bear, fish);
			if(bear.collide(fish)) {
				System.out.println("Bear Wins!!");
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.run();
	}

}
