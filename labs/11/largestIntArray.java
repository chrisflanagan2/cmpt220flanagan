package extraCredit;
import java.util.Scanner;
public class largestIntArray {
	public static int getMaxVal(int arr[], int index){
        if(index == arr.length-1){
            return arr[index];
        }
        else{
            int cur = arr[index];
            int max = getMaxVal(arr,index+1);
            if(cur > max){
                return cur;
            }
            else{
                return max;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[8];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 8 values: ");
        for (int i = 0; i < 8; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Max = "+ getMaxVal(arr,0));
    }
}
