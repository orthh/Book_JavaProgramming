import java.util.Optional;

public class ExOptional {

	public static void main(String[] args) {
		
		// java.util.Optional<T> 클래스
		// Integer나 Double클래스처럼 'T' 타입의 객체를 포장해 주는 래퍼 클래스이다.
		// 이러한 Optional 객체를 사용하면 예상치 못한 NullPointerException 예외를 제공되는
		// 메소드로 간단히 회피할 수 있다.
		// 즉, 복잡한 조건문 없이도 null 값으로 인해 발생하는 예외를 처리할 수 있다.
		
		// of() 메소드나 ofNullable() 메소드를 사용하여 Optional 객체를 생성할 수 있다.
		
		// of() 메소드는 null 이 아닌 명시된 값을 가지는 Optional 객체를 반환한다.
		// 만약of() 메소드를 통해 생성된 Optional객체에 null이 저장되면 NullPointerException
		// 예외가 발생한다.
		
		// 만약 참조 변수의 값이 만에 하나 null 이 될 가능성이 있다면, ofNullable() 메소드를
		// 사용하여 Optional 객체를 생성하는것이 좋다.
		// ofNullable() 메소드는 명시된 값이 null 이 아니면 명시된 값을 가지는 Optional 객체를
		// 반환하며, 명시된 값이 null 이면 비어있는 Optional 객체를 반환한다.
		
		Optional<String> opt = Optional.ofNullable("자바 Optional 객체");
		System.out.println(opt.get());
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		Optional<String> opt2 = Optional.ofNullable(null);
		if(opt2.isPresent()) {
			System.out.println(opt2.get()); // 실행x
		}
		
		// null 대신에 대체할 값을 지정할 수도 있다.
		// 1. orElse() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면
		//    인수로 전달된 값을 반환함.
		// 2. orElseGet() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면
		//    인수로 전달된 람다 표현식의 결괏값을 반환함.
		// 3. orElseThrow() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면
		//    인수로 전달된 예외를 발생시킴
		
		Optional<String> opt3 = Optional.ofNullable(null);
		System.out.println(opt3.orElse("빈 Optional 객체"));
		System.out.println(opt3.orElseGet(String::new));
		
		
		
		
		
		
		
	}
}
