package lab10;


// JA: Where is the Printable interface?
public class Rectangle implements Printable {
	private double width;
	private double length;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public void print() {
		System.out.println("The rectangle has the width " + "and the length " + length);
		
	}
	
	
}


