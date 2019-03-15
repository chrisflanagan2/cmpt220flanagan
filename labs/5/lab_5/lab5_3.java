package lab_5;
import java.util.Scanner;
public class lab5_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];

		System.out.println("Enter the name and score for each student:");
		for (int x = 0; x < students.length; x++) {
			System.out.print("Student " + (x + 1) + ": ");
			students[x] = input.next();
			System.out.print("Score: ");
			scores[x] = input.nextInt();
		}		
		Decreasing(students, scores);		
		for (String k: students) {
			System.out.println(k);
		}
	}
	public static void Decreasing(String[] stu, int[] numbers) {
		for (int j = 0; j < numbers.length; j++) {
			int max = numbers[j];
			int index = j;
			String temp;
			for (int n = j + 1; n < numbers.length; n++) { // JA
				if (numbers[n] > max) {
					max = numbers[j];
					index = j;
				}
			}		
			if (index != j) {	
				temp = stu[j];
				stu[j] = stu[index];
				stu[index] = temp;

				numbers[index] = numbers[j];
				numbers[j] = max;
			}
		}
	}
}

	
