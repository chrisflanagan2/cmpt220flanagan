package lab10;

	public abstract class Manager extends Employee{
		Manager(String name, int age, int hourRate){
			
			super();
		}
		public double salary(double hours) {
			return hourRate * hours;
		   }
		
		

		
}
