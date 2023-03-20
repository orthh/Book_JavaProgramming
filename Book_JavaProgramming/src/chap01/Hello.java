package chap01;

public class Hello {

	public static void main(String[] args) {
		
		//javap error 환경변수?
		//환경변수 셋팅은 교육환경에 나중에 문제될수 있어서 스킵
		
		int i;
		int j;
		char a;
		String b;
		
		final int TEN = 10;
		
		i=1;
		j=sum(i,TEN);
		a= '?';
		b = "Hello";
		java.lang.System.out.println(a);
		System.out.println(b);
		System.out.println(TEN);
		System.out.println(j);
		
		
		
	}
	static int sum(int x,int y) {
		return x+y;
	}

}
