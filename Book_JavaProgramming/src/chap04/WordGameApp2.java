package chap04;

import java.util.Scanner;

public class WordGameApp2 {
	
	String start;
	Player[] playerList;
	
	public WordGameApp2(String start) {
		this.start = start;
	}
	
	// 게임 주요 진행
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까?");
		int num = sc.nextInt();
		playerList = new Player[num];
		for(int i=0; i<num; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			playerList[i] = new Player(sc.next());
		}
		
		System.out.println("시작하는 단어는 " + start + " 입니다.");
		
		int idx = 0;
		while(true) {
			playerList[idx].getWordFromUser();
			if(playerList[idx].checkSuccess(start)) {
				start = playerList[idx].word;
				
			}else {
				System.out.println(playerList[idx].name + "이 졌습니다.");
				break;
			}
			idx = (idx + 1) % num;
			
		}
		
	}

	public static void main(String[] args) {
		WordGameApp2 wg2 = new WordGameApp2("아버지");
		wg2.run();

	}

}
