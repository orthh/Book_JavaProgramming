package chap03;

public class AtoZWhile {

	public static void main(String[] args) {
		char c = 'A';
		
		do {
			System.out.println(c);
			c = (char)(c+1);
		} while(c<='Z');

	}

}
