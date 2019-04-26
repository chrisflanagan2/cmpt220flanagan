package lab9;
import java.io.*;
import java.util.Scanner;

public class Removehello {
	public static void main(String[] args)throws IOException{
		Scanner findFile = new Scanner(System.in);
		String inputfile = args[1];
		String outputfile= "wordsoutput.txt";
		String str=args[0];
		File file = new File(inputfile);
		FileWriter fw = new FileWriter(outputfile);
		
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String i = input.next();
				if(!i.equals(str)) fw.write(i+"\r\n");
			}
			
			
			System.out.println(outputfile);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		
		}
	}
}