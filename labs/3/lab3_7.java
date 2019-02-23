package lab3;

public class lab3_7 {

public static int Pent(int j) {
    
return (j * (3 * j - 1)/2);

}

public static void main(String[] args) {

System.out.println("The first 50 pentagonal numbers are :-");
    
int counter = 1;
    
for (int i = 1; i <= 50; i++) {
        
System.out.printf("%-5d",Pent(i));
        
if (counter % 10 == 0) System.out.println();
        
counter++;

}}}

