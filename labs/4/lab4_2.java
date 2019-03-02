package lab4;

public class lab4_2 {
	public static void main(String [] args) {
		
		for (int i=0; i<25; i++) {
			char letter = (char)('a' + Math.random ()* ('z'-'a'));
			if (i%5==0) System.out.println();
			System.out.print(letter+" ");
				
		}
	}
}
