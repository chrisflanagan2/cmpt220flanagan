package lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArray {

    public static void sort(ArrayList<Integer> list) {
        Integer temp;
        for(int i = 0; i < list.size(); ++i) {
            for(int j = 0; j < list.size()-1; ++j) {
                if(list.get(j).compareTo(list.get(j+1)) > 0) {
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < 5; ++i) {
            list.add(in.nextInt());
        }
        System.out.println("Normal list: " + list.toString());
        sort(list);
        System.out.println("Sorted list: " + list.toString());
    }

}