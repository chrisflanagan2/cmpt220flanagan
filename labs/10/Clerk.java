package lab10;

// JA: Where is the Employee abstract class?
public class Clerk extends Employee{
	 public Clerk(String name, double age, double hourRate) {

	       super();
	   }

	   @Override

	   public double salary(double hours) {

	       return hourRate*hours;
	   }
}
	   
