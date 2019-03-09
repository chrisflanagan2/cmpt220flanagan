package lab_5;
import java.util.Scanner;
public class lab5_6 {
	public static double averageRow(double[][]array,int column) {
	int i;
	Double sum=0.0;
	for(i=0;i<array[0].length;i++) {
		sum+=array[i][0];
		}
	return (double)sum/array[0].length;
	}
	  
	   public static void main(String[] args) {
	       Scanner scan=new Scanner(System.in);
	       System.out.println("Enter the 2D array dimensions:rows= ");
	       int x=scan.nextInt();
	       System.out.println("Enter the 2D array dimensions:columns=");
	       int c=scan.nextInt();
	       double [][]arr=new double[x][c];
	       int i,j;
	       for(i=0;i<x;i++) {
	    	   for(j=0;j<x;j++) {
	    		   System.out.print("Enter element:");
	    		   arr[i][j]=scan.nextInt();
	    	   }
	       }
	       for(i=0;i<x;i++) {
	    	   for(j=0;j<c;j++) {
	    		   System.out.print(" "+arr[i][j]);
	    	   }
	    	   		System.out.println();
	       }
	       int column;
	       System.out.println("Enter the column number:");
	       column=scan.nextInt();
	       double avg=averageRow(arr,column);
	       System.out.println("Average of the matrix is "+avg);
	   }
}
