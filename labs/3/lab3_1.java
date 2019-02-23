package lab3;

import java.util.Scanner;

public class lab3_1 {
	
public static void main(String[] args) {
	
double average=0.0;
int pos_int;
int total_sum=0;
int even_nums=0; 
int total_numbers=0 ;
       
Scanner scan = new Scanner(System.in);

System.out.println("Enter a positive integer, the input ends with a 0: ");

do {
	
pos_int = scan.nextInt();      

if(pos_int==0)                     

break;                            

even_nums++;          

total_sum =total_sum + pos_int;          

total_numbers++;                                      

}
while(true);

average = (float)total_sum/(float)total_numbers;     

System.out.println("The number of even numbers: "+even_nums);

System.out.println("The total sum: "+total_sum);

System.out.println("The average is : "+String.format ("%.2f", average));        

	}
}
