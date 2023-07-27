import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex00Lamda {
	
	// 함수형 인터페이스
	@FunctionalInterface
	interface LambdaFunction{
		int min(int x, int y);
	}
	
	
	public static void main(String[] args) {
		
		// 람다식 : 익명객체를 생성하기 위한 표현식
		// 간단히 말해 메소드를 하나의 간결한 식으로 표현한 것
		
		// 람다식 특징
		// 1. 메소드 이름과 반환타입의 경우에는 생략할 수 있다.
		// 2. 매개변수의 타입을 추론할 수 있는 경우에는 타입을 생략할 수 있다.(대부분 생략가능)
		// 3. 매개변수가 하나인 경우 괄호()를 생략할 수 있다.
		// 4. 함수의 몸체가 하나의 명령문만으로 이루어진 경우 중괄호{} 생략할 수 있다.(이때 세미콜론x)
		// 5. 함수의 몸체가 하나의 return 문으로만 이루어진 경우에는 중괄호를 생략할 수 없다.
		// 6. return문 대신 표현식을 사용할 수 있으며, 이때 반환값은 표현식의 결괏값이 된다.(이때 세미클론x)
		
		LambdaFunction lambdaFunction = (x,y) -> x < y ? x : y;
		System.out.println(lambdaFunction.min(2,3)); // 2
		
		// 메소드 참조(Method Reference)
		// 메소드 참조는 람다 표현식이 단 하나의 메소드만을 호출하는 경우에 해당 람다 표현식에서 불필요한
		// 매개변수를 제거하고 사용할 수 있도록 도와준다.
		// 함수형 인터페이스를 람다식이 아닌 일반 메소드를 참조시켜 선언하는 방법.
		// 참조 가능한 메소드는 일반메소드, static 메소드, 생성자
		// 메소드 참조를 사용하면 람다식과 마찬가지로 함수형 인터페이스로 반환된다.
		
		// 문법
		// 클래스이름::메소드이름
		// 참조변수이름::메소드이름
		
		// 예제
		LambdaFunction lambdaFunction3 = (x,y) -> Math.min(x, y);
		LambdaFunction lambdaFunction2 = Math::min;
		// 위 두개는 같은코드
		// Math::min => Math클래스(참조변수) 의 메소드 min 을 사용하고,
		// ::다음인 min 메소드의 매개변수를 min의 매개변수 수만큼 받는다.
		
		System.out.println(lambdaFunction2.min(2,3)); // 2
		
		// 일반 메소드 참조
		int[] arr = {1,2,3,4,5};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		// int[] 타입의 arr를 intStream 으로 변환하고, 래퍼 클래스로 박싱하고, List로 바꾼다.
		
		list.forEach(System.out::println);
		
		// 생성자 참조
		List<hihi> list2 = Arrays.stream(arr).mapToObj(x -> new hihi(x)).collect(Collectors.toList());
		List<hihi> list3 = Arrays.stream(arr).mapToObj(hihi::new).collect(Collectors.toList());
		// 위와 아래는 같음
		
			
	}
	
	
	public static class hihi{
		private int a;
		public hihi(int a) {
			this.a = a;
		}
		public int getA() {
            return a;
        }
	}
	
	
}
