package lab10;

public abstract class AbstractClass {
	abstract void printMessage();
	}

	class Subclass1 extends AbstractClass{
	//@overrider
		void printMessage() {
			System.out.println("This is the first subclass");
	}
		}
	class Subclass2 extends AbstractClass {

		void printMessage() {

		System.out.println("This is second subclass");
		}
	}
	class Test1{
		public static void main (String[] args) {
			AbstractClass Subclass1 = new Subclass1();
			Subclass1.printMessage();
			AbstractClass Subclass2 = new Subclass2();
			Subclass2.printMessage();
		}
	}
		
