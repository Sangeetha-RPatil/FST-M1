import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int expectedSum= 30;
		int[] numbers = {10, 77, 10, 54, -11, 10};
		

		//Verifying sum is equal to expected sum
		int actualSum = findTensSum(numbers, sum);
		System.out.println(verifySums(actualSum,expectedSum));
	}
	

	public static int findTensSum(int[] numbers, int sum) {
		for(int i: numbers) {
			//checking
			if(i==10) {
				sum +=i;
			}
		}
		return sum;	
	}
	
	public static boolean verifySums(int actualSum, int expectedSum) {
		return (actualSum==expectedSum);
	}
}
