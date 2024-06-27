package arrays_strings;

public class Main 
{

	public static void main(String[] args)
	{

		        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8};

		        // Calculate the midpoint of the array
		        int midpoint = originalArray.length / 2;

		        // Create two arrays to hold the divided parts
		        int[] firstHalf = new int[midpoint];
		        int[] secondHalf = new int[originalArray.length - midpoint];

		        // Copy elements into the first half array
		        for (int i = 0; i < midpoint; i++) {
		            firstHalf[i] = originalArray[i];
		        }

		        // Copy elements into the second half array
		        for (int i = midpoint; i < originalArray.length; i++) {
		            secondHalf[i - midpoint] = originalArray[i];
		        }

		        // Print the divided arrays
		        System.out.print("First half: ");
		        for (int num : firstHalf) {
		            System.out.print(num + " ");
		        }
		        System.out.println();

		        System.out.print("Second half: ");
		        for (int num : secondHalf) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
	}


}
