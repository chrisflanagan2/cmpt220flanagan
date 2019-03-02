package lab4;

public class lab4_1 {
	
	public static void main (String[] args) {
	
		System.out.println(" in\tcm  | cm\tin\n ---------------------------");
		double cm=1;
		for(int in =1; in <51; in++) {
		double con =in*2.56;
		double inch = cm*.39;
		inch = Math.round(inch * 100.0)/ 100.0;
		con = Math.round(inch * 100.0)/ 100.0;
		System.out.println(in+"\t"+con+"| "+cm+"\t" +inch);
		cm+=5;
		}
	}
}