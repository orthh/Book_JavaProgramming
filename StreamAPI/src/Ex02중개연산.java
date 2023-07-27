import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02중개연산 {

	public static void main(String[] args) {
		
		// 스트림의 중개 연산
		// 스트림API 에 의해 생성된 초기 스트림은 중개 연산을 통해 또 다른 스트림으로 변환된다.
		// 이러한 중개 연산은 스트림을 전달받아 스트림을 반환하므로, 중개연산은 연속으로 연결해서 사용할 수 있다.
		// 스트림의 중개 연산은 필터-맵 기반의 API를 사용함으로 지연(lazy)연산을 통해
		// 성능을 최적화 할 수 있다.
		
		// 중개연산 메소드 종류
		// 1. 스트림 필터링 : filter(), distinct()
		// 2. 스트림 변환 : map(), flatMap()
		// 3. 스트림 제한 : limit(), skip()
		// 4. 스트림 정렬 : sorted()
		// 5. 스트림 연산 결과 확인 : peek()
		
		// 1-1. filter() 
		//      : (x -> x == 0) 문장안의 값이 true인 값만 반환 
		int[] a = {1,2,3,4,5,6,7,8,9,10,1,4,5,3,7};
		List<Integer> l1 = Arrays.stream(a).boxed().collect(Collectors.toList());
		l1.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
		
		// 1-2. distinct() 
		//      : 해당 스트림에서 중복된 요소가 제거된 스트림 반환
		l1.stream().distinct().forEach(System.out::println);
		
		// 2-1. map() 
		//      : 해당 스트림의 요소들을 주어진 함수에 인수로 전달하여 
		//            그 반환값들로 이루어진 새로운 스트림 반환
		//      만약, 해당 스트림의 요소가 배열이라면, flatMap() 메소드를 사용하여
		//           각 배열의 각 요소의 반환값을 하나로 합친 새로운 스트림 얻을 수 있다.
		String[] s1 = {"HTML", "CSS", "JAVA", "JAVASCRIPT"};
		List<String> l2 = Arrays.stream(s1).collect(Collectors.toList());
		l2.stream().map(x -> x.length()).forEach(System.out::println);
		
		// 2-2. flatMap()
		// 여러 문자열로 저장된 배열을 각 문자열에 포함된 단어로 이루어진 스트림으로 변환하는 예제
		String[] s2 = {"I study hard", "You study JAVA", "I am hungry"};
		Stream<String> st = Arrays.stream(s2);
		st.flatMap(s -> Stream.of(s.split(" "))).forEach(System.out::println);
		
		// 스트림 제한
		// 3-1. limit() 
		//           : 메소드는 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진
		//           새로운 스트림을 반환한다
		IntStream is1 = IntStream.range(0, 11);
		is1.limit(5).forEach(x-> System.out.println(x + " ")); // 0 1 2 3 4 5 
		
		// 3-2. skip()
		//           : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로
		//             이루어진 새로운 스트림 반환
		System.out.println("------------------");
		IntStream is2 = IntStream.range(0, 11);
		is2.skip(5).forEach(x-> System.out.println(x + " ")); // 0 1 2 3 4 5 
		
		// 4-1. sorted()
		//             : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬.
		//               이때 비교자를 전달하지 않으면 기본적으로 사전 편찬 순으로 정렬
		Stream<String> st2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
		st2.sorted().forEach(System.out::println);
		Stream<String> st3 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
		st3.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		
		// peek()
		//      : 결과 스트림으로부터 요소를 소모하여 추가로 명시된 동작을 수행한다.
		//        이 메소드는 원본 스트림에서 요소를 소모하지 않으므로, 주로 연산과 연산 사이에
		//        결과를 확인하고 싶을때 사용.
		//        디버깅용도로 많이 사용
		List<Integer> l3 = Arrays.asList(7,5,5,2,1,2,3,5,4,6);
		l3.stream().peek(s -> System.out.println("원본스트림 : " + s))
			.skip(2)
			.peek(s -> System.out.println("skip(2) 실행 후 : " + s))
			.limit(5)
			.peek(s -> System.out.println("limit(5) 실행 후 : " + s))
			.sorted()
			.peek(s -> System.out.println("sorted() 실행 후 : " + s))
			.forEach(n -> System.out.println(n));
		
		
		
	}

}
