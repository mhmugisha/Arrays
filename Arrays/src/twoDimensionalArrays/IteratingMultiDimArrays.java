//Example from Java, The Complete Reference 8th Edition page 100.

// Use for-each style for on a two-dimensional array.

package twoDimensionalArrays;

public class IteratingMultiDimArrays {

	public static void main(String[] args) {

		int rows = 3;
		int cols = 5;
		int sum = 0;
		int nums[][] = new int[rows][cols];
		
		// give nums some values
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				nums[i][j] = (i + 1) * (j + 1);

		// output the matrix nums	
		for(int i = 0; i < rows; i++) 
		{
			for(int j = 0; j < cols; j++)
				System.out.printf("%4d", nums[i][j]);
		System.out.println();
		}
		
// use for-each for to display and sum the values
//for-each array x of arrays of nums and in 2nd for loop, for each y of array x. 
		for (int x[] : nums) {
			for (int y : x) {
				System.out.println("Value is: " + y);
				sum += y;
			}
		}
		System.out.println("Summation: " + sum);

	}

}
