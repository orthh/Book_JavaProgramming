package chap04;

import java.util.Scanner;

public class WordGameApp {
	
	int peopleCount;
	Player[] playerList;
	String start;

	public WordGameApp() {
		start = "아버지";
	}
	public WordGameApp(String start) {
		this.start = start;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		peopleCount = sc.nextInt();
		playerList = new Player[peopleCount];
		
		// 객체 생성
		for(int i=0; i<playerList.length; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			playerList[i] = new Player(sc.next());
		}
		
		System.out.println("시작하는 단어는 " + start + " 입니다.");
		
		// 승패 여부
		int cnt = 0;
		while(true) {
			playerList[cnt].getWordFromUser();
			if(playerList[cnt].checkSuccess(start)) {
				start = playerList[cnt].word;
			}else {
				System.out.println(playerList[cnt].name + "이 졌습니다.");
				break;
			}
			cnt = (cnt+1)%peopleCount;
		}
		
		
	}
	
	public static void main(String[] args) {
		WordGameApp game1 = new WordGameApp("아버지");
		game1.run();
	}
	

}
