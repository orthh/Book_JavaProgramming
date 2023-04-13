package chap04_PhoneBook;

import java.util.Scanner;

public class PhoneBook {
	Scanner sc = new Scanner(System.in);
	
	Phone[] pArr;
	
	
	public int searchPhone(String name) {
		int result = -1;
		for(int i=0; i<pArr.length; i++) {
			if(pArr[i].getName().equals(name)) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public void run() {
		System.out.print("인원수>>");
		pArr = new Phone[sc.nextInt()];
		sc.nextLine(); // 캐시 제거
		for(int i=0; i<pArr.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
			String[] input = sc.nextLine().split(" ");
			pArr[i] = new Phone(input[0], input[1]);
			
		}
		System.out.println("저장되었습니다.");
		
		while(true) {
			System.out.print("검색할 이름 >> ");
			String searName = sc.next();
			if(searName.equals("그만")) break;
			if(searchPhone(searName) == -1) {
				System.out.println(searName + " 이 없습니다.");
			}else {
				System.out.println(searName + "의 번호는 " + pArr[searchPhone(searName)].getTel() + " 입니다.");
			}
			
			
			
		}
	}

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.run();

	}

}
