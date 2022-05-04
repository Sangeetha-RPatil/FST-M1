import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomNumber = { 11, 2, 9, 5, 8, 20, 12, 6,7};
        ascendingOrderSort(randomNumber);
        System.out.println("Ascending Order of given Array: ");
        System.out.print(Arrays.toString(randomNumber));

	}

	
	public static void ascendingOrderSort(int array[]) {
        int size = array.length;
        
        for (int i = 1; i < size; i++) {
            int currentValue = array[i];
            int j = i - 1;
            
            while (j >= 0 && currentValue < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = currentValue;
        }
    }
}
