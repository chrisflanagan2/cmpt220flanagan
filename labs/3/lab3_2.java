package lab3;

import java.util.Scanner;

public class lab3_2 {
public static void main(String[] args) {

int k;
int j=1;

for(k=100; k<=500; k++) {


if( (k%5==0 && k%7!=0) || (k%5!=0 && k%7==0) ) {

if(j<=10) {                                   

System.out.print(k+" ");

j++;

}

else {

System.out.println();             

j=1;      

}}}}}

	
				
	
	



