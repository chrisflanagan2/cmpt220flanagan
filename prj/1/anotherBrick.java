package another_brick_in_the_wall;
import java.util.Scanner;
public class anotherBrick {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the heiht of the wall: ");
		int height = input.nextInt();
		System.out.println("What is the width of the wall: ");
		int width = input.nextInt();
		System.out.println("How many bricks do you have: ");
		int numOfBricks = input.nextInt();
		int[] bricks = new int[numOfBricks];
		
		System.out.println("What is the length of each brick? ");
		for (int i = 0;i<bricks.length;i++) {
			int brickNum = i+1;
			System.out.println("What is the length of brick "+ brickNum+": ");
			bricks[i] = input.nextInt();
		}
		
		int i =0;//current brick
		for (int h = 0; h < height; h++) {
			int w =0;// total current width
			
			while (w+bricks[i]<=width) {
				w+= bricks[i++];
				
			}	
			if(w!= width) {
				System.out.println("NO");
				return;
				
			}	
		}
			System.out.println("YES");
		

	}

}
