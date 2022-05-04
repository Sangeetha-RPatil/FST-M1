import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random indexGen = new Random();
		
		System.out.print("Enter the Number for List: ");
		System.out.println("(Enter E to terminate the List): ");
		
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		System.out.println(list);
		Integer nums[] = list.toArray(new Integer[0]);
		int index = indexGen.nextInt(nums.length);
        System.out.println("Index value is: " + index);
        System.out.println("Value in arary at index ["+index+"] is :"+ nums[index]);

        scan.close();
		
	}

}
