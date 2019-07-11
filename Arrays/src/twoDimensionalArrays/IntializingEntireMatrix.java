package twoDimensionalArrays;

import java.util.Scanner;

public class IntializingEntireMatrix {
	
	static Scanner console = new Scanner(System.in);
	static final int ROWS = 5;
	static final int COLUMNS = 6;
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[ROWS][COLUMNS];

/*___________________________________________________________________*/
//This initializes every element to 12.
//		for (int row = 0; row < matrix.length; row++)
//			for (int col = 0; col < matrix[row].length; col++)
//				matrix[row][col] = 12;
/*____________________________________________________________________*/
//populating the array.		
//Note that the length of a 2 Dimensional array is the number of rows.		
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix[row].length; col++)
			{
				System.out.println("Enter element " + row +"x" + col + ":");
				matrix[row][col] = console.nextInt();
			}
/*____________________________________________________________________*/
//Printing the array.	
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[row].length; col++)
				System.out.printf("%6d", matrix[row][col]);
				System.out.println();
		}
/*_____________________________________________________________________*/		
//Checking the length of the matrix	
//Note that the length of a 2 Dimensional array is the number of rows.		

		System.out.println("Matrix Length:" + matrix.length);
	
	}
	

}
