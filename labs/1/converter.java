package lab1;
import java.util.Scanner;
public class converter {

    public static void main(String[] args) {
        double ounce = 1;
        System.out.println("Enter a value for ounces: ");
        Scanner reader = new Scanner(System.in);
        ounce = reader.nextDouble();
        double OunceToGram=ounce*28.3495;
        System.out.println( ounce+ " ounces is " + OunceToGram );
        
    }
}

    

 
		
				
	
	


