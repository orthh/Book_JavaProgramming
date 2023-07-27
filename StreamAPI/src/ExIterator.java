import java.util.Iterator;
import java.util.LinkedList;

public class ExIterator {
	public static void main(String[] args) {
		// Iterator<E> 인터페이스
		// 컬렉션에 저장된 요소를 읽어오는 방법을 Iterator 인터페이스로 표준화함.
		// Collection 인터페이스는 Iterator 인터페이스를 구현한 클래스의
		// 인스턴스를 반환하는 iterator() 메소드를 정의하여 각 요소에 접근하도록 하고 있음.
		// 따라서List 와 Set 인터페이스에서도 iterator() 메소드 사용할 수 있음.
		
		LinkedList<Integer> lnkList = new LinkedList<Integer>();
		lnkList.add(4);
		lnkList.add(2);
		lnkList.add(3);
		lnkList.add(1);
		
		Iterator<Integer> iter = lnkList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
