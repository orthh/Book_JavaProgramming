import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03최종연산 {

	public static void main(String[] args) {
		
		// 스트림의 최종연산
		// : 스트림API에서 중개 연산은 통해 변환된 스트림은 마지막으로 최종연산을 통해
		//   각 요소를 소모하여 결과를 표시한다.
		//   즉, 지연되었던 모든 중개 연산들이 최종 연산시에 모두 수행되는 것이다.
		//   이렇게 최종 연산 시에 모든 요소를 소모한 해당 스트림은 더는 사용할 수 없다.
		
		// 메소드들
		// 1. forEach()
		
		// 2. reduce()
		//           : reduce() 메소드는 첫 번째와 두 번째 요소를 가지고 연산을 수행한 뒤,
		//             그 결과와 세번째 요소를 가지고 또다시 연산을 수행...
		//             reduce() 의 메소드의 반환타입은 Optional<T> 가 아닌 T타입.
		List<String> l1 = Arrays.asList("넷", "둘", "셋", "하나");
		String result = l1.stream().reduce("시작", (s1,s2) -> s1 + "++" + s2);
		System.out.println(result);
		
		// 요소의 검색
		// 3. findFirst() , findAny()
		//              : 해당 스트림에서 첫 번째 요소를 참조하는 Optional 객체를 반환한다.
		//                두 메소드 모두 비어있는 스트림에서는 비어있는 Optional 객체를 반환한다.
		//   두 메소드의 결과는 같다. 하지만 병렬 스트림의 경우 findAny() 메소드를 사용해야한다.
		Optional<String> oi1 = l1.stream().sorted().findFirst();
		System.out.println(oi1.get()); // 넷
		
		// 요소의 검사
		// 4. anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족할 경우 true를 반환함.
		// 5. allMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족할 경우 true를 반환함.
		// 6. noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 앟ㄴ을 경우에 true를 반환.
		// 세 요소 모두 인수로 Predicate 객체를 전달받으며, 요소의 검사 결과는 boolean값으로 반환
		List<Integer> l2 = Arrays.asList(30,90,70,10);
		
		System.out.println(l2.stream().anyMatch(n -> n > 80)); // true
		System.out.println(l2.stream().allMatch(n -> n> 80));  // false
		System.out.println(l2.stream().noneMatch(n -> n> 80)); // false
		
		// 요소의 통계
		// 7. count() : 해당 스트림의 요소의 총 개수를 long타입의 값으로 반환
		// 8. min() : 가장큰값을 가지는 요소를 참조하는 Optional 객체를 얻음
		// 9. max() : 가장 작은값을 가지는 요소를 참조하는 Optional 객체를 얻음
		IntStream is1 = IntStream.of(30,90,70,10);
		IntStream is2 = IntStream.of(30,90,70,10);
		
		System.out.println(is1.count());
		System.out.println(is2.max().getAsInt());
		
		// 요소의 연산
		// 10. sum()
		// 11. average()
		IntStream is3 = IntStream.of(30,90,70,10);
		DoubleStream ds1 = DoubleStream.of(30.3, 90,9, 70.7, 10.1);
		
		System.out.println(is3.sum());
		System.out.println(ds1.average().getAsDouble());
		
		// 요소의 수집
		// 12. collect() : 인수로 전달되는 Collectors 객체에 구현된 방법대로 스트림의 요소 수집
		//    종류 - toArray(), toCollection(), toList(), toSet(), toMap()
		Stream<String> st4 = Stream.of("넷", "둘", "하나", "셋");
		List<String> ls3 = st4.collect(Collectors.toList());
		
		Iterator<String> iter = ls3.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		
		// partitioningBy()
		Stream<String> st5 = Stream.of("HTML", "CSS", "JAVA", "PHP");
		Map<Boolean, List<String>> patition = st5
				.collect(Collectors.partitioningBy(s -> (s.length() % 2) == 0));
		
		System.out.println(patition.get(false));
		System.out.println(patition.get(true));
		
		
		
		
		
		
		
		
		
		
		
	}

}
