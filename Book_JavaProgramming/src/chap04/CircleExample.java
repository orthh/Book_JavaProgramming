package chap04;

public class CircleExample {

	public static void main(String[] args) {
		
		Circle pizza = new Circle();
		
		pizza.radius = 10;
		pizza.name = "자바피자";
		System.out.println(pizza.radius);
		double area = pizza.getArea();
		System.out.println(area);
		
		Circle donut = new Circle();
		
		donut.radius = 2;
		donut.name = "자바도넛";
		double area2 = donut.getArea();
		System.out.println(area2);

	}

}
