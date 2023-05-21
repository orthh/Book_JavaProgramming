package etc;

import java.util.Arrays;
import java.util.Comparator;

public class BasicComparator {

	
	
	public static class IntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1-o2;
		}

		
	}
	
	public static void main(String[] args) {
		Integer[] numbers = {5,2,8,1,3};
		Arrays.sort(numbers, new IntegerComparator());
		
		for (Integer num : numbers) {
            System.out.println(num);
        }
	}

}
