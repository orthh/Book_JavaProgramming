package chap02;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = 1;
		System.out.println(a);
		
		for(int i = 1; i<=10; i++) {
			var b= 1;
			System.out.println(b);
		}
//		System.out.println(b); 지역변수
		
		System.out.println((byte)(128 + 128) + (int) 22.9);
		System.out.println(2 == 0 ? "c는 0 " : "c는 0이 아님"); 
		
	}

}
