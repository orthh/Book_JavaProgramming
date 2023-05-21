package etc;

import java.util.Arrays;
import java.util.Comparator;

public class ProgComparator {
	
	public static class StringComparator implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			if(o1.charAt(1) > o2.charAt(1)) return 1;
			return -1;
		}
	}
	public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new StringComparator());
        return strings;
    }

	public static void main(String[] args) {
		String[] s = {"abcd", "abce", "cdx"};
		for(String item : solution(s,2)) {
			System.out.println(item);
		}
	}
}
