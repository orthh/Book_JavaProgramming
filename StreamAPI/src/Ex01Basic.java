import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01Basic {

	public static void main(String[] args) {
		
		// Java는 객체지향 언어이기 떄문에 기본적으로 함수형 프로그래밍이 불가능.
		// 하지만, JDK8부터 Stream API 와 람다식, 함수형 인터페이스 등을 지원하면서 
		// 함수형 프로그래밍할 수 있는 API들을 제공해주고 있다.
		// 그 중, Stream API 는 데이터를 추상화하고, 처리하는데 자주 사용되는 함수들을
		// 정의해두었다. 
		// 여기서 데이터를 추상화하였다는 것은 데이터의 종류에 상관 없이 같은 방식으로
		// 데이터를 처리할 수 있다는 것을 의미하며, 그에 따라 재사용성을 높일 수 있다.

		// 자바에서 제공하는 모든 컬렉션의 최고 상위 조상인 Collection 인터페이스에는 
		// stream() 메소드가 정의되어 있다.
		// 따라서 모든 List와 Set 컬렉션 클래스에서도 stream() 메소드로 
		// 스트림을 생성할 수 있다.
		// 또한 parallelStream() 메소드를 사용하면 병렬 처리가 가능한 스트림을
		// 생성할 수 있다.
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(3);

		list.stream().forEach(System.out::println);
		
		// 배열
		// 배열에 관한 스트림을 생성하기 위해 Arrays클래스에는 
		// 다양한 형태의 stream() 메소드가 정의되어 있다.
		// 또한, 기본타입인 int, long, double 형을 저장할 수 있는 배열에 관한 스트림이
		// 별도로 정의되어 있다.
		// 이러한 스트림은 java.util.stream 패키지의 IntStream, LongStream, DoubleStream
		// 인터페이스로 각각 제공된다.
		
		String[] arr = {"하나", "둘", "셋", "넷"};
		
		Arrays.stream(arr).forEach(System.out::println);
		Stream<String> s = Arrays.stream(arr);
		s.forEach(i -> System.out.println(i));
		
		// 배열의 특정 부분만을 이용한 스트림 생성
		Stream<String> s2 = Arrays.stream(arr, 1, 3);
		s2.forEach(System.out::println); // 1번쨰부터 3-1 인덱스까지 파이썬과 같음 
		
		// 가변 매개변수에서 스트림 생성
		Stream<Double> stream = Stream.of(4.2, 2.5, 3.1, 1.9);
		stream.forEach(System.out::println);
		
		// 지정된 범위의 연속된 정수
		// IntStream 이나 LongStream 인터페이스에는 range() 와 rangeClosed() 메소드가 정의되있다.
		// range() 메소드는 명시된 시작 정수를 포함하지만, 명시된 마지막 정수는 포함하지 않는
		// 스트림을 생성한다.
		IntStream is1 = IntStream.range(1, 4);
		is1.forEach(System.out::println); // 1 2 3
		
		IntStream is2 = IntStream.rangeClosed(1, 4);
		is2.forEach(System.out::println); // 1 2 3 4
		
		// 특정 타입의 난수들
		// Random 클래스에는 ints(), longs(), doubles() 와 같은 메소드 정의되 있음.
		// 이 메소드들은 매개변수로 스트림의 크기를 long타입으로 전달받을 수있다.
		// 이 메소드들은 만약 매개변수를 전달받지 않으면 크기가 정해지지 않은 무한 스트림을 반환한다.
		// 이때에는 limit() 메소드를 사용하여 따로 스트림의 크기를 제한해야 한다.
		IntStream is3 = new Random().ints(4);
		is3.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
