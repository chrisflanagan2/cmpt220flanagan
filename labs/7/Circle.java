package lab7;

public class Circle {

	public static void main(String[] args) {
		Circle c1 = new Circle(2,2,5.5);
		System.out.println("Area: " +c1.getArea());
		System.out.println ("Perimeter: "+c1.getPerimeter());
		System.out.println(c1.contains(3,3));
		Circle c2 = new Circle(4,5,10.5);
		System.out.println(c1.contains(c2));
		System.out.println(c1.overlaps(new Circle (3,5,2.3)));
		
		

	}
	private double x;
	private double y;
	private double radius;
	
	
	public Circle () {
		this.x=0;
		this.y=0;
		this.radius=1;
	}
	public Circle(double x, double y, double radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public boolean contains (double x, double y) {
		if (x <= radius && y<=radius) return true;
		return false;
	}
	public boolean contains(Circle circle) {
		if (circle.getPerimeter()<this.getPerimeter())
			if (circle.x + circle.radius < this.y + this.radius)
				if (circle.y + circle.radius < this.y + this.radius) return true;
				
		return false;
	}
	public boolean overlaps(Circle circle) {
		double distance = Math.pow((this.x-circle.x) * (this.x - circle.x) +(this.y-circle.y) * (this.y -circle.y), 0.5);
		if (distance > (this.radius + circle.radius)) return false;
		return true;
	}
}	

