package lab6;

public class SquareTest {

	public static void main(String[] args) {
		Square square1 = new Square(40);
		System.out.println("Dimensions of square one:");
		System.out.printf("Width: %.2f\n", square1.getWidth());
		System.out.printf("Area: %.2f\n", square1.getArea());
		System.out.printf("Perimeter: %.2f\n", square1.getPerimeter());
		
		Square square2 = new Square (35.9);
		System.out.println("Dimentions of square two:");
		System.out.printf("Width: %.2f\n", square2.getWidth());
		System.out.printf("Area: %.2f\n", square2.getArea());
		System.out.printf("Perimeter: %.2f\n", square2.getPerimeter());
		
	}

}
