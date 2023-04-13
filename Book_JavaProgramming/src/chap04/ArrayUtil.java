package chap04;

public class ArrayUtil {
	
	public static int[] concat(int[] a, int[] b) {
		// 배열 a와 b를 연결한 새로운 배열 리턴
		int[] temp = new int[a.length + b.length];
		
		for(int i=0; i<a.length; i++) {
			temp[i] = a[i];
		}
		for(int i = 0; i<b.length; i++) {
			temp[i + a.length] = b[i];
		}
		return temp;
	}
	
	public static void print(int[] a) {
		for(int item : a) {
			System.out.print(item + " ");
		}
		
	}

	public static void main(String[] args) {
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
		

	}

}
