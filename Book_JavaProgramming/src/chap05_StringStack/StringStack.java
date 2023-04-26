package chap05_StringStack;

public class StringStack implements Stack{

	private String[] arr;
	int cnt = 0;
	
	public StringStack(int n) {
		arr = new String[n];
	}
	
	@Override
	public int length() {
		return cnt;
	}

	@Override
	public int capacity() {
		return arr.length;
	}

	@Override
	public String pop() {
		return arr[cnt--];
	}

	@Override
	public boolean push(String val) {
		if(cnt < arr.length) {
			arr[cnt++] = val;
		}else {
			return false;
		}
		return true;
	}

}
