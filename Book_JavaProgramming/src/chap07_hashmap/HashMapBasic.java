package chap07_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapBasic {

	public static void main(String[] args) {
		
		HashMap<String, String> h = new HashMap<>();
		h.put("apple", "사과"); // 키 : apple , 밸류 : 사과
		String kor = h.get("apple"); // 키값이 apple 인 밸류 반환
		System.out.println(kor); // 사과
		h.remove("apple");   // 키가apple 인 키 밸류값 삭제
		System.out.println(h.get("apple")); // null
		
		h.put("apple", "사과"); // 키 : apple , 밸류 : 사과
		h.put("apple", "감자"); // 키 : apple , 밸류 : 사과
		h.put("apple", "고구마"); // 키 : apple , 밸류 : 사과
		System.out.println(h.size()); // 사이즈
		System.out.println(h.get("apple")); // 고구마
		
		// 해시맵의 keySet() 메소드는 모든 '키'를 Set 컬렉션으로 만들어 리턴한다.
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key + "  " + value);
		}
		

	}

}
