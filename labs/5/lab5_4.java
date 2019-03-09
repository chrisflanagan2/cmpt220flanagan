package lab_5;
import java.util.Scanner;
public class lab5_4 { 
	public static boolean equal(int x[], int y[]) {
        if(x == null || y == null || x.length != y.length) {
            return false;
        }
        for(int i=0; i<x.length; i++) {
            if(x[i] != y[i]) {
                return false;
            }
        }
        return true;
	}

public static void main(String args[]) {
Scanner in = new Scanner(System.in);

System.out.print("Enter the first array: ");
int n = in.nextInt();
int x[] = new int[n];
for(int i=0; i<n; i++) {
    x[i] = in.nextInt();
}
System.out.print("Enter the second array: ");
int j = in.nextInt();
int y[] = new int[n];
for(int i=0; i<j; i++) {
    y[i] = in.nextInt();
}

if(equal(x, y)) {
    System.out.println("The two array are not indentical.");
} else {
    System.out.println("The two arrays are identical.");
}
in.close();
}

}