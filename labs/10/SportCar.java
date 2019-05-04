package lab10;

public class SportCar implements Printable{
	String brand;
	int idNum;
	 public SportCar(String brand, int idNum) {
		 this.idNum=idNum;
		 this.brand=brand;
	 }
	 @Override
	 public void print() {
		 System.out.println("The car's brand is "+ brand + "and the car's id number is " + idNum);
	 }
	 
}
