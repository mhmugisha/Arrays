
//Demonstrates how to initialize entire array/matrix to a single value.

package twoDimensionalArrays;

public class InitializingPartialArray {
	
	static final int ROWS = 5;
	static final int COLUMNS = 6;
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[ROWS][COLUMNS];
		
		//initializes one row of matrix to a given constant value.
		int row = 3;
		for (int col = 0; col < matrix[row].length; col++)
		matrix[row][col] = 6;

		//outputs matrix.
		for (int row1 = 0; row1 < matrix.length; row1++)
		{
			for (int col = 0; col < matrix[row1].length; col++)
				System.out.printf("%6d", matrix[row1][col]);
				System.out.println();
		}
	}
	

}
